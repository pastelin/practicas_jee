package challenge.baking;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.newCustomer(customerName, amount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName) {

        for(Branch branch : this.branches) {

            if(branch.getName().equals(branchName)) {
                return branch;
            }
        }

        return null;
    }

    public boolean listCustumers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            System.out.println("Customer detail for branch " + branch.getName());

            List<Customer> branchCustomers = branch.getCustomers();

            for(int i = 0; i < branchCustomers.size(); i++) {

                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");

                if(showTransactions) {

                    System.out.println("Transactions");
                    List<Double> transactions = branchCustomer.getTransactions();

                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + ( j + 1) + "] Amount " + transactions.get(j));
                    }

                }

            }
            return true;
        } else {
            return false;
        }
    }


}

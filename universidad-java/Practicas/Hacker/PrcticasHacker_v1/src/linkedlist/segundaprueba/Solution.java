package linkedlist.segundaprueba;

import java.util.*;

/**
 * STDIN   Function
-----   --------
4       T = 4
2       first data = 2
3
4
1       fourth data = 1
 */
class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {

    public static  Node insert(Node head,int data) {
        
        Node currentNode = head;
        Node temporalNode = new Node(data);
        
        if (currentNode == null) {
            return temporalNode;
        }
        
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = temporalNode;
        
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
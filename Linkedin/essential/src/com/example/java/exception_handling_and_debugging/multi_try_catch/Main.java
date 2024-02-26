package com.example.java.exception_handling_and_debugging.multi_try_catch;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {

            if (chars.length < 10) {
                throw (new Exception("My custom message"));
            }

            char lastChar = chars[chars.length -1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

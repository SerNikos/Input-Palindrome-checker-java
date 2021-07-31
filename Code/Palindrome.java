/*
Να κατασκευάσετε ένα πρόγραμμα κονσόλας Palindrome.java που ελέγχει εάν η συμβολοσειρά
που εισήγαγε ο χρήστης είναι παλίνδρομο. Θα χρησιμοποιήσετε μεθόδους του αντικειμένου SC που
δημιουργήσατε στην προηγούμενη άσκηση.
*/


import java.util.Scanner;
class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        SC stack = new SC();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.EmptyStack()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}



class SC {

    public SC(String a[]) {

    }

    //Array and size of characters
    private char[] elements;
    private int size;

    //Default Contructor of SC
    public SC() {
        size = 0;
        //array of 12 elements at begining
        elements = new char[12];
    }

    //Checking if stack empty
    public boolean EmptyStack() {
        if (size == 0)
            return true;
        else
            return false;
    }

    //Cheking if stack full
    public boolean FullStack() {
        if (size == elements.length)
            return true;
        else
            return false;
    }

    //Adding characters method to stack
    public void push(char item) {
        //Resize(size + 1);
        if (!FullStack()) {

            elements[size] = item;
            size++;
        } else {
            System.out.println("Cannot add more characters stack full! ");
        }
    }


    //Peeking top of Stack
    public char peek() {
        if (EmptyStack()) {
            System.out.println("Empty stack!");
            return 0;
        } else {

            return elements[size - 1];
        }
    }

    //Popping character from Stack
    public char pop() {
        if (EmptyStack()) {

            return 0;
        } else {

            return elements[--size];
        }
    }

}

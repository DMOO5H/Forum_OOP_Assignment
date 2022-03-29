import java.util.Scanner;

class PrintArray {
    public static void main(String[] args) {

        int numItems;//Declares the Variables
        int[] items;//Declares the Array

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number of Items (>-1): ");//Demands User Input
        numItems = in.nextInt();

        items = new int[numItems];
        System.out.print("Enter value of all items (seperated by space): ");
        for (int i = 0; i < items.length; i++){
            items[i] = in.nextInt();
        }
        System.out.print("The values are: [");//Prints Out Array
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);
            if (i != items.length-1) {// Creates an indentation in Between
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
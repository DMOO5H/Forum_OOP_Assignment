import java.util.Scanner;

public class printArrayInStars{
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number of Items (>-1): ");//Demands User Input
        int numItems = in.nextInt();

        int[] items = new int[numItems];
        System.out.println("Enter value of all items (separated by space): ");

        for (int i = 0; i < items.length; i++) {
            items[i] = in.nextInt();
        }

        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < items[i]; j++) {
                System.out.print("*");
            }
            System.out.println("(" + items[i] + ")");
        }
    }
}
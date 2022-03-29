import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int Students = in.nextInt();
        int[] grades = new int[Students];

        float sum = 0;
        int max = 0;
        int min = 0;

        for(int i = 0; i < Students; i++){
            System.out.print("Enter Grade of Student "+ (i + 1) + ": ");
            grades[i] = in.nextInt();
            sum = sum + grades[i];

            if (grades[i] > max) max = grades [i];
            if (i==0) min = grades[i];
            if (grades[i] < min) min = grades[i];
        }

        System.out.println("Average of Grades = " + (sum/Students));
        System.out.println("Maximum Grade is = " + max);
        System.out.println("Minimum Grade is = " + min);
    }
}
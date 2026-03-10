import java.util.Scanner;

public class W34_L3_prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year >= 1582) {
            boolean isLeap;
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else if (year % 4 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }

            if (isLeap) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Result using logical operators: Leap Year");
            } else {
                System.out.println("Result using logical operators: Not a Leap Year");
            }

        } else {
            System.out.println("Invalid year. Please enter a year 1582 or greater.");
        }

        input.close();
    }
}

import java.util.Scanner;

public class L3_prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("Enter temperature in Celsius (or type -999 to quit): ");
            double celsius = input.nextDouble();

            if (celsius == -999) {
                continueCalculating = false;
                System.out.println("Program terminated.");
            } else {
                double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;
                System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
            }
        }
        input.close();
    }
}

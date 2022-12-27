import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 27.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double number;
        double result = 0.0;

        System.out.print("Enter a number :");
        number = inp.nextInt();

        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("Result :" + result);

    }
}
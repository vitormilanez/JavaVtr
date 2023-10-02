import java.util.Scanner;

public class Day1_SimpleCalculator2 {

    public static void main(String[] args) {

        Scanner InterageUser = new Scanner(System.in);

        System.out.print("Send to me a nice Number:  ");
        int firstNumber = InterageUser.nextInt();

        System.out.print("The secound now: ");
        int socondOne = InterageUser.nextInt();

        System.out.println("The result is = " + (firstNumber + socondOne));

    }
}

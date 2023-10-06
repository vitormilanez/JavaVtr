package Day_1;

import java.util.Scanner;

public class Day1_SimpleCalculator {

    public static void main (String[] args){
        Scanner calculatorScanner =new Scanner(System.in);

        System.out.print("Write one number: ");
        double primeiroNumero = calculatorScanner.nextDouble();

        System.out.print("Another one: ");
        double segundoNumero = calculatorScanner.nextDouble();

        System.out.print("the result is = " + (primeiroNumero + segundoNumero));
    }
}


package Projetos;

import java.util.Scanner;

public class Projeto_Dia3 {
    public static void main(String[] args) {

        System.out.println("Digite um numero");
        Scanner digiteUmNum = new Scanner(System.in);

        int num = digiteUmNum.nextInt();

            if (num <= 9) {
                System.out.println("esse numero tem um digito");
            }
            else if (num >= 10 && num <= 99) {
                System.out.println("esse numero tem 2 digitos");
            }
            else if (num >= 100 && num <= 999) {
                System.out.println("esse numero tem 3 digitos");
            }
            else if (num >= 1000 && num <= 9999) {
                System.out.println("esse numero tem 4 digitos");
            }
            else System.out.println("esse numero tem 5 ou mais digitos");


        }
    }


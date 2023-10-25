package Day_4;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        //Coletar nome do produto
        System.out.println("digite o nome do produto: ");
        Scanner s = new Scanner(System.in);

        String nomeDoProduto = s.next().toLowerCase() ;


        // Retornar o valor do produto

        switch (nomeDoProduto){

            case "banana":
                System.out.println("9,50");
                break;

            case  "manga":
                System.out.println("15.60");
                break;

            case  "abacate":
                System.out.println("15.8");

        }

    }
}

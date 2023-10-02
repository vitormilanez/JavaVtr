import java.util.Scanner;

public class Day1_Main_initial {
    public static void main(String[] args) {

        byte minhaIdade = 38;
        int salarioMensal = 50_000;
        byte ate127Bytes = 127;
        long indadeMillisegundos = 788_400_000_000L;
        char initial = 'v';
        boolean eMaiorDeIdade = true;
        String firstName = "Vitor" + " Milanez";
        System.out.println(firstName.toUpperCase());
    }

    public static void interagir(String[] args){
        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("digite a sua idade: ");
        byte idadeCliente = idadeScanner.nextByte();

        System.out.println(idadeCliente);
    }
}
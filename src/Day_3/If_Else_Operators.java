package Day_3;

public class If_Else_Operators {
    public static void main(String[] args) {

        int valorDoCarro = 92_000;
        if (valorDoCarro >=100_001)
        System.out.println("Nao Compra que ta caro");

        else if (valorDoCarro <= 100_000 && valorDoCarro >= 90_000)
        System.out.println("valor dentro do esperado");

        else System.out.println("valor Muito abaixo");

    }



}

package Day_3;

public class OR_logicOperators {
    public static void main(String[] args) {

        int idade = 18;
        boolean temEmprego = false;
        boolean temEmpresa = true;
        boolean temNomeLimpo = true;
        boolean tem100kDeEntrada = true;
        boolean idadeTemMaisDe18 = idade >= 18;
        boolean podeFinanciar = (temEmprego || temEmpresa) && temNomeLimpo && idadeTemMaisDe18 && tem100kDeEntrada;

        System.out.println(podeFinanciar);

    }
}
/*
Operador OR Ele serve para ser uma coisa ou outra = Sinal ||
 */
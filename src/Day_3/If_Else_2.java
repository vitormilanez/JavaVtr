package Day_3;

import java.text.NumberFormat;

public class If_Else_2 {
    public static void main(String[] args) {
        NumberFormat myMoney = NumberFormat.getCurrencyInstance();
        int precoIphone = 7000;
        if (precoIphone <= 5_000 && precoIphone >= 4_000)
            System.out.print("O preço do celular é:  \n"  + myMoney.format(precoIphone)+ "= Compra ^ ^");
        else if (precoIphone >= 5_001)
            System.out.print("O oreço do celular é: \n" + myMoney.format(precoIphone) + "= Ta caro demais");
        else System.out.print("O oreço do celular é: \n" + myMoney.format(precoIphone) +"= Ta barato demais, é golpe");
    }

}

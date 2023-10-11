package Day_3;

import java.text.NumberFormat;

public class Formating_Java_Numbers {
    public static void main(String[] args) {
        NumberFormat myMoney = NumberFormat.getCurrencyInstance();
        String productValue = myMoney.format(1120.80);

        System.out.println(productValue);

    }
}

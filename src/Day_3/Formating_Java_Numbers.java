package Day_3;

import java.text.NumberFormat;

public class Formating_Java_Numbers {
    public static void main(String[] args) {
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        String productValue = pound.format(1120.80);

        System.out.println(productValue);

    }
}

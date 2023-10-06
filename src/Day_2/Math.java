package Day_2;

public class Math {
    public static void main(String[] args) {
        double value = java.lang.Math.round(10.2);
        double valueceil = java.lang.Math.round(java.lang.Math.ceil(10.2));
        double valuefloor = java.lang.Math.round(java.lang.Math.floor(10.2));
        double valueRamdom = java.lang.Math.round(java.lang.Math.random() * 100);
        int valueRamdomInt = (int) java.lang.Math.round(java.lang.Math.random() * 100);

        System.out.println(value);
        System.out.println(valueceil);
        System.out.println(valuefloor);
        System.out.println(valueRamdom);
        System.out.println(valueRamdomInt);

    }
}

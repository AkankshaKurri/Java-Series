public class TypeConversion {
    public static void main(String[] args) {
        //Implicit Conversion
        long big = 45;
        System.out.println(big);
        float dec = 3;
        System.out.println(dec);
        double d = 3.4f;
        System.out.println(d);
        float myFloat = 5;
        System.out.println(myFloat);

        //Explicit Conversion
        float eDec = (float) 3.4;
        System.out.println(eDec);
        long eBig = (long) 3.4f;
        System.out.println(eBig);
        int eInt = (int) 3.4;
        System.out.println(eInt);
        int myInt = (int) 5.45f;
        System.out.println(myInt);
    }
}
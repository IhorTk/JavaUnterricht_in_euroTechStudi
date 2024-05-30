package Day_29_Wrappes_Class;

public class day29_klasrab {
    public static void main(String[] args) {
        int a =10;// Integer
        double d = 10.0;// Double
        boolean b;// Boolean
        short s;//Short
        byte b1;// Byte
        float f;//Float
        long l;//Long
        char c;// Character

//        String st = "12345";
//        System.out.println(st);
//        System.out.println(st.getClass());
//        int ih = Integer.parseInt(st);
//        System.out.println(ih);
////        System.out.println(st.getClass(ih));
//
//        Integer integer = 1;
//        Integer integer1 = new Integer("1");
//        System.out.println(integer1);
//
//
//        Integer obj = Integer.valueOf(2);
//        Integer obj1 = Integer.valueOf("2");


        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isDigit('d'));
        System.out.println(Character.isLetter('5'));

        Integer aObj = Integer.valueOf(23);
        int aObj1 = aObj.intValue();
        System.out.println(aObj1);


        Double dObj = Double.valueOf(23.0);
        double dObj1 = dObj.doubleValue();
        System.out.println(dObj1);

        int i30 = 10;
        Integer integer30 = i30;
        System.out.println(integer30);

        Short sh10 = Short.valueOf((short) 10.5f);
        short sh11 = sh10;
        System.out.println(sh11);



    }


}

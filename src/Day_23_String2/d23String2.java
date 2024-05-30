package Day_23_String2;

public class d23String2 {
    public static void main(String[] args) {
        // concat
        String firstName = "John";
        String lName = "  Doe";
        String concat = firstName.concat(lName);
        System.out.println(concat);

        System.out.println(firstName+ " "+ lName);

        //Иммутабельный класс String
        // ключевое слово final
        final int num = 10;
        System.out.println(num);

        String mystr1 = "Hello";
        String mystr2 = mystr1.concat("  World");
        System.out.println(mystr1);
        System.out.println(mystr2);

        // contains()

        String mystr = "Hallo";
        System.out.println(mystr.contains("Hal")); //true
        System.out.println(mystr.contains("e")); // false

        // indexOf()
        String myd = "Привет земляне";
        int planet = myd.indexOf("земляне");
        System.out.println(myd.indexOf("земляне"));
        System.out.println(planet);

        //replace()

        String str = new String("Site eurotechstudy.com,   jkhjkhkjh.com");
        System.out.println(str);
        System.out.println(str.replace("com", "net"));
        System.out.println(str.replaceFirst("com", "net"));
        System.out.println(str);

        // equals

        // substring(int startIndex)
        // substring(int startIndex, )
        String st88 = "  Hello World  ";
        System.out.println(st88.substring(3));
        System.out.println(st88.substring(0,6));

        //toLowerCase

        System.out.println(st88.toLowerCase());
        //toUpperCase
        System.out.println(st88.toUpperCase());
        //
        System.out.println(st88);
        System.out.println(st88.trim());




    }

}

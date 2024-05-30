package Day_43_Modifiers.nestedAndInnerClass;

public class NestedLesson {
    static private int var1;
    private String str1="Переменная верхнего класса";

    //Вложенный класс(статический внутренний класс) / Nested class / Может иметь любой модификатор доступа
    public static class NestedClass {
        private double x1;
        String st;

        void nestedMethod() {
            System.out.println(var1);
        }
    }

    // Внутренний класс / Inner class / Может иметь любой модификатор доступа
    class InnerClass {
        int a = 100;
        static String b = "Inner Class";

        void innerMethod(){
            System.out.println(str1);
        }

    }

    void outerMethod() {
        System.out.println(var1);

    }

    static void outerStaticMethod() {
        System.out.println(var1);
    }

}

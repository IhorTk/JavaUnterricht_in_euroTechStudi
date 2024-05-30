package Day_50_Polymorphizm2;

class Parent {
    int value = 11;
    Parent(){
        value %=2;
    }
    public void print(){
        System.out.println("Parent");
    }

    public int getValue() {
        return this.value;
    }
     public static void printStatic(){
         System.out.println("Walue in Parent class with static metod");
     }
}
class Child extends Parent{
    int value = 11;
    Child(){
        value *=2;
    }

    @Override
    public void print() {
        System.out.println("Child");
    }

    @Override
    public int getValue() {
        return value;
    }

    public static void printStatic(){
        System.out.println("Walue in Child class with static metod");
    }
}

class InheritanceTest{
    public static void main(String[] args) {
        Parent child = new Child();
        Parent.printStatic();
        child.printStatic();
        child.print();
        System.out.println("child.value = " + child.value);
        System.out.println("child.getValue() = " + child.getValue());
        System.out.println("child.getClass() = " + child.getClass());
        System.out.println("=====================");

        Child child1 = new Child();
        Child.printStatic();
        child1.printStatic();
        child1.print();
        System.out.println("child1.value = " + child1.value);
        System.out.println("child1.getClass() = " + child1.getClass());
        System.out.println("=====================");
        Parent parent = new Parent();
        parent.print();
        System.out.println("parent.getValue() = " + parent.getValue());
        System.out.println("parent.getClass() = " + parent.getClass());


//        Parent obj = new Child();
//        obj.print();
//        System.out.println(" "+ obj.value );
//        System.out.println(obj.getClass());
//        System.out.println("Value is " + obj.getValue());
//        System.out.println("======================");
//
//        Child obj1 = new Child();
//        obj1.print();
//        System.out.println(" "+ obj1.value);
//        System.out.println(obj1.getClass());
//        System.out.println("Value is " + obj1.getValue());
//        System.out.println("======================");
//
//        Parent obj2 = new Parent();
//        obj2.print();
//        System.out.println("  " + obj2.value);
//        System.out.println(obj2.getClass());
//        System.out.println("Value is " + obj2.getValue());
    }
}

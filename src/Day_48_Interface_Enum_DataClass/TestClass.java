package Day_48_Interface_Enum_DataClass;

public class TestClass implements TestInterfase{
    @Override
    public void testMetod() {
        System.out.println("TestClassMetod");
        System.out.println("TestInterfase.INTNUM1 = " + TestInterfase.INTNUM);
    }
}

package Day_48_Interface_Enum_DataClass;

import java.util.ArrayList;
import java.util.List;

public class IntefaseMain {
    public static void main(String[] args) {
        TestInterfase testClass = new TestClass();
        testClass.testMetod();
        System.out.println("TestInterfase.INTNUM = " + TestInterfase.INTNUM);

        TestInterfase testClass2 = new TestClass();
        testClass.testMetod();

        List<TestInterfase> list = new ArrayList<>();
        list.add(testClass);
        list.add(testClass2);

        for (TestInterfase obj: list){
            obj.testMetod();
        }
    }

}

package Day_43_Modifiers.nestedAndInnerClass;
import java.util.Map;
import java.util.HashMap;

public class NestedMain {
    public static void main(String[] args) {
//        NestedLesson.NestedClass nestedClass=new NestedLesson.NestedClass();
//        System.out.println("nestedClass.x1  ="+nestedClass.x1);
//        System.out.println("nestedClass.st  ="+nestedClass.st);
//        nestedClass.nestedMetod();
//    }

        NestedLesson nestedLesson = new NestedLesson();
        NestedLesson.InnerClass innerClass = nestedLesson.new InnerClass();
        System.out.println("innerClass.a = " + innerClass.a);
        System.out.println("innerClass.b = " + innerClass.b);
        innerClass.innerMethod();

        Map<Integer, String> map = new HashMap<>();
    }
}

package Day_48_Interface_Enum_DataClass;

import java.util.Arrays;

public class Book {
    public static final String JAVA1 = "Beginner for Java";
    public static final String C = "Beginner for C";
    public static final String PYTHON = "Beginner for Python";

    public static void main(String[] args) {
       String java = Book.JAVA1;
       String[] bookC = {Book.JAVA1, Book.C, Book.PYTHON};
       Books java1 = Books.JAVA;

       Books[] values = Books.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Books book: values){
            System.out.println("book = " + book);
        }
    }
}

package Day_51_Errors_Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinalyExample {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("D:\\Java Practik\\F300120241\\src\\Day_51_Errors_Exception\\1.txt"));
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }finally {
            try {
                reader.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }

    }
}

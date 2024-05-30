package Day_51_Errors_Exception;


public class NullPointException {
    public static void main(String[] args) {

      Person51 person = null;

        if (person != null) {
            personMethod(person);
        } else {
            System.out.println(" Person ist null");
        }
    }

    static void personMethod(Person51 person){
        try {
            System.out.println(person.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

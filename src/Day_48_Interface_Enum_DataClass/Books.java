package Day_48_Interface_Enum_DataClass;

public enum Books{
    JAVA("Java for Beginner", "1990"),
    C("C for Beginner","1995"),
    PYTHON("Python for Beginner","2000");

    private final String booksName;
    private final String yearOfPublished;

    Books(String booksName, String yearOfPublished) {
        this.booksName = booksName;
        this.yearOfPublished = yearOfPublished;
    }

    public String getBooksName() {
        return booksName;
    }

    public String getYearOfPublished() {
        return yearOfPublished;
    }

    public static void main(String[] args) {
        System.out.println("Books.JAVA = " + Books.JAVA);

        System.out.println("Books.JAVA.yearOfPublished = " + Books.JAVA.yearOfPublished);
        System.out.println("Books.JAVA.booksName = " + Books.JAVA.booksName);

        Books python = Books.PYTHON;
        switch (python){
            case PYTHON:
                System.out.println(Books.PYTHON);
                break;
            case C:
                System.out.println(Books.C);
                break;
            case JAVA:
                System.out.println(Books.JAVA);
                break;
            default:
                System.out.println("No");

        }

    }
}

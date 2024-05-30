package Day_50_Polymorphizm2.MessageP;

public class PolymorphismExample {
    //Метод которые принимает Message и выводит содержимое
    public static void printMessageContent(Message message){
        System.out.println("Текст сообщения:  " + message.getContent());
    }
    //Main method
    public static void main(String[] args) {
        Message logMessage = new LogMessage("Это сообщение в логах");
        Message errorMessage = new ErrorMessage("Это сообщение об ошибке");
        // Непосредственно полиморфизм: работает с разными классами как с одним
        printMessageContent(logMessage);
        printMessageContent(errorMessage);

    }

}

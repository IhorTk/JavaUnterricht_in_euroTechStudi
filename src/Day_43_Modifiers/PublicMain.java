package Day_43_Modifiers;

public class PublicMain extends PublicClass{
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        System.out.println("publicClass.publicVar  = " + publicClass.publicVar);
        publicClass.publicMetod();

        System.out.println("publicClass.protectedVar  =" + publicClass.protectedVar);
        publicClass.protectedMetod();

        System.out.println("publicClass.defaultVar  = " + publicClass.defaultVar);
        publicClass.defaultMetod();

        PublicMain publicMain = new PublicMain();
        System.out.println("publicMain.protectedVar  = " + publicMain.protectedVar);



    }
}

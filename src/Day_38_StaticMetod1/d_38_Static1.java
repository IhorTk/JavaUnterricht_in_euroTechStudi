package Day_38_StaticMetod1;


public class d_38_Static1 {
    public static int instanceCount = 0;

    public d_38_Static1(){
        instanceCount++;
    }

    public static void main(String[] args) {
        d_38_Static1 ggg =new d_38_Static1();
        d_38_Static1 ggg1 =new d_38_Static1();
        d_38_Static1 ggg2 =new d_38_Static1();
        System.out.println(d_38_Static1.instanceCount);
    }
}

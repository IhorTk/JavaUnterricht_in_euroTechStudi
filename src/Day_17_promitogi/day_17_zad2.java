package Day_17_promitogi;

public class day_17_zad2 {
    public static void main(String[] args) {
        System.out.println(Summa_chisel_chisla(896279));

    }
    public static int Summa_chisel_chisla(int chislo){
        int itog = 0;
        while (chislo>0) {
            int prom = chislo % 10;
            chislo/=10;
            itog = itog+prom;
        }
        return itog;
    }
}

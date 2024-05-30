package Hausaufgabe;

public class Dom {
    static int countHaus =1;
    private int count;
    private int room;
    private double leht;
    private  double weit;
    private  double hoch;
    private String adresse;

    public Dom(String adresse, double hoch, double leht, int room, double weit) {
        this.adresse = adresse;
        this.hoch = hoch;
        this.leht = leht;
        this.room = room;
        this.weit = weit;
        count = 0;
    }

    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        count = countHaus;
        countHaus++;

    }
    public static int getCountHaus() {
        return countHaus;
    }


    public String getAdresse() {
        return adresse;
    }



    public double getHoch() {
        return hoch;
    }

    public double getLeht() {
        return leht;
    }

    public int getRoom() {
        return room;
    }

    public double getWeit() {
        return weit;
    }


    @Override
    public String toString() {
        return "Dom{" +
                "adresse='" + adresse + '\'' +
                ", room=" + room +
                ", leht=" + leht +
                ", weit=" + weit +
                ", hoch=" + hoch +
                '}';
    }
}

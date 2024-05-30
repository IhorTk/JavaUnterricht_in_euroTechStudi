package Day_19_bibl_und_pac;

public class StatCalkulator {
    public int count;
    public double max = -Double.MAX_VALUE;
    public double min = Double.MAX_VALUE;
    public double sum;

    public void enter(double item){
        count ++;
        sum = sum + item;
        if (item > max){
            max = item;
        }
        if (item < min){
            min = item;
        }
    }

    public double getSum(){
        return sum;
    }
    public double getMax(){
        return max;
    }
    public double getMin(){
        return min;
    }
    public double getAverage(){
        return sum / count;
    }
    public int getCount(){
        return count;
    }
}
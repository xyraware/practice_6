import java.util.Random;

public class Fahrenheit implements Convertable{
    double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        String s=String.format("%5.2f%20s",getA(),"по фаренгейту (F)");
        return s;
    }

    @Override
    public double convert(char convertTo) {
        double buff=0.00;
        if (convertTo == 'C') {
            buff= ((this.a*0.1 - 32*0.1)/(5/9))*10;
        }
        if (convertTo == 'K') {
            buff= (this.a + 459.00)/1.8;
        }
        return buff;
    }

}

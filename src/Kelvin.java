
public class Kelvin implements Convertable{
    double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    @Override
    public String toString() {
        String s=String.format("%5.2f%20s",getA(),"по кельвину (K)");
        return s;
    }
    @Override
    public double convert(char convertTo) {
        double buff=0.00;
        if (convertTo == 'C') {
            buff=this.a-273.15 ;
        }
        if (convertTo == 'F') {
            buff= this.a*1.8-459.67;
        }
        return buff;
    }
}

public class Celsius implements Convertable {
    double a;

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        String s= String.format("%5.2f%20s", this.a, "по цельсию (C)");
        return s;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double convert(char convertTo) {
        double buf=0.00;
        if (convertTo == 'F') {
            buf = 1.8 * this.a + 32;
        }
        if (convertTo == 'K') {
            buf = this.a + 273.15;
        }
        return buf;
    }
}

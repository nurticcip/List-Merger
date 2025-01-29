public class Complex {
    private double r;
    private double i;

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getReal(){
        return r;
    }

    public double getImaginary(){
        return i;
    }

    public Complex add(Complex a){
        double real = this.r + a.r;
        double imag = this.i + a.i;
//        Complex c = new Complex(real,imag);
//        return c;

        return new Complex(real,imag);
    }

    public Complex sub(Complex a){
        double real = this.r - a.r;
        double imag = this.i - a.i;
        return new Complex(real,imag);
    }
}

class TestComplex{
    public static void main(String[] args) {
        Complex a = new Complex(1.33,4.64);
        Complex b = new Complex(3.18,2.74);
        Complex c = a.add(b);

        System.out.println("c=a+b=" + c.getReal()
                + " " + c.getImaginary());

        Complex d = c.sub(a);
        System.out.println("d=c-a=" + d.getReal()
                + " " + d.getImaginary());

    }
}

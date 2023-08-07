package Exercise13_17;

public class Complex implements Cloneable, Comparable<Complex>{
    private double a;
    private double b;

    public Complex(){
        a = 0;
        b = 0;
    }

    public Complex(double a){
        this.a = a;
        b = 0;
    }

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getRealPart(){
        return a;
    }

    public double getImaginaryPart(){
        return b;
    }

    public Complex add(Complex complex){
        return new Complex(a + complex.a, b + complex.b);
    }

    public Complex subtract(Complex complex){
        return new Complex(a - complex.a, b - complex.b);
    }

    public Complex multiply(Complex complex){
        return new Complex((a * complex.a - b * complex.b), (b * complex.a + a * complex.b));
    }

    public Complex divide(Complex complex){
        return new Complex((a * complex.a + b * complex.b) /
                (Math.pow(complex.a, 2) + Math.pow(complex.b, 2)),
                (b * complex.a - a * complex.b) / (Math.pow(complex.a, 2) +  Math.pow(complex.b, 2)));
    }

    public double abs(){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }

    @Override
    public int compareTo(Complex o) {

        if (abs() < o.abs()){
            return -1;
        }
        else if (abs() == o.abs()){
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
    }
}

public class question2a{
    public static double compoundinterest(double p, double rate, double t){
        return Math.pow(1+rate,t)*p;
    }
    public static void main(String [] args){
        double a=500000;
        double b=0.18;
        double c=3;
        double compoundint= compoundinterest(a, b, c);
        System.out.println(+compoundint);
    }
}
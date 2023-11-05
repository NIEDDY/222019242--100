public class question1a{//define class
    public static double simpleinterest(Double p, double t, double r){
        return p*r*t;//class declaration
    }
    public static void main(String [] args){
        double p=100000;//calling class
        double r=0.05;
        double t=5;
        double amount= simpleinterest(p,r,t);
        System.out.println(+amount);
    }
}
class loanamount{
    public static double amount(double p, double r, double t){
        return Math.pow(1+r,t)*p;
    }
}
public class question2b{
    public static void main(String [] args){
        loanamount myloanamount= new loanamount();
        double result= myloanamount.amount(500000, 0.18, 3);
        System.out.println(+result);
    }
}
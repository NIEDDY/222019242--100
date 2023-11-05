//java program which demonstrate the use of if-else statement
//the program displays who's satisified among four employees(a, b, c, or d)
public class livingstandard{
    public static void main(String args[]){
        //declaration of variables
        int a=100;
        int b=150;
        int c=200;
        int d=250;
        if(a>b)
        {
            System.out.println("a is satisified");
        }
        else if(b>c)
        {
            System.out.println("b is satisified");
        }
        else if(c>d)
        {
            System.out.println("c is satisified");
        }
        else{
            System.out.println("only d is satisified");
        }
    }
}
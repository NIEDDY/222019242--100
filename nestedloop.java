public class nestedloop{
    public static void main(String args[]){
        int p = 7;
        for (int i = 1; i <= p; i++){
            for (int j= 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
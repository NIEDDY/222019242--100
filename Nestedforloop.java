public class Nestedforloop{
    public static void main(String[] args) {
        int p = 5;

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("Q ");
            }
            System.out.println();
        }
    }
}

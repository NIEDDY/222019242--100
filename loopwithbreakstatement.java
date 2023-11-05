//java program which demonstarates the use of breakstatement with loops
//the program displays the province of Rwanda
public class loopwithbreakstatement{
    public static void main(String[] args) {
        String[] provinces = {"Kigali City", "Northern Province", "Southern Province", "Eastern Province", "Western Province"};
//declaration of variables
        int i = 0;
        while (i < provinces.length) {
            System.out.println("Province: " + provinces[i]);
            i++;
//using while loop
        
            if (i == 1) {
                break;
                //breaking 
            }
        }
    }
}

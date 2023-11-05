//java program which displays days of the week from monday to sunday
public class daysoftheweek{
    public static void main(String[] args) {
        int day = 1; 

        while (day <= 7) {
            String dayOfWeek = getDayOfWeek(day);
            System.out.println("Day " + day + ": " + dayOfWeek);
            day++;
        }//using while loop to display output
    }

    public static String getDayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }
}

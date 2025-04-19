package Week3;
import java.util.Calendar;
import java.util.Date;

public class LibraryPackages {
    public static void main(String[] args) {

        Date date = new Date();
        String stringDate = date.toString();
        System.out.println(stringDate.toUpperCase());

        System.out.println();

        AddDaysExample();
    }

    //Adds days to a date. Needs java.util.Calendar
    private static void AddDaysExample() {
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Adding 5 days

        Date newDate = calendar.getTime();
        System.out.println("New Date: " + newDate);
    }
}

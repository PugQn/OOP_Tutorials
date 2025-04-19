package Week2;

public class ArrayForLoopExample {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] rainfall = {74, 81, 86, 93, 100, 116, 126, 111, 93, 80, 84, 91};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + ": " + rainfall[i] + "mm.");
        }
    }
}

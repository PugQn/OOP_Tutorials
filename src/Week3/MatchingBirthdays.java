package Week3;

public class MatchingBirthdays {
    public static void main(String[] args) {

        //Track each of the days of the year and if they have been seen before
        boolean[] used = new boolean[365];

        //Tack the number of duplicate birthdays
        int duplicateCount = 0;

        //Track the number of people looked at
        int peopleCount = 0;

        //We are looking for the number of
        //while (duplicateCount < 2) {        //Question 1
        // while (duplicateCount < 3) {     //Question 2
        //while (peopleCount < 366) {       //Question 3
        while (duplicateCount < 365) {        //Question 4
                peopleCount++;
            int birthday = (int) (Math.random() * 365);
            if (!used[birthday]) {
                used[birthday] = true;
                System.out.println("Person " + peopleCount + " has birthday " + birthday);
                continue;
            }
            System.out.println("Person " + peopleCount + " has a duplicate birthday: " + birthday);
            duplicateCount++;
        }

        System.out.println("People: " + peopleCount);

        double chance = (double) duplicateCount / (double) peopleCount;

        String formattedValue = String.format("%.2f", chance);

        System.out.println("Chances of " + duplicateCount + " duplicate birthdays are " + formattedValue);
    }
}

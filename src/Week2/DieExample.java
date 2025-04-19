package Week2;

public class DieExample {
    public static void main(String[] args) {

        //Produces a random number from 1 to 6

        double randomNumber = Math.random();
        randomNumber *= 6;
        randomNumber ++;

        int dieValue = (int) randomNumber;
        System.out.println("Your value is " + dieValue);

        switch (dieValue){
            case 1:
                System.out.println("Do jumping jacks");
                break;
            case 2:
                System.out.println("Do push ups");
                break;
            case 3:
                System.out.println("Do pull ups");
                break;
            case 4:
                System.out.println("Do lat curls");
                break;
            case 5:
                System.out.println("Do leg curls");
                break;
            case 6:
                System.out.println("Rest");
                break;
            default:
                break;

                
        }
    }
}

package Week2;

public class Main {
    public static void main(String[] args) {

        //Task 1: Question 2
        for (int i = 1; i <= 12; i ++) {
            System.out.print( (i * 3) + " ");
        }
        System.out.println();

        //Task 1: Question 3
        int [] numbers= {42, 0, 0, 2, 42, 42};
        int count42 = 0;
        for (int number : numbers) {
            if (number == 42) {
                count42++;
            }
        }
        System.out.println(count42);

        //Task 2
        int var = 99;
        System.out.println("The value of var is " + var);

        String greeting = "Hello";
        String message = greeting + ", Mr Spud";
        System.out.println(message);
        System.out.println();

        //These will be concatenated as char values. Without the quotations it will look for a var
        System.out.println('a'+'b');
        System.out.println();

        //So long as one value is a string the rest will be concatenated as a string
        System.out.println("a"+'b'+'c');
        System.out.println('a'+"b"+'c');
        System.out.println("a"+'b'+"c");
        System.out.println();
        System.out.println();

        //Task 3
        int[] intArray = {3, 4, 6};

        //BEDMAS will produce 9: 3 + 4 + (6 / 3)
        int mean1 = intArray[0] + intArray[1] + intArray[2] / 3;
        System.out.println(mean1);

        //Will produce correct result less the remainder
        int mean2 = (intArray[0] + intArray[1] + intArray[2])/3;
        System.out.println(mean2);

        //Will produce int value as division is by int
        double mean3 = (intArray[0] + intArray[1] + intArray[2])/3;
        System.out.println(mean3);

        //Produces correct result (make sure to use double for division)
        double mean4 = (intArray[0] + intArray[1] + intArray[2])/3.0;
        System.out.println(mean4);

        //Will produce int value as division is by int
        double mean5 = (intArray[0] + intArray[1] + intArray[2])/intArray.length;
        System.out.println(mean5);

        //Casting the first value as double ensures that the entire expression is evaluated using floating-point arithmetic rather than integer arithmetic
        double mean6 = ((double)intArray[0] + intArray[1] + intArray[2])/intArray.length;
        System.out.println(mean6);

        System.out.println();
        System.out.println();

    }
}

package Week3;

public class StringBuilders {
    public static void main(String[] args) {
        String a = "hello world";
        String b = "HOW DO YOU DO";
        StringBuilder c = new StringBuilder(a.toUpperCase());
        c.append(b);
        System.out.println(c);
    }
}

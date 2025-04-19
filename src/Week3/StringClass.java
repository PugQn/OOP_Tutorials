package Week3;

public class StringClass {
    public static void main(String[] args) {
        String HTMLString = "<!DOCTYPE html><html><head><title>My HTML Page</title></head><body><h1>Welcome to my page</h1><p>This page " +
                "is written in simple HTML<p><p>Since HTML files are just text markup, they can be contained in Java String objects</p></body></html>";

        System.out.println("String length: " + HTMLString.length());

        System.out.println("Has level 1 headings: " + HTMLString.contains("<h1>"));
        System.out.println("Has level 2 headings: " + HTMLString.contains("<h2>"));
        System.out.println("Has a Doctype: " + HTMLString.contains("<!DOCTYPE>"));
        System.out.println("Position of the '!': " + HTMLString.indexOf('!'));
        System.out.println("Body Content: " + HTMLString);
    }
}

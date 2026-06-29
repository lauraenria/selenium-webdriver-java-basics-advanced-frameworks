public class CoreJavaBrushUp3 {
    // Lesson 27
    public static void main(String[] args) {

        // String is an object in Java
        // String literal approach

        // String s1 = "Rahul Shetty Academy";
        String s5 = "hello";

        // Creating String objects using "new" keyword
        // Every "new String()" creates a new object in memory
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        // Original string
        String s = "Rahul Shetty Academy";

        // Split the string using "Shetty" as delimiter
        // Left side goes to index 0
        // Right side goes to index 1
        String[] splittedString = s.split("Shetty");

        // Print left side of delimiter
        System.out.println(splittedString[0]);

        // Print right side of delimiter
        // Notice leading whitespace
        System.out.println(splittedString[1]);

        // trim() removes leading/trailing spaces
        System.out.println(splittedString[1].trim());

        // Reverse string character by character
        // Start from last index and move backwards
        for(int i = s.length()-1; i >= 0; i--)
        {
            // charAt(i) returns character at specific index
            System.out.println(s.charAt(i));
        }
    }
}


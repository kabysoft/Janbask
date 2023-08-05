public class InBuiltStringMethod {
    public static void main(String[] args) {

// Return the first character (0) of a string:

        String MyString = "Hello Java" ;
        System.out.println("Return the first character (0) of a string:"+ " [ "+MyString+ " ]");
        char result = MyString.charAt(0);
        System.out.println(result);
// Find out if a string contains a sequence of characters:

        System.out.println("Find out if a string contains a sequence of characters: ");

        System.out.println(MyString.contains("Hel"));   // true
        System.out.println(MyString.contains("e"));     // true
        System.out.println(MyString.contains("Hi"));    // false

// Compare strings to find out if they are equal:
        String MyString2 = "Hello Java";
        String MyString3 = "Hello World";

        System.out.println(MyString.equals(MyString2)); // Returns true because they are equal
        System.out.println(MyString.equals(MyString3)); // false

 // Find out if a string is empty or not:

        String MyString0 ="";
        System.out.println(MyString.isEmpty());
        System.out.println(MyString0.isEmpty());

// Return a new string where all "l" characters are replaced with "p" characters:
        System.out.println(MyString.replace('l', 'p'));


// Convert a string to upper case and lower case letters:

        System.out.println(MyString.toUpperCase());
        System.out.println(MyString.toLowerCase());

// Return the number of characters in a string:
        System.out.println(MyString.length());
    }
}

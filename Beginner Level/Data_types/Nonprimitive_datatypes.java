/**
=== DEFINITION ===
Non primitive or REFERENCE DATA TYPES 
Reference types store references (memory addresses) to objects rather than the actual data.
=== WHY USE ===
To create complex data structures like Strings, Arrays, and custom Classes for object-oriented programming.

=== CODE FORMAT ===
String name = "John";
int[] numbers = {1, 2, 3};
ClassName obj = new ClassName();

=== CODE EXAMPLE ===
*/
public class ReferenceDataTypes {
    public static void main(String[] args) {
        // String (a class, not a primitive type)
        String name = "Aashay";
        String message = new String("Hello, Java!");

        // Array (a container object)
        int[] scores = {95, 88, 92, 78};  // Array of integers
        String[] languages = {"Java", "Python", "C++"}; // Array of strings

        // Custom Class (simulated here with Object)
        Object person = new Object(); // Using Object class for demonstration

        // Output reference type values
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        System.out.println("First Score: " + scores[0]);
        System.out.println("Second Language: " + languages[1]);
        System.out.println("Person Object: " + person); // Prints memory address
    }
}
/**
=== OUTPUT ===
Name: Aashay
Message: Hello, Java!
First Score: 95
Second Language: Python
Person Object: java.lang.Object@15db9742  (address will vary)
*/

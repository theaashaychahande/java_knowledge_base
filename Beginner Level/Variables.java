/**
=== DEFINITION ===
Variables are named memory locations that store data whose value can change during execution.
=== WHY USE ===
To store and manipulate data dynamically, making programs flexible and powerful.

=== CODE FORMAT ===
dataType variableName;          // Declaration
variableName = value;           // Assignment
dataType varName = value;       // Initialization
final dataType CONSTANT = value; // Constant

=== CODE EXAMPLE ===
*/
public class Variables {
    public static void main(String[] args) {
        // 1. Variable Declaration
        int count;
        
        // 2. Assignment
        count = 10;
        
        // 3. Initialization (Declaration + Assignment)
        String userName = "Alice";
        
        // 4. Re-assignment (changing value)
        count = 20;
        userName = "Aashay";
        
        // 5. Constants (final variables - cannot be changed)
        final double PI = 3.14159;
        final String BIRTH_DATE = "2005-09-21"; // Naming convention: uppercase for constants
        
        // Output variable values
        System.out.println("Count: " + count);
        System.out.println("User Name: " + userName);
        System.out.println("PI: " + PI);
        System.out.println("Birth Date: " + BIRTH_DATE);
        
        // Trying to change a constant will cause compilation error
        // PI = 3.14; // Uncommenting this line will cause ERROR
    }
}
/**
=== OUTPUT ===
Count: 20
User Name: Aashay
PI: 3.14159
Birth Date: 2005-09-21
*/

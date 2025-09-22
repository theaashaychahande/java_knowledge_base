/**
=== DEFINITION ===
Primitive types are basic data types built into Java that store simple values.
=== WHY USE ===
They are efficient, fast, and used for fundamental operations like arithmetic and condition checks.

=== CODE FORMAT ===
byte myByte = 100;
short myShort = 5000;
int myInt = 100000;
long myLong = 15000000000L;
float myFloat = 5.75f;
double myDouble = 19.99;
char myChar = 'A';
boolean myBool = true;

=== CODE EXAMPLE ===
*/
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Integer types (whole numbers)
        byte studentAge = 19;          // 8-bit, from -128 to 127
        short year = 2024;             // 16-bit
        int pinCode = 442001;          // 32-bit (most common)
        long bigNumber = 7507666700L;  // 64-bit (note the 'L')

        // Floating point types (decimal numbers)
        float averageMarks = 85.5f;    // 32-bit (note the 'f')
        double exactValue = 123.456;   // 64-bit (default for decimals)

        // Other types
        char grade = 'A';              // Single 16-bit Unicode character
        boolean isPresent = true;      // true or false

        // Output all values
        System.out.println("Age: " + studentAge);
        System.out.println("Year: " + year);
        System.out.println("Pincode: " + pinCode);
        System.out.println("Big Number: " + bigNumber);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Exact Value: " + exactValue);
        System.out.println("Grade: " + grade);
        System.out.println("Is Present: " + isPresent);
    }
}
/**
=== OUTPUT ===
Age: 19
Year: 2024
Pincode: 442001
Big Number: 7507666700
Average Marks: 85.5
Exact Value: 123.456
Grade: A
Is Present: true
*/

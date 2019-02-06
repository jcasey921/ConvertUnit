
package conversion.program;

import java.util.Scanner;

public class ConversionProgram {
public static final double CONVERT_UNIT = 35.58;
    // Added a constant to be used in place of 35.58. 
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Hello, this program can convert Tsubo to square feet or square feet to Tsubo: \n");
    // Greeting and telling the purpose of the program. \n added to text lines to give a cleaner display to the user.
    System.out.print("Type 1 for Tsubo conversion to Square feet or type any other number for Square feet to Tsubo. \n");
    // Asking the user to choose which conversion they want to use. Int was used instead of Double since only a whole number should be entered.
    int Choice = keyboard.nextInt();
    
    if (Choice == 1) {
   // Here I used if/then/else so only the user desired output would be displayed.
        
    System.out.print("Please enter the number of Tsubo to be converted: \n");
    
    double unitTsubo = keyboard.nextDouble();
    
    System.out.print("This equals " + unitTsubo * CONVERT_UNIT + " in square feet.");
    }else{
    
    System.out.print("Please enter the number of square feet to be converted: \n");
    
    double sqFeet = keyboard.nextDouble();
    
    System.out.print("This equals " + sqFeet / CONVERT_UNIT + " in Tsubo.");
         
        }
    
    }
    
}

//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        int area = width * length;
        int perimeter = 2 * width + 2 * length;
        System.out.println();
        System.out.println("The Length is " + length);
        System.out.println("The width is " + width);
        System.out.println("The area is "+ area);
        System.out.println("The perimeter is " + perimeter);
        
    }
}



//Paste console output below:
/*
Enter the length: 143
Enter the width: 82

The Length is 143
The width is 82
The area is 11726
The perimeter is 450
*/

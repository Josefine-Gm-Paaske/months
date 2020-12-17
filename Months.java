//Importing scanner
import java.util.Scanner;

public class Months {
	public static void main(String[] args) {
		System.out.println("Write a number of a month");
		//Reads userinput
		Scanner inp = new Scanner(System.in);
	    int monthNumber = inp.nextInt();
		//Closing the scanner
	    inp.close();
        switch (monthNumber) {
            case 1:  System.out.println("January - Winter - Happy New Year!");
                     break;
            case 2:  System.out.println("February - Winter");
                     break;
            case 3:  System.out.println("March - Spring");
                     break;
            case 4:  System.out.println("April - Spring");
                     break;
            case 5:  System.out.println("May - Spring");
                     break;
            case 6:  System.out.println("June - Summer");
                     break;
            case 7:  System.out.println("July - Summer");
                     break;
            case 8:  System.out.println("August - Summer");
                     break;
            case 9:  System.out.println("September - Autumn");
                     break;
            case 10: System.out.println("October - Autumn - Happy Halloween");
                     break;
            case 11: System.out.println("November - Autumn");
                     break;
            case 12: System.out.println("December - Winter - Merry Christmas");
                     break;
            default: System.out.println( "Invalid month - There's only 12 months in a year");
        }
	}
}

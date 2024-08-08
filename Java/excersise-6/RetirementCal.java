
import java.util.Scanner;



class RetirementCal {
  public  static void main (String []args){
    /*
    Your computer knows what the current year is, which means
    you can incorporate that into your programs. You just have
    to figure out how your programming language can provide
    you with that information.
    Create a program that determines how many years you have
    left until retirement and the year you can retire. It should
    prompt for your current age and the age you want to retire
    and display the output as shown in the example that follows.
    */

     int currentAge;
     int retirementAge;
     int currentYear = 2024;


      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your current age?: ");
      currentAge = scanner.nextInt();

      System.out.println("At what age would you like to retire?: ");
      retirementAge = scanner.nextInt();

      int resutl = retirementAge - currentAge;
      int resut2 = currentYear + resutl;

      System.out.println("You have " + resutl + " years left untile you can retire. "+ " It's " + currentYear + " , " + " so can  retire in "+ resut2);

  }
}
import java.util.Scanner;


class Hello{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What is your name");

    String userName = scanner.nextLine();  // Read user input
    System.out.println("Hello " + userName + " " + "nice to meet you!");  // Output user input
    }
}
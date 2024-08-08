import java.util.Scanner;
class CountingNumber {
    public  static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Name");

        String userInput = scanner.next();
        int userLength = userInput.length();
        System.out.println(userInput + " has " + userLength + " Characters");

    }
}
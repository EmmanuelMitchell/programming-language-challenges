import java.util.Scanner;

class  Quotes {
    public  static  void  main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String quotes;
        String authorName;

        System.out.println("What is the quote?: ");
        //  quotes = "\"" + scanner.next()  +"\"";
         quotes =  scanner.nextLine()  ;
    
        System.out.println("Who said it?: ");
         authorName = scanner.nextLine();

        String displayQuot = authorName + " says \"" +  quotes +"\"";
        System.out.println("" + displayQuot);

    }
}
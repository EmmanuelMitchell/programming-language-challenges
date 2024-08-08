import java.util.Scanner;

class MidLab {
    public static  void main (String []args){
    /* 
     Mad libs are a simple game where you create a story tem-
    plate with blanks for words. You, or another player, then
    construct a list of words and place them into the story, cre-
    ating an often silly or funny story as a result.
    Create a simple mad-lib program that prompts for a noun,
    a verb, an adverb, and an adjective and injects those into a
    story that you create
     */

    String nounStore;
    String verbStore;
    String adjectiveStore;
    String adverbStore;


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a noun:  ");
    nounStore = scanner.nextLine();

    System.out.println("Enter a verb:  ");
    verbStore = scanner.nextLine();

    System.out.println("Enter a adjective:  ");
    adjectiveStore = scanner.nextLine();

    System.out.println("Enter a adverb:  ");
    adverbStore = scanner.nextLine();

    String finalResult = "Do you " +verbStore + " your " + " "+ adjectiveStore + " "+ nounStore + " "+ adverbStore + " That's hilariouas";

    System.out.println(finalResult);   





    }
}
package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author faria usman
 * @author feb 1, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
    Card[] hand = new Card[7];
        Scanner input=new Scanner(System.in);
        Scanner text=new Scanner(System.in);


        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int j= (int) (Math.random()* 13 ) + 1;

            //card.setValue(insert call to random number generator here)

            card.setValue(j);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            int n=(int) (Math.random() * 4 ) + 0  ;
            card.setSuit(Card.SUITS[n]);    
            // 
                   // hand[0]=card;

            hand[i]=card;
        }
         for(int i=0; i< hand.length; i++)
        {
                System.out.println(" suit:"+ hand[i].getSuit()+"\t value is:"+ hand[i].getValue());
                
        }
                System.out.println("Please enter your guess");


        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
            System.out.println("Enter card number value 1-13 to search");
            int cardnum=input.nextInt();
            System.out.println("Please select suit \n 1:Heart \n 2:Diamonds \n 3: Spades \n 4:Club");
            String suitsear=text.nextLine();
           // for(String suit:Card.SUITS)
            for(int i=0; i<hand.length; )
            {
              if(hand[i].getSuit().equalsIgnoreCase(suitsear) && hand[i].getValue()==cardnum)
              {              
                    System.out.println("congratulations card found "+hand[i].getValue()+"card is "+hand[i].getSuit());
                             
                    CardTrick.printInfo();

                     break;
                  }
                  else
                      i++;
                }
             
            
       
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
    String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

    public Deck() {
        cards = new ArrayList<>();
        for (int x = 0; x < ranks.length; x++) {
            for (int y = 0; y < suits.length; y++) {
                int value;
                if (ranks[x].equals("A")) {
                    value = 11;
                } else if (ranks[x].equals("J") || ranks[x].equals("Q") || ranks[x].equals("K")) {
                    value = 10;
                } else {
                    value = 1 + x;
                }
                cards.add(new Card(ranks[x], suits[y], value));
            }
        }
        Collections.shuffle(cards);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        return cards.remove(0);
    }   

    public String toString() 
    { return cards.toString(); 

    }
}

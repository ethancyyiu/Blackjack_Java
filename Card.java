public class Card {
    String rank;
    String suit;
    int value;

    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public String getrank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isAce() {
        return rank.equals("A");
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

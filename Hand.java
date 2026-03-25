import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCards(Card x) {
        cards.add(x);
    }

    private int getTotal() {
        int add = 0;
        for (int i = 0; i < cards.size(); i++) {
            add += cards.get(i).getValue();
        }
        return add;
    }

    public int total() {
        int add = getTotal();
        if (add > 21) {
            for (int i = 0; i < cards.size(); i++) {
                if (cards.get(i).isAce() == true && getTotal() > 21) {
                    cards.get(i).setValue(1);
                }
            }
            int adder = 0;
            for (int x = 0; x < cards.size(); x++) {
                adder += cards.get(x).getValue();
            }
            return adder;
        }
        return add;
    }

    public String toString() {
        return cards.toString();
    }

    public ArrayList<Integer> printValues() {
        ArrayList<Integer> newer = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            newer.add(cards.get(i).getValue());
        }
        return newer;
    }

    public String getFirst() {
        return cards.get(0).toString();
    }
}


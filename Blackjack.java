import java.util.Scanner;

public class Blackjack {
    Scanner input = new Scanner(System.in);
    private Deck deck;
    private Hand player;
    private Hand dealer;
    private int money;

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        game.play();
    }

    public void play() {
        boolean test = true;
        money = 500;
        while (test) {
            deck = new Deck();
            player = new Hand();
            dealer = new Hand();
            player.addCards(deck.dealCard());
            player.addCards(deck.dealCard());
            dealer.addCards(deck.dealCard());
            dealer.addCards(deck.dealCard());
            System.out.println("How much do you bet? You have " + money + " dollars.");
            int bet = input.nextInt();
            System.out.println("Your cards: " + player.toString());
            System.out.println("Dealer face up card: " + dealer.getFirst());
            playerTurn();

            if (player.total() > 21) {
                System.out.println("Dealer's cards: " + dealer);
                System.out.println("Dealer wins");
                money -= bet;
                System.out.println();
            } else {
                dealerTurn();
                dealerTurn();
                System.out.println("Your cards: " + player);
                System.out.println("Dealer's cards: " + dealer);
                System.out.println(determinesWinner());
                if (determinesWinner().equals("YOU WIN!!")) {
                    money += bet;
                } else if (determinesWinner().equals("Dealer wins")) {
                    money -= bet;
                }
            }
            test = ask();
        }
    }

    private boolean ask() {
        System.out.println();
        System.out.println("Do you want to play again?");
        System.out.println();
        String answer = input.next();
        if (answer.equalsIgnoreCase("Yes")) {
            return true;
        } else {
            return false;
        }
    }

    private void playerTurn() {
        System.out.println("Hit or Stand?");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Hit")) {
            player.addCards(deck.dealCard());
            System.out.println("Your cards: " + player);
            if (player.total() > 21) {
                return;
            } else {
                playerTurn();
            }
        }
    }

    private void dealerTurn() {
        int dealerTotal = dealer.total();
        while (dealerTotal < 17) {
            dealer.addCards(deck.dealCard());
            dealerTotal = dealer.total();
        }
    }

    private String determinesWinner() {
        if (player.total() > 21) {
            return "Dealer wins";
        } else if (dealer.total() > 21) {
            return "YOU WIN!!";
        } else if (dealer.total() > player.total()) {
            return "Dealer wins :(";
        } else if (dealer.total() < player.total()) {
            return "YOU WIN!!";
        } else {
            return "It is a draw";
        }
    }

}

Blackjack (Java)
================

This is a simple command-line Blackjack game I built as a first-year student learning Java. 
I’ve always loved Blackjack as a game, not for gambling, but because the strategy behind it is genuinely interesting. 
I’ve been fascinated by things like card counting and probability for a long time, so I wanted to build a small simulation to see what I could learn by coding the game myself. 
It ended up being a fun way to practice Java and understand the logic behind how the game actually works.

------------------------------------------------------------
FEATURES
------------------------------------------------------------
- Standard 52-card deck
- Player vs. dealer gameplay
- Hit / Stand options
- Dealer automatically plays (hits until 17+)
- Ace can count as 1 or 11
- Win/lose/draw detection
- Option to play again
- Fully console-based

------------------------------------------------------------
WHAT I LEARNED
------------------------------------------------------------
This project helped me get more confident with the basics of Java. Some things I practiced:

- Creating classes like Card, Deck, Player, etc.
- Thinking about how objects interact in a small program
- Writing a simple game loop
- Handling randomness and shuffling
- Managing state (player hand, dealer hand, deck)
- Structuring a project in a way that feels like a “real” program
- Using Git/GitHub to upload and organize my work
- Connecting programming with something I’m personally interested in (Blackjack strategy)

------------------------------------------------------------
PROJECT STRUCTURE
------------------------------------------------------------
Blackjack_Java/
 └── src/
      ├── Card.java
      ├── Deck.java
      ├── Player.java
      ├── Blackjack.java
      └── (other supporting classes)

(Your file list might be slightly different.)

------------------------------------------------------------
HOW TO RUN
------------------------------------------------------------
1. Clone the repo:
   git clone https://github.com/ethancyyiu/blackjack-java

2. Go into the folder:
   cd blackjack-java

3. Compile the files:
   javac src/*.java

4. Run the game:
   java -cp src Blackjack

------------------------------------------------------------
DEMO (OPTIONAL)
------------------------------------------------------------
Example console output:

Computer: How much do you bet? You have 500 dollars.
Input: 200
Computer: Your cards: [7 of Clubs, 5 of Diamonds]
Computer: Dealer face up card: 2 of Hearts
Computer: Hit or Stand?            

------------------------------------------------------------
FUTURE IMPROVEMENTS
------------------------------------------------------------
Stuff I might add later if I feel like expanding it:

- Betting + chip system
- Splitting pairs
- Doubling down
- Slightly nicer ASCII UI
- Unit tests
- Maybe a GUI version (JavaFX or Swing)
- More simulation features to explore probability and strategy

------------------------------------------------------------
NOTES
------------------------------------------------------------
This is a beginner project, but I’m sharing it because I want to track my progress and show that I’m actively learning and building things. If you’re checking out my GitHub, thanks for taking a look.

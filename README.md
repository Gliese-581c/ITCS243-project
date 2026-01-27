# ITCS243-project
## Project repo for Patrick, Kris, Greg, Vadym
Current (not finalized) project idea is a "poker simulator", programmed in Java. Outputs two hands, one visible to the user, the other hidden. User guesses whether visible hand is higher or lower than hidden one.

# Greg:
  Shuffle
  Compare hands
  Store cards as objects to make shuffling consistent

# Kris
  ## Dealing hands
  Deals 5 cards face-up for User and 5 facedown. Should display 10 cards total for the user to see.
  ## Reset the deck button / keeping track of whether or not there are enough cards left in the deck
  A command to reshuffle the deck if there are too few cards. Displays the command after each deal.
  ## Main menu / intro
  A "welcome" message explaining the game and how to play.

# Patrick
  ## Taking user inputs
  Prompt the user for interactions, either to reset the game board, or discard and draw new cards, etc.
  ## Set aside used hands
  Don't want each hand to be drawn from a full 52 card deck. Each hand should be be drawn from the remaining, unused, deck. Deck should only reset either when it runs out of cards, or when the user tells the program to reset.

# Vadym
  Package research
  Display suit characters (ASCII/unicode/etc)
  Bluffing

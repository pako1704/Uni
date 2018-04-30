package edu.kit.informatik;

public class TicTacToe {
  static int[] playedFields = new int[9];
  static int[] data = new int[9];
  
  
  /**
   * This method is necessary to return and run the program of the 
   * class TicTacToe.
   * @param args is a given parameter of the main-method
   */
  public static void main(String[] args) {

    // String[] args = {"0", "1", "7", "4", "2", "5", "6", "3", "8"};
    for (int i = 0; i < args.length; i++) {
      data[i] = Integer.parseInt(args[i]);
      playedFields[i] = 0;
    }
    double currentPlayer;
    int winnerIs = 0;
    for (int i = 0; i < data.length; i++) {
      currentPlayer = i % 2;
      if (currentPlayer == 0) {
        playedFields[data[i]] = 1;
      } else {
        playedFields[data[i]] = 2;
      }
      winnerIs = validateCurrentPlaystate();
      if (winnerIs == 0) {
        continue;
      }
      if (winnerIs == 1) {
        System.out.println("P1 wins " + (i + 1));
        break;
      } else {
        System.out.println("P2 wins " + (i + 1));
        break;
      }
    }
    // drawField();
    if (winnerIs == 0) {
      System.out.println("Draw");
    }
  }


  private static int validateCurrentPlaystate() {
    for (int i = 0; i < 9; i += 3) {
      if (playedFields[0 + i] == playedFields[1 + i] 
          && playedFields[1 + i] == playedFields[2 + i]) {
        return playedFields[0 + i];
      }
    }
    for (int i = 0; i < 3; i++) {
      if (playedFields[0 + i] == playedFields[3 + i]
          && playedFields[3 + i] == playedFields[6 + i]) {
        return playedFields[0 + i];
      }
    }
    if (playedFields[0] == playedFields[4] && playedFields[4] == playedFields[8]) {
      return playedFields[0];
    }
    if (playedFields[2] == playedFields[4] && playedFields[4] == playedFields[6]) {
      return playedFields[2];
    }
    return 0;
  }
}
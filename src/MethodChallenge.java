public class MethodChallenge {
    public static void main(String[] args) {

        String playerName = "Luis";
        int playerScore = 90;
        int playerPosition =  calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);



    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + "º on the high score list");

    }
     public static int calculateHighScorePosition(int playerScore) {
        int result = 4;
        if (playerScore >= 1000) {
            result = 1;
        }
        if((playerScore >= 500) && (playerScore < 1000)) {
            result = 2;
        }
        else if ((playerScore >= 100) && (playerScore < 500)) {
            result = 3;
        }

        return result;

     }
}

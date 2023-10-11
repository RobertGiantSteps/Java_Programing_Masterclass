public class MainChallenge {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Llamada al método
        // Se pueden pasar los argumentos con los nombres de las variables(más legíble)
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("highScore = " + highScore);

        // También se pueden pasar los valores literales de los parámetros del método.
        System.out.println("The next high score is = > " + calculateScore(true, 10000, 8, 200));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }

        return finalScore;

    }


}


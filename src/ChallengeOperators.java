public class ChallengeOperators {
    public static void main(String[] args) {

        //Step1:
        double myFirstValue = 20.00d;

        //Steps2:
        double mySecondValue = 80.00d;

        //Steps3:

        double myTotal = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("myTotal = " + myTotal);


        //Steps4:
        double remainder = myTotal % 40.00d;
        System.out.println("remainder = " + remainder);

        //Steps5:
        boolean remanderSolution = (remainder == 0) ? true : false;

        //Steps6:
        System.out.println("remanderSolution = " + remanderSolution);

        //Steps7:
        if(!remanderSolution) {
            System.out.println("got some remainder");
        }


    }
}

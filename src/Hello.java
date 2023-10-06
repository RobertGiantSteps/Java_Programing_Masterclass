

public class Hello {
    public static void main(String[] args) {
        boolean regars = false;
        if (regars) {
            System.out.println("Hello Robert");
        }
        else {
            System.out.println("Nothing to say :( ");
        }

        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("It is not a alien !");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore <= 100){
            System.out.println("You got the high score !");
        }

        //Operador Lógico AND (&& las dos condiciones tiene que ser verdaderas para que se ejecute)
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less tha 100");
        }

        //Operador Lógico OR (|| devuelve true si una de las condiciones es verdadera)
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        // Con la ! negamos y como se establecio a false devolverá true , por tanto entra en el if
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }
        else{
            System.out.println("It`s work ¡¡¡");
        }

        //Operador ternario: resultado = condicion ? valor_si_cierto : valor_si_falso;
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false  : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
        else {
            System.out.println(" Its a foreing car");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println("s = " + s);



    }
}

public class Main {
    public static void main(String[] args) {

        // Задание 1

        byte B = 1;
        short S = 22;
        int I = 111;
        long l = 1034l;
        float F = 12.43f;
        double D = 18.34;
        boolean b = true;
        char C = 33;

        // Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double summaBoxers = boxer1 + boxer2;
        double differenceWeight = boxer2 % boxer1;
        System.out.println( "General weight both boxers: " + summaBoxers + " Kg." );
        System.out.println( "Difference weight both boxers: " + differenceWeight + " Kg." );

        // Задание 3

        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egs = 70;
        double generalWeightOfRecipe = ( banana * 5 + milk * 2 + iceCream * 2 + egs * 4 );
        double generalWeightOfRecipeKg = generalWeightOfRecipe / 1000;
        System.out.println( "General breakfast weight: " + generalWeightOfRecipeKg + " Kg");


        // Задание 4

        int loseWeight = 7;
        int loseWeightInGram = loseWeight * 1000;
        int loseWeightType1 = 250;
        int loseWeightType2 = 500;
        int dayOfLoseWeightType1 = loseWeightInGram / loseWeightType1;
        int dayOfLoseWeightType2 = loseWeightInGram / loseWeightType2;
        int averageDayOfLoseWeight = ( dayOfLoseWeightType1 + dayOfLoseWeightType2 ) / 2;
        System.out.println( "Days for lose weight in 1st type: " + dayOfLoseWeightType1 );
        System.out.println( "Days for lose weight in 2nd type: " + dayOfLoseWeightType2);
        System.out.println( "Average days for weight lose: " + averageDayOfLoseWeight);

        // Задание 5

        int mishaCurrentSalary = 67_760;
        int denisCurrentSalary = 83_690;
        int kristinaCurrentSalary = 76_230;

        int mishaSalaryUp =  mishaCurrentSalary * 10 / 100;
        int denisSalaryUp = denisCurrentSalary * 10 / 100;
        int kristinaSalaryUp = kristinaCurrentSalary * 10 / 100;

        int mishaNewSalary = mishaCurrentSalary + mishaSalaryUp;
        int denisNewSalary = denisCurrentSalary + denisSalaryUp;
        int kristinaNewSalary = kristinaCurrentSalary + kristinaSalaryUp;

        int mishaOldYearSalary = mishaCurrentSalary * 12;
        int denisOldYearSalary = denisCurrentSalary * 12;
        int kristinaOldYearSalary = kristinaCurrentSalary * 12;

        int mishaNewYearSalary = mishaNewSalary * 12;
        int denisNewYearSalary = denisNewSalary * 12;
        int kristinaNewYearSalary = kristinaNewSalary * 12;

        System.out.println( "Misha new salary: " + mishaNewSalary + " Ruble" );
        System.out.println( "New Misha year salary bigger than previous salary on: " +
                (mishaNewYearSalary - mishaOldYearSalary) + " Ruble" );
        System.out.println( "Denis new salary: " + denisNewSalary + " Ruble" );
        System.out.println( "New Denis year salary bigger than previous salary on: " +
                (denisNewYearSalary - denisOldYearSalary) + " Ruble" );
        System.out.println( "Kristina new salary: " + kristinaNewSalary + " Ruble" );
        System.out.println( "New Kristina year salary bigger than previous salary on: " +
                (kristinaNewYearSalary - kristinaOldYearSalary) + " Ruble" );



    }
}
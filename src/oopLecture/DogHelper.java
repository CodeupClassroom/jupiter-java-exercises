package oopLecture;

public class DogHelper {

    public static final int NUMBER_OF_DOG_BREEDS = 340;

    public static final int APPROX_POPULATION_OF_DOGS = 52000000;

    public static double humanToDogYears(double years) {
        return years * 7;
    }

    public static double ouncesOfFoodCalculator(double dogWeightInPounds) {
        return dogWeightInPounds * 0.5;
    }

}

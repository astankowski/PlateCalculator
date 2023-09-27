/*
 Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
 then press Enter. You can now see whitespace characters in your code.
TODO
 * add gui
 * add weight sets
 * unit tests
 * convert to oop
 * optimize the code
*/

import java.util.Scanner;
public class Main {
    private static final float BAR_WEIGHT = 20;
    private static final float MIN_PLATE_WEIGHT = 1.25f;

    public static void calculatePlates(float totalWeight) {
        int plates;
        float oneSideWeight;
        float currentPlateWeight = 20;
        totalWeight -= BAR_WEIGHT;
        oneSideWeight = totalWeight / 2;
        while (currentPlateWeight >= MIN_PLATE_WEIGHT) {
            //System.out.println(oneSideWeight);
            plates = (int) (oneSideWeight / currentPlateWeight);
            if (plates > 0) {
                System.out.printf("%.2f kg * %d%n", currentPlateWeight, plates);
            }
            oneSideWeight = oneSideWeight % currentPlateWeight;
            currentPlateWeight = currentPlateWeight / 2;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, welcome to Rep Calculator!");

        while (true) {
            System.out.print("Input weight: ");
            float totalWeight = input.nextFloat();

            if (totalWeight <= 0) {
                System.out.println("Incorrect weight!");
                System.exit(-1);
            } else calculatePlates(totalWeight);

        }
    }
}

//Link Shortener

//WeightCalculator

//RepCalulator

//Data visualaztion

//Convert anything to android

//AI recogniztion

//Strong files editor
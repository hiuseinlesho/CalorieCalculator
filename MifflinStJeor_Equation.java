import java.sql.SQLOutput;
import java.util.Scanner;

public class MifflinStJeor_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your Metric Units%n%n");

        System.out.print("Age(15-80): ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Gender(male or female): ");
        String gender = scanner.nextLine();

        System.out.print("Height(in cm): ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("Weight(in kg): ");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.print("Activity(bmr, sedentary, light, moderate," +
                " active or very active: ");
        String activity = scanner.nextLine();

        double BMR = 0;
        if (gender.equals("male")) {
            BMR = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else if (gender.equals("female")){
            BMR = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }

        double activityLevel = 0;
        if (activity.equals("bmr")) {
            System.out.printf("Basal Metabolic Rate (BMR) %.0f%n", BMR);
        } else if (activity.equals("sedentary")) {
            activityLevel = 1.2;
        } else if (activity.equals("light")) {
            activityLevel = 1.375;
        } else if (activity.equals("moderate")) {
            activityLevel = 1.55;
        } else if (activity.equals("active")) {
            activityLevel = 1.725;
        } else if (activity.equals("very active")) {
            activityLevel = 1.9;
        }
        if (!activity.equals("bmr")) {
            double totalCalories = BMR * activityLevel;

            double mildWeightLoss = totalCalories - 250;
            double weightLoss = totalCalories - 500;
            double extremeWeightLoss = totalCalories - 1000;

            double mildWeightGain = totalCalories + 250;
            double weightGain = totalCalories + 500;
            double extremeWeightGain = totalCalories + 1000;

            System.out.println();
            System.out.printf("Maintain weight: %.0f%n", totalCalories);
            System.out.println();

            System.out.println("Lose weight");
            System.out.printf("Mild weight loss (- 0.25 kg/week): %.0f%n", mildWeightLoss);
            System.out.printf("Weight loss (- 0.5 kg/week): %.0f%n", weightLoss);
            System.out.printf("Extreme weight loss (- 1 kg/week): %.0f%n", extremeWeightLoss);
            System.out.println();

            System.out.println("Gain weight");
            System.out.printf("Mild weight gain (+ 0.25 kg/week): %.0f%n", mildWeightGain);
            System.out.printf("Weight gain (+ 0.5 kg/week): %.0f%n", weightGain);
            System.out.printf("Extreme weight gain (+ 1 kg/week): %.0f%n", extremeWeightGain);
        }
    }
}

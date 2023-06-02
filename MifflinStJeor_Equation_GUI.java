import javax.swing.JOptionPane;

public class MifflinStJeor_Equation_GUI {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Enter your Metric Units");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Age(15-80):"));

        String gender = JOptionPane.showInputDialog("Gender(male or female):");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Height(in cm):"));

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Weight(in kg):"));

        String activity = JOptionPane.showInputDialog("Activity(bmr, sedentary, light, moderate, active or very active):");

        double BMR = 0;
        if (gender.equals("male")) {
            BMR = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else if (gender.equals("female")){
            BMR = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }

        double activityLevel = 0;
        if (activity.equals("bmr")) {
            JOptionPane.showMessageDialog(null, "Basal Metabolic Rate (BMR): " + Math.round(BMR));
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

            JOptionPane.showMessageDialog(null, "Maintain weight: " + Math.round(totalCalories));

            JOptionPane.showMessageDialog(null, "Lose weight");
            JOptionPane.showMessageDialog(null, "Mild weight loss (- 0.25 kg/week): " + Math.round(mildWeightLoss));
            JOptionPane.showMessageDialog(null, "Weight loss (- 0.5 kg/week): " + Math.round(weightLoss));
            JOptionPane.showMessageDialog(null, "Extreme weight loss (- 1 kg/week): " + Math.round(extremeWeightLoss));

            JOptionPane.showMessageDialog(null, "Gain weight");
            JOptionPane.showMessageDialog(null, "Mild weight gain (+ 0.25 kg/week): " + Math.round(mildWeightGain));
            JOptionPane.showMessageDialog(null, "Weight gain (+ 0.5 kg/week): " + Math.round(weightGain));
            JOptionPane.showMessageDialog(null, "Extreme weight gain (+ 1 kg/week): " + Math.round(extremeWeightGain));
        }
    }
}

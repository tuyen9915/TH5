import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();;

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");// giải thích

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");// Nhẹ cân
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");// Bình thường
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");// Dư cân
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");// Béo
    }
}
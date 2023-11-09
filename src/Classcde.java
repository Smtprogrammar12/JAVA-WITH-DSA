import java.util.Scanner;

public class Classcde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five subject Number of student:--- ");

        float sub_1 = sc.nextFloat();
        float sub_2 = sc.nextFloat();
        float sub_3 = sc.nextFloat();
        float sub_4 = sc.nextFloat();
        float sub_5 = sc.nextFloat();

        float totals , percentage , grade, average;

        totals = sub_1+ sub_2 + sub_3 + sub_4 + sub_5;

        average = (float)totals/5;
        percentage = (float)((totals/500)*100);

        // It will calculate the Grade
        if (average >= 90)
            grade = 'A';
        else if (average >= 80 && average < 90)
            grade = 'B';
        else if (average >= 70 && average < 80)
            grade = 'C';
        else if (average >= 60 && average < 70)
            grade = 'D';
        else
            grade = 'E';

        // It will produce the final output
        System.out.println("The Total marks   = " + totals + "/500.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");


    }
}

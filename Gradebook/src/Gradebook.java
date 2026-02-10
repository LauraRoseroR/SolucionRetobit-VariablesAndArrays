import java.util.Scanner;

public class Gradebook {
    public void saveGrades(String nameStudent, int age, int numberGrades) {
        Scanner keyboard = new Scanner(System.in);
        double[] grades = new double[numberGrades];
        double totalGrades = 0;
        for (int i = 0; i < numberGrades; i++) {
            System.out.println("ingrese la calificacion número " + (i +1)+ " : ");
            double grade = keyboard.nextDouble();
            grades[i] = grade;
        }
        ;
        for (double grade : grades) {
            totalGrades = totalGrades + grade;
        }
        ;
        double average = totalGrades / numberGrades;
        System.out.println("El estudiante " + nameStudent + " tiene un promedio de: " + average);
    }

    ;

    public static void main(String[] args) {

        Gradebook student1 = new Gradebook();
        student1.saveGrades("laura rosero", 23, 2);
    }
}

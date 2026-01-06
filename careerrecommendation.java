import java.util.Scanner;

public class CareerRecommendation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int studentCount = 8;

        while (studentCount > 0) {

            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();

            if (gpa >= 3.5) {
                System.out.println("Recommend Research or Higher Studies");
            } else {
                System.out.println("Recommend Industry-Oriented Career");
            }

            studentCount--;
        }

        sc.close();
    }
}
  

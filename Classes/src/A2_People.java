import java.util.Scanner;

public class A2_People {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        People subject_1 = new People();
        People subject_2 = new People();

        System.out.println("Please input the data of the first subject you want to register\n");

        System.out.println("DNI: ");
        subject_1.DNI = input.nextLine();
        System.out.println("First name: ");
        subject_1.name = input.nextLine();
        System.out.println("Surname: ");
        subject_1.surname = input.nextLine();
        System.out.println("Age: ");
        subject_1.age = input.nextInt();

        input.nextLine();

        System.out.println("Thank you. Finally input the data of the second subject\n");

        System.out.println("DNI: ");
        subject_2.DNI = input.nextLine();
        System.out.println("First name: ");
        subject_2.name = input.nextLine();
        System.out.println("Surname: ");
        subject_2.surname = input.nextLine();
        System.out.println("Age: ");
        subject_2.age = input.nextInt();

        String age_subject_1 = subject_1.name + " " + subject_1.surname + " with DNI " + subject_1.DNI;
        String age_subject_2 = subject_2.name + " " + subject_2.surname + " with DNI " + subject_2.DNI;

        if (subject_1.age >= 18) {
            age_subject_1 += " is an adult";
        }
        else {
            age_subject_1 += " is not an adult yet";
        }

        if (subject_2.age >= 18) {
            age_subject_2 += " is an adult";
        }
        else {
            age_subject_2 += " is not an adult yet";
        }

        System.out.println(age_subject_1);
        System.out.println(age_subject_2);

    }
}

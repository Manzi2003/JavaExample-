import java.util.Scanner;
public class switchstatement {
public static void main(String[] args) {
    scanner scanner = new Scanner(system.in);
    system.out.println("Enter marks: ");
    int marks = scanner.nextInt();
    switch (marks / 10) {
        case 10:
        case 9:
        system.out.println("Excellent: ");
        break;
        case 8:
        system.out.println("Very Good: ");
        break;
        case 7:
        system.out.println("Good: ");
        break;
        case 6:
        system.out.println("Medium: ");
        break;
        case 5:
        system.out.println("Pass: ");
        break;
        default:
        System.out.println("Fail");
        Scanner.close();
    }
}
}
import java.util.Scanner;

public class BoardResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of SUBJECT1 :");
        int Subject1 = sc.nextInt();
        System.out.println("Enter marks of SUBJECT2 :");
        int Subject2 = sc.nextInt();
        System.out.println("Enter marks of SUBJECT3 :");
        int Subject3 = sc.nextInt();
        System.out.println("Enter marks of SUBJECT4 :");
        int Subject4 = sc.nextInt();
        System.out.println("Enter marks of SUBJECT5 :");
        int Subject5 = sc.nextInt();
        float percentage = ((Subject1 + Subject2 + Subject3 + Subject4 + Subject5) / 500.0f) * 100;
        System.out.println("PERCENTAGE: ");
        System.out.println(percentage);
    }
}

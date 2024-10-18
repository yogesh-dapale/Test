import java.util.Scanner;

public class SumMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        
        int sum = min + max;
        System.out.println("The sum of the smallest and largest numbers is: " + sum);
    }
}

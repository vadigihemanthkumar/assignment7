import java.util.Scanner;

public class Fine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();
        double fine = 0.0;
        if (daysLate >= 1 && daysLate <= 7) {
            fine = 0.50 * daysLate; 
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = 1.00 * daysLate; 
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = 5.00; 
        } else if (daysLate > 21) {
            System.out.println("Your membership is canceled as you returned the book after 21 days.");
        }

        System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine);
        
    }
}

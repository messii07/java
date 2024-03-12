import java.util.Scanner;

public class BankAc {
    String DepositorName, AcType;
    int AcNo;
    double AvlBal = 500;

    public void AcInfo() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name of depositor: ");
        DepositorName = s.nextLine();
        System.out.print("Enter account number: ");
        AcNo = s.nextInt();

        System.out.print("Enter account type (Saving/Current): ");
        AcType = s.nextLine();

        System.out.println("Depositor Name: " + DepositorName + "  " + "Account No: " + AcNo + "  " + "Account type: " + AcType);
    }

    public void Deposite() {
        double DepAmt;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        DepAmt = s1.nextDouble();
        AvlBal += DepAmt;
        System.out.println("Available balance after depositing amount is: " + AvlBal);
    }

    public void Withdraw() {
        double WithAmt;
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        WithAmt = s2.nextDouble();
        if (AvlBal - WithAmt >= 500) {
            AvlBal -= WithAmt;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient balance in account");
        }
    }

    public void DisplayBal() {
        System.out.println("Account balance: " + AvlBal);
    }

    public static void main(String args[]) {
        BankAc b = new BankAc();
        b.AcInfo();
        b.Deposite();
        b.Withdraw();
        b.DisplayBal();
    }
}

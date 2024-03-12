import java.util.Scanner;
public class calculation {
    int a, b;
	
    public void inputNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = s.nextInt();
        System.out.print("Enter second number: ");
        b = s.nextInt();
    }

    public void sum() {
        System.out.println("The sum is " + a + " + " + b + " = " + (a + b));
    }

    public void difference() {
        System.out.println("The difference is " + a + " - " + b + " = " + (a - b));
    }

    public void multiply() {
        System.out.println("The product is " + a + " * " + b + " = " + (a * b));
    }

    public void divide() {
		if(b!=0)
		{
			System.out.println("The division is " + a + " / " + b + " = " + (a / b));
		}
		else
		{
			System.out.println("Cannot divide by zero");
		}
	}

    public void average() {
        System.out.println("The average of " + a + " + " + b + " = " + ((a + b) / 2));
    }

    public void maximum() {
        System.out.println("The maximum number is :" + Math.max(a, b));
    }

    public void minimum() {
        System.out.println("The minimum number is :" + Math.min(a, b));
    }
	public static void main(String args[]) {
        calculation c = new calculation();
        c.inputNumbers();
        c.sum();
        c.difference();
        c.multiply();
        c.divide();
        c.average();
        c.maximum();
        c.minimum();
    }
}

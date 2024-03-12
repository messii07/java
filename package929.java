import math.Factorial;
public class package929{
	public static void main(String[] args){
		int num=5;
		int result=Factorial.calculate(num);
		System.out.println("Factorial"+num+"is"+result);
		
	}
}
package math;
public class Factorial{
	public static int calculate(int n){
		if(n==0 ||n==1){
			return 1;
		}else{
			return n*calculate(n-1);
		}
	}
	
}
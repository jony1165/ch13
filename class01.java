package hw01;

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=12, den=0;
			int ans=num/den;
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}
		finally {
			System.out.println("end of main() methood");
		}
	}

}

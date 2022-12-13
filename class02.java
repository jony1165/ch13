package hw13;

public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12, den=0;
		try
	      {
	        if(den==0)
	         throw new ArithmeticException();    // 拋出例外
	        else
	         System.out.println(num+"/"+den+"="+num/den);  // 若沒有拋出例外，則執行此行
	      }
	      catch(ArithmeticException e)
	      {
	         System.out.println("除數為0");
	      }
	}

}

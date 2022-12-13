package hw13;

public class class04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12, den[]={12,0,3,0,0,4};
		try
	      {
			for (int i=0;i<10;i++)
				if(den[i]==0)
					throw new ArithmeticException();    // 拋出例外
				else
					if(den[i]>10)
						throw new ArrayIndexOutOfBoundsException(); 
					else
						System.out.println("ans"+num/den[i]);  // 若沒有拋出例外，則執行此行
	      }
	      catch(ArithmeticException e)
	      {
	         System.out.println("除數為0");
	      }
		  catch(ArrayIndexOutOfBoundsException e)
	      {
	         System.out.println("索引值超出範圍");
	      }
	}

}

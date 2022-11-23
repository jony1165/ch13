package hw10;
class RediusIsToolrge extends Exception{
	
}
class RediusIsNegative extends Exception{
	
}
class CCircle        // 定義類別CCircle
{
   private double radius;
   public void setRadius(double r) throws RediusIsToolrge,RediusIsNegative
   {
      if(r<0)
      {
         throw new RediusIsNegative();       // 拋出例外
      }
      else if(r>100){
    	  throw new RediusIsToolrge();
      }
      else
         radius=r;
   }

   public void show()
   {
      System.out.println("area="+3.14*radius*radius);
   }
}
public class class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir = new CCircle();
		try {
			cir.setRadius(120);
		}
		catch(RediusIsNegative e) {
			System.out.println(e + "throwed");
		}
		catch(RediusIsToolrge e) {
			System.out.println(e + "throwed");
		}
		cir.show();
	}

}

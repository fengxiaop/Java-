public class LableBreak
{
	public static void main(String[] args)
	{
		int sum=0;		
		coloop:
		while(sum<=100){
		     for(int count=0;count<10;count++){
		         sum+=count;
		        // System.out.println("sum="+sum+"   "+count);
		     	 if(sum>50)
					break coloop;
		    }
		}
		System.out.println("sum="+sum);
	}
}

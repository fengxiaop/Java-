public class Sum{
	
	public static int getS(int n){
		if(n==1)
			return 1;
		else
			return n+getS(n-1);
	}
	
	public static void main(String args[]){
		System.out.println("1+2+......+100="+Sum.getS(100));
	}
}
public class Fibonacci{
	public static void main(String args[]){
		int i;
		int[] f=new int[20];
		f[0]=1;
		f[1]=1;
		for(i=2;i<f.length;i++)
			f[i]=f[i-1]+f[i-2];
		
		for(i=0;i<f.length;i++)
			System.out.println("f["+i+"]="+f[i]);

		
			
	}
}
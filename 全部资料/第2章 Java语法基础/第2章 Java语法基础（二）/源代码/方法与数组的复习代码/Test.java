public class Test{	
	public static void show(){
		System.out.println("show()");
	}
	public static int show(int i){
		System.out.println("show()"+i);
		return 1;
	}	
	public static void show(int[] temp){
		int i;
		for(i=0;i<temp.length;i++){
			System.out.println("temp["+i+"]="+temp[i]);	
		}
		temp[0]=10000;
	}	
	public static void show(int[][] temp){
		int i,j;
		for(i=0;i<temp.length;i++){
			for(j=0;j<temp[i].length;j++)
				System.out.print(temp[i][j]+"\t");
			System.out.println();
		}
	}
	public static void main(String args[]){
	//	show();
	//	int a=Test.show(100);	
		int a[]={1,2};
		int[] b=new int[5];
	//	show(a);		
		a=b;
		b[1]=100;
	//	Test.show(a);		
//		System.out.println("a[0]="+a[0]);		
		int[][] c=new int[2][3];
		c[0][1]=5;
		c[1][0]=10;
		c[1][2]=15;
	//	show(c);		
		int[][] d=new int[3][];
		d[0]=new int[1];
		d[1]=new int[3];
		d[2]=new int[2];		
		d[0][0]=30;
		d[1][2]=35;
		d[2][1]=40;
		show(d);
	
	}
}
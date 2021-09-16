package two;

public class ArrayDemo2{
	  public static void main(String args[]){
	    int[] a=new int[] {10,30,40,10};
	    int[] b=new int[] {100,400,500};
	    b=a;								//数组的赋值，两个数组引用名将指向同一个连续的地址空间
	    System.out.println("b[0]="+b[0]);
	    System.out.println(b.length);
	    
	    b[0]=1000;
	    System.out.println("a[0]="+a[0]);  //注意，修改的是b[0]的值，但a[0]的值也变化了
	    System.out.println("b[0]="+b[0]);
	  }
	}     

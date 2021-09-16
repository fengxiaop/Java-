package one;

//import java.lang.*;//不要显示导入

public class BitDemo{
	public static void main(String args[]){
	    int i=10;
	    
	    System.out.println(Integer.toBinaryString(i));	    
	    
	    i=i<<1;	    
	    
	    System.out.println(Integer.toBinaryString(i));
	    System.out.println(i);
	}	
}

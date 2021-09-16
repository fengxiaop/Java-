package one;

import java.util.Scanner;							//第一步，导入类

public class TestScanner{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);		//第二步，定义输入对象
		
		int intValue=scanner.nextInt();				//第三步，接收值		
		System.out.println("intValue="+intValue);
		
		//scanner.nextInt(2);2为基数，代表接收2进制数 
		//scanner.nextInt(16);16为基数，代表接收16进制数 
		
		boolean booleanValue=scanner.nextBoolean();	
		System.out.println("booleanValue="+booleanValue);	
		
	}

}
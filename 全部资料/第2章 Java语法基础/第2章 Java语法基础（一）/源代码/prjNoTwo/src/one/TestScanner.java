package one;

import java.util.Scanner;							//��һ����������

public class TestScanner{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);		//�ڶ����������������
		
		int intValue=scanner.nextInt();				//������������ֵ		
		System.out.println("intValue="+intValue);
		
		//scanner.nextInt(2);2Ϊ�������������2������ 
		//scanner.nextInt(16);16Ϊ�������������16������ 
		
		boolean booleanValue=scanner.nextBoolean();	
		System.out.println("booleanValue="+booleanValue);	
		
	}

}
package one;

import java.util.Scanner;							//��һ����������
public class TestScannerString {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);		//�ڶ����������������

		/**Scanner�౾����һ��ɨ�������󣬵�Scanner����nextLine()���������ַ�����
						���������Enter�������������ո���ַ���ʱ��Ҳ�����������ա�
		Scanner���next()���������ַ������������ո���ַ�������ֻ���տո�ǰ����Ч�ַ�����
		�Ƚ�nextLine()��next()���ַ�ʽ�����ַ���ֵ��aaa bbb ccc��ʱ��Ч��*/
		System.out.println("�����ַ�����nextLine����:");
		String strOne=scanner.nextLine();
		System.out.println("strOne="+strOne);
		
		System.out.println("�����ַ�����next����:");
		String strTwo=scanner.next();
		System.out.println("strTwo="+strTwo);
		
		String strThree=scanner.next();				
		//strTwo=scanner.next();ֻ������aaa��ʣ����ַ������Լ����������next������		
		System.out.println("strThree="+strThree);	
		
		
	}

}

package one;

import java.util.Scanner;							//��һ����������

public class NextAndNextLine {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);		//�ڶ����������������
		
		int intValue=scanner.nextInt();				//������������ֵ
//		scanner.nextLine();							//���1�����next��nextInt��nextDouble�ȷ�������������
		
		System.out.println("intValue="+intValue);
		
		System.out.println("�����ַ�����nextLine����:");		
		String strOne=scanner.nextLine();
		//���û�б��1����䣬nextLine�п���δ���յ�ֵ��ִ����ϣ���Ϊ�Ѿ����յ���һ�����س������������
		//����ϸ���ɲμ�������2�� Java�﷨������һ��/Դ����/next()������nextLine()������������  

	}

}

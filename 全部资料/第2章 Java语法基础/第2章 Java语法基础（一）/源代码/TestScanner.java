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

//		nextLine()�����Ľ�����ֻ��Enter�������������ո���ַ���ʱ��Ҳ�����������ա�
//		next()�����������ո���ַ�������ֻ���տո�ǰ����Ч�ַ�����
		//�Ƚ�nextLine()��next()���ַ�ʽ�����ַ���ֵ��aaa bbb ccc��ʱ��Ч��
		System.out.println("�����һ���ַ���:");
		String strOne=scanner.nextLine();
		System.out.println("strOne="+strOne);

		System.out.println("����ڶ����ַ���:");
		String strTwo=scanner.next();
		System.out.println("strTwo="+strTwo);

		String strThree=scanner.next();
		System.out.println("strThree="+strThree);
	}
}
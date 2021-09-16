package two;

//TestPassByValue.java: Demonstrate passing values to methods
public class TestPassByValue {
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;

		System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

		// ���ý���������������ֵ����
		swap(num1, num2);

		// ��������ʾ������û�н���
		System.out.println("After  invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
	}

	//�Զ��巽����������������ֵ
	static void swap(int n1, int n2) {
		System.out.println("    Inside the swap method");
		System.out.println("    Before swapping n1 is " + n1 + " n2 is " + n2);

		// ����
		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("    After  swapping n1 is " + n1 + " n2 is " + n2);
	}
}

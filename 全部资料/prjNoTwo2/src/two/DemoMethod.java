package two;

//DemoMethod, �򵥵ķ���
public class DemoMethod {
	public static void main(String args[]) {
		star(); 									// ��ʽһ������star() ����
		System.out.println("I love Java");
		DemoMethod.star(); 							// ��ʽ��������DemoMethod.star() ����
	}

	public static void star() {
													// ���Ҫ���Զ��巽���ܱ�ֱ�ӵ��ã���static����
		for (int i = 0; i < 14; i++)
			System.out.print("*"); 					// ���14���Ǻ�
		System.out.print("\n"); 					// ����
	}
}


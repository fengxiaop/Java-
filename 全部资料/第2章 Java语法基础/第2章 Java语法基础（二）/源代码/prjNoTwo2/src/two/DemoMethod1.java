package two;

public class DemoMethod1 {
	/*1 test()�����ķ�������
	  2 ��return�����ֵ������
	  3 �����test()����ֵ�ı�������Ҫһ��*/

	public static int test(){			//1
		return 1;						//2
	}

    public static void main(String[] args) {

		int a=test()+1;					//3
		System.out.println(test());		//3 Ҳ���Խ�������ֵ�ķ�������һ��ȷ�е�ֵ��ʹ�ã����������ֵ��μ�ĳ����

		//test();						//4 ��󣬴��﷨�Ƕȣ����Բ��ñ���ȥ���շ���ֵ��ֱ�ӵ��÷������ɡ���Ȼ�����÷�ʵ�ʺ���Ͳ����ˡ�
    }
}


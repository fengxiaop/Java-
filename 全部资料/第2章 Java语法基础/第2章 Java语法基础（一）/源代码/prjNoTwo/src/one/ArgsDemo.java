package one;

public class ArgsDemo{
	public static void main(String args[]){
		//1 ����Ȩ��ͨ��main�Ĳ���args����ֵ
		System.out.println("args[0]="+args[0]);
		System.out.println("args[1]="+args[1]);

		int i=Integer.parseInt(args[0]);	//2 args�������յ��κ�ֵ�����ַ���������Ҫ��ֵ�������������ݣ���Ҫת����
											//  ת��˼·�����JOpitonPane�ķ�ʽ��ȡֵ��ת�����ݵķ�ʽһ��
		float f=Float.parseFloat(args[1]);
		System.out.println(i+f);
	}
}

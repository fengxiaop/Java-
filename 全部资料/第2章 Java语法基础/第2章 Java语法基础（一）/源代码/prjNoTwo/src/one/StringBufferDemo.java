package one;

/**
*���������StringBuffer������
*/
public class StringBufferDemo{
	public static void main(String args[]){
		StringBuffer s1=new StringBuffer("���Ϲ�ҵ��ѧ�����ѧԺ");

		System.out.println(s1.append("��������"));
		System.out.println(s1.append("��˵��ô����"));

		//jdk1.5��ʼ�İ汾��������StringBuilder
		//(1)���ߵķ���������ͬ��
		//(2)StringBuilder���ٶȱ�StringBuffer�졣��������������ʱ��StringBuilder���ٶȲŻ����ֳ�����
		//(3)StringBuffer�̰߳�ȫ����֤ͬ����StringBuilder����֤ͬ��
		StringBuilder s2=new StringBuilder("����");
		System.out.println(s2.append("��"));
		System.out.println(s2.append("��"));
	}
}

/**
*���������EqualsDemo��==������
*
*/
public class EqualsDemo{
	public static void main(String args[]){
		int a=10,b=10;
		String s1="abcde",s2="abcde";
		String s3=new String("abcde");

		System.out.println("a==b\t\t\t"+(a==b));

		System.out.println("s1==s2����ǣ�\t\t"+(s1==s2));				//�жϵ�ַ���ֵ��ͬ����������
		System.out.println("s1.equals(s2)����ǣ�\t"+s1.equals(s2));	//�����ж�ֵ���

		System.out.println("s1==s3����ǣ�\t\t"+(s1==s3));
		System.out.println("s1.equals(s3)����ǣ�\t"+s1.equals(s3));
	}
}
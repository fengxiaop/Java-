package one;

public class  MathDemo{
	public static void main(String args[]){
		//�����ֵ
		System.out.println(Math.abs(-12.34));//12.34
		
		//ceil��ȡ���ڻ����������ֵ���С����,floor��ȡС�ڻ�����������ֵ��������
		System.out.println(Math.ceil(249.1));//250
		
		System.out.println(Math.ceil(-249.9));//-249
		
		System.out.println(Math.floor(250.9));//250
		
		System.out.println(Math.floor(-250.9));//-251
		
		//round�����������������
		System.out.println(Math.round(-249.9));//-250
	}
}

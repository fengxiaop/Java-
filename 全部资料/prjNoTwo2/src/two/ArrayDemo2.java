package two;

public class ArrayDemo2{
	  public static void main(String args[]){
	    int[] a=new int[] {10,30,40,10};
	    int[] b=new int[] {100,400,500};
	    b=a;								//����ĸ�ֵ������������������ָ��ͬһ�������ĵ�ַ�ռ�
	    System.out.println("b[0]="+b[0]);
	    System.out.println(b.length);
	    
	    b[0]=1000;
	    System.out.println("a[0]="+a[0]);  //ע�⣬�޸ĵ���b[0]��ֵ����a[0]��ֵҲ�仯��
	    System.out.println("b[0]="+b[0]);
	  }
	}     

class ArrayDemo{
   public static void main(String[] args){
    // int[] a=new int[2];			//���巽ʽ(1)���Ƚϳ��õķ�ʽ
    // a[0]=10;
    // a[1]=30;

     int[] a;						//���巽ʽ(2)���Ƚϳ��õķ�ʽ
     a=new int[3];

    // int[] a=new int[]{10,30};	//���巽ʽ(3)

    // int[] a={10,30};				//���巽ʽ(4)

    // int [] b={100,200};			//���巽ʽ(5)��һ���������һ��ͬ�������鸳ֵ���Ƚϳ��õķ�ʽ��
    // b=a;							//���ڵ�4�ַ�ʽ��ϸ�ڲμ�ArrayDemo2.java

     System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a.length);

     //ע�⣬���û���ֶ��������Ԫ�ظ�ֵ����Java����������Զ���ֵ��
     //��ֵ����Ϊ���������ݳ�ֵ��0�����������ݸ�0.0���������͸���ֵfalse��
     //�ַ������ݳ�ʼֵΪ''(���ַ�)������������
     int[] c=new int[2];
     System.out.println(c[0]+"\t"+c[1]);	//�˴���δ������Ԫ�س�ʼֵ��ϵͳ��Ĭ�ϸ���0

     double[] d=new double[2];
     System.out.println(d[0]+"\t"+d[1]);	//�˴���δ������Ԫ�س�ʼֵ��ϵͳ��Ĭ�ϸ���0.0

     boolean[] f=new boolean[2];
     System.out.println(f[0]+"\t"+f[1]);	//�˴���δ������Ԫ�س�ʼֵ��ϵͳ��Ĭ�ϸ���false

     char[] e=new char[2];
     System.out.println("��������Ľ��ǿ��ַ���"+e[0]+"\t"+e[1]);	//�˴���δ������Ԫ�س�ʼֵ��ϵͳ��Ĭ�ϸ�����ַ�
   }
}
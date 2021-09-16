class ArrayDemo{
   public static void main(String[] args){
    // int[] a=new int[2];			//定义方式(1)，比较常用的方式
    // a[0]=10;
    // a[1]=30;

     int[] a;						//定义方式(2)，比较常用的方式
     a=new int[3];

    // int[] a=new int[]{10,30};	//定义方式(3)

    // int[] a={10,30};				//定义方式(4)

    // int [] b={100,200};			//定义方式(5)用一个数组给另一个同类型数组赋值，比较常用的方式，
    // b=a;							//关于第4种方式，细节参见ArrayDemo2.java

     System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a.length);

     //注意，如果没有手动给数组的元素赋值，但Java虚拟机会有自动赋值，
     //赋值规律为：整型数据初值给0，浮点型数据给0.0，布尔类型给初值false，
     //字符型数据初始值为''(空字符)，如下面例子
     int[] c=new int[2];
     System.out.println(c[0]+"\t"+c[1]);	//此处并未给数组元素初始值，系统将默认赋予0

     double[] d=new double[2];
     System.out.println(d[0]+"\t"+d[1]);	//此处并未给数组元素初始值，系统将默认赋予0.0

     boolean[] f=new boolean[2];
     System.out.println(f[0]+"\t"+f[1]);	//此处并未给数组元素初始值，系统将默认赋予false

     char[] e=new char[2];
     System.out.println("这里输出的将是空字符："+e[0]+"\t"+e[1]);	//此处并未给数组元素初始值，系统将默认赋予空字符
   }
}
package two;

public class TestMethodOverloading{
	  // Main method
	  public static void main(String[] args){
	    // (1)���ݲ���������������
	    System.out.println("The maximum between 3 and 4 is "
	      + max(3, 4));
	    System.out.println("The maximum between 3.0 and 5.4 is "
	      + max(3.0, 5.4));
	    System.out.println("The maximum between 3.0, 5.4, and 10.14 is "
	      + max(3.0, 5.4, 10.14));

	    //(2)��������һ�£��������͵�����˳��������
	    f(1,"1");
	    f("2",2);

		//(3)ֻ�Ǳ�������˳�򻻣����Ͳ������޷����𷽷���Ҳ���޷���ɷ���������
	    //test("3",3);

	  }


	  public static int max(int num1, int num2) {			// (1)���ݲ���������������
	    if (num1 > num2)
	      return num1;
	    else
	      return num2;
	  }

	  public static double max(double num1, double num2) {
	    if (num1 > num2)
	      return num1;
	    else
	      return num2;
	  }

	  public static double max(double num1, double num2, double num3) {
	    return max(max(num1, num2), num3);
	  }

	  public static void f(int a,String b){				//(2)��������һ�£��������͵�����˳��������
	  	System.out.println("hello");
	  }

	  public static void f(String a,int b){
	  	System.out.println("world");
	  }

	  /*
	   //(3)ֻ�Ǳ�������˳�򻻣����Ͳ������޷����𷽷���Ҳ���޷���ɷ���������
	  public static void test(String a,int b){
	  	System.out.println("world");
	  }

	  public static void test(String b,int a){
	  	System.out.println("f(String b,int a)");
	  }
	  */
	}


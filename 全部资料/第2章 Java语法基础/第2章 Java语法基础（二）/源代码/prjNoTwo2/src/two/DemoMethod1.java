package two;

public class DemoMethod1 {
	/*1 test()方法的返回类型
	  2 与return后具体值的类型
	  3 与接收test()返回值的变量类型要一致*/

	public static int test(){			//1
		return 1;						//2
	}

    public static void main(String[] args) {

		int a=test()+1;					//3
		System.out.println(test());		//3 也可以将带返回值的方法看作一个确切的值来使用，比如输出该值或参加某计算

		//test();						//4 最后，从语法角度，可以不用变量去接收返回值，直接调用方法即可。当然这种用法实际含义就不大了。
    }
}


package two;

//TestPassByValue.java: Demonstrate passing values to methods
public class TestPassByValue {
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;

		System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

		// 调用交换函数，由于是值传递
		swap(num1, num2);

		// 交换后显示，数据没有交换
		System.out.println("After  invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
	}

	//自定义方法，交换两个数的值
	static void swap(int n1, int n2) {
		System.out.println("    Inside the swap method");
		System.out.println("    Before swapping n1 is " + n1 + " n2 is " + n2);

		// 交换
		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("    After  swapping n1 is " + n1 + " n2 is " + n2);
	}
}

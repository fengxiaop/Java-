package two;

//DemoMethod, 简单的范例
public class DemoMethod {
	public static void main(String args[]) {
		star(); 									// 方式一：调用star() 方法
		System.out.println("I love Java");
		DemoMethod.star(); 							// 方式二：调用DemoMethod.star() 方法
	}

	public static void star() {
													// 如果要让自定义方法能被直接调用，用static修饰
		for (int i = 0; i < 14; i++)
			System.out.print("*"); 					// 输出14个星号
		System.out.print("\n"); 					// 换行
	}
}


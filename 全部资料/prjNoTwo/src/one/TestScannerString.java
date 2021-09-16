package one;

import java.util.Scanner;							//第一步，导入类
public class TestScannerString {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);		//第二步，定义输入对象

		/**Scanner类本质是一个扫描器对象，当Scanner类用nextLine()方法接收字符串，
						其结束符是Enter键，当遇到带空格的字符串时，也可以完整接收。
		Scanner类的next()方法接收字符串，遇到带空格的字符串，则只接收空格前的有效字符部分
		比较nextLine()和next()两种方式接收字符串值“aaa bbb ccc”时的效果*/
		System.out.println("输入字符串给nextLine接收:");
		String strOne=scanner.nextLine();
		System.out.println("strOne="+strOne);
		
		System.out.println("输入字符串给next接收:");
		String strTwo=scanner.next();
		System.out.println("strTwo="+strTwo);
		
		String strThree=scanner.next();				
		//strTwo=scanner.next();只接受了aaa，剩余的字符串可以继续给下面的next方接收		
		System.out.println("strThree="+strThree);	
		
		
	}

}

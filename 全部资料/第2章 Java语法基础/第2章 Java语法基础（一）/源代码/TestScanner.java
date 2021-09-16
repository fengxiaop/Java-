import java.util.Scanner;							//第一步，导入类

public class TestScanner{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);		//第二步，定义输入对象

		int intValue=scanner.nextInt();				//第三步，接收值

		System.out.println("intValue="+intValue);

		//scanner.nextInt(2);2为基数，代表接收2进制数
		//scanner.nextInt(16);16为基数，代表接收16进制数

		boolean booleanValue=scanner.nextBoolean();
		System.out.println("booleanValue="+booleanValue);

//		nextLine()方法的结束符只是Enter键，当遇到带空格的字符串时，也可以完整接收。
//		next()方法遇到带空格的字符串，则只接收空格前的有效字符部分
		//比较nextLine()和next()两种方式接收字符串值“aaa bbb ccc”时的效果
		System.out.println("输入第一个字符串:");
		String strOne=scanner.nextLine();
		System.out.println("strOne="+strOne);

		System.out.println("输入第二个字符串:");
		String strTwo=scanner.next();
		System.out.println("strTwo="+strTwo);

		String strThree=scanner.next();
		System.out.println("strThree="+strThree);
	}
}
package one;

import java.util.Scanner;							//第一步，导入类

public class NextAndNextLine {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);		//第二步，定义输入对象
		
		int intValue=scanner.nextInt();				//第三步，接收值
//		scanner.nextLine();							//标记1：解决next、nextInt、nextDouble等方法的连用问题
		
		System.out.println("intValue="+intValue);
		
		System.out.println("输入字符串给nextLine接收:");		
		String strOne=scanner.nextLine();
		//如果没有标记1的语句，nextLine有可能未接收到值就执行完毕，因为已经接收到了一个“回车”让其结束了
		//更详细理由参见：“第2章 Java语法基础（一）/源代码/next()方法和nextLine()方法”中文章  

	}

}

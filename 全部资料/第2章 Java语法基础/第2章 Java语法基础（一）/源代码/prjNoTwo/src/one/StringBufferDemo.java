package one;

/**
*这个例子是StringBuffer的例子
*/
public class StringBufferDemo{
	public static void main(String args[]){
		StringBuffer s1=new StringBuffer("湖南工业大学计算机学院");

		System.out.println(s1.append("计算机软件"));
		System.out.println(s1.append("你说怎么样？"));

		//jdk1.5开始的版本，出现了StringBuilder
		//(1)两者的方法基本相同。
		//(2)StringBuilder的速度比StringBuffer快。数量级超过百万时，StringBuilder的速度才会体现出来。
		//(3)StringBuffer线程安全，保证同步；StringBuilder不保证同步
		StringBuilder s2=new StringBuilder("张三");
		System.out.println(s2.append("你"));
		System.out.println(s2.append("好"));
	}
}

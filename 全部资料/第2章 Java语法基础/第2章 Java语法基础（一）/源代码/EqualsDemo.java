/**
*这个例子是EqualsDemo和==的例子
*
*/
public class EqualsDemo{
	public static void main(String args[]){
		int a=10,b=10;
		String s1="abcde",s2="abcde";
		String s3=new String("abcde");

		System.out.println("a==b\t\t\t"+(a==b));

		System.out.println("s1==s2结果是：\t\t"+(s1==s2));				//判断地址相等值相同的两个对象
		System.out.println("s1.equals(s2)结果是：\t"+s1.equals(s2));	//仅仅判断值相等

		System.out.println("s1==s3结果是：\t\t"+(s1==s3));
		System.out.println("s1.equals(s3)结果是：\t"+s1.equals(s3));
	}
}
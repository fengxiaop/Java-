package one;

public class ArgsDemo{
	public static void main(String args[]){
		//1 先授权能通过main的参数args接收值
		System.out.println("args[0]="+args[0]);
		System.out.println("args[1]="+args[1]);

		int i=Integer.parseInt(args[0]);	//2 args参数接收的任何值都是字符串，若需要数值等其他类型数据，需要转换，
											//  转换思路与采用JOpitonPane的方式获取值后，转换数据的方式一致
		float f=Float.parseFloat(args[1]);
		System.out.println(i+f);
	}
}

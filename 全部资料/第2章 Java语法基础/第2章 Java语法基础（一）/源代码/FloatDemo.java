class FloatDemo{
	public static void main(String args[]){
		float f1=2.0f;			//注意在数字后加f或者F
		double f2=3.145666;
		float f3=f1+f2;			//此处编译将报错：这个f1+f2得到的计算结果为double类型
		double f4=f1+f2;

	}
}
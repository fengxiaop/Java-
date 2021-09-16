class  MathDemo{
	public static void main(String args[]){
		//求绝对值
		System.out.println(Math.abs(-12.34));
		
		//ceil获取大于或等于这个数字的最小整数,floor获取小于或等于整个数字的最大整数
		System.out.println(Math.ceil(249.1));
		System.out.println(Math.ceil(-249.9));		
		System.out.println(Math.floor(250.9));
		System.out.println(Math.floor(-250.9));
		
		//round返回四舍五入的整数
		System.out.println(Math.round(-249.9));
	}
}
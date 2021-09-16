class TestDoWhile{
	public static void main(String args[]){
		int i=2;		//¼ÆÊýÆ÷
		double jc=1;	//ÀÛ³ËÆ÷
		do{
			jc=jc*i;
			i++;
		}while(i<=10);

		System.out.println("jc="+jc);
	}
}
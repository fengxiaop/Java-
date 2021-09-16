package two;

public class ConDemo{
	public static void main(String[] args){
		int index=0;
		while(index<=9){
			index+=1;
			/*当index的值等于4时，使循环回到while语句处，而不
                            像正常处理那样去执行后面的输出语句*/
			if(index==4)
				continue;
			System.out.println("The index is "+index);
		}
	}
}


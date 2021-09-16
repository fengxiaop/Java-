package two;

public class SwapByMethod {

    public int[] show(int[] c){				//借助数组完成两个数的交换
		int temp;
		temp=c[0];
		c[0]=c[1];
		c[1]=temp;
		return c;
	}

    public static void main(String[] args) {
		int i;
		int[] a={1,2};

		System.out.print("交换之前：");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");

		SwapByMethod dd=new SwapByMethod();
		dd.show(a);

		System.out.print("\n交换之后：");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
    }
}

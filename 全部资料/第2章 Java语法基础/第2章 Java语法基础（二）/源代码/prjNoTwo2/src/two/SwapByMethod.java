package two;

public class SwapByMethod {

    public int[] show(int[] c){				//������������������Ľ���
		int temp;
		temp=c[0];
		c[0]=c[1];
		c[1]=temp;
		return c;
	}

    public static void main(String[] args) {
		int i;
		int[] a={1,2};

		System.out.print("����֮ǰ��");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");

		SwapByMethod dd=new SwapByMethod();
		dd.show(a);

		System.out.print("\n����֮��");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
    }
}

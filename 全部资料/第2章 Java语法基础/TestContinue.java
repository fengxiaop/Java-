/**
 * @(#)TestContinue.java
 *
 *100~200֮���ܱ�3����������ÿ10����һ�����
 * @author
 * @version 1.00 2017/2/23
 */

public class TestContinue {

    public static void main(String[] args) {
		int n=0;
		int i=0;
		for(n=100;n<=200;n++){
			if(n%3!=0)
				continue;
			i++;
			System.out.print(n+"\t");
			if(i%10==0)
				System.out.println();
		}
    }
}

/**
 * @(#)TestShuiXianHua.java
 *
 *水仙花数
 * @author
 * @version 1.00 2017/2/23
 */


public class TestShuiXianHua {

    public static void main(String args[]){
		int geWei=0;
		int shiWei=0;
		int baiWei=0;
		int p=0;
		System.out.println("水仙花数有：");
		for(int i=100;i<1000;i++){
			geWei=i%10;
			shiWei=(i%100)/10;
			baiWei=i/100;
			p=geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei;
			if(i==p)
				System.out.println(i);
		}

    }
}
public class JiuJiu{
	public static void main(String args[]){
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++)
				System.out.print(i+"*"+j+"="+i*j+"\t");			//�����ʽһ
			//	System.out.printf("%d*%d=%2d  ",i,j,i*j);		//�����ʽ��
			System.out.println();
		}

	}
}
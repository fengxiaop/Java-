package two;

public class ConDemo{
	public static void main(String[] args){
		int index=0;
		while(index<=9){
			index+=1;
			/*��index��ֵ����4ʱ��ʹѭ���ص�while��䴦������
                            ��������������ȥִ�к����������*/
			if(index==4)
				continue;
			System.out.println("The index is "+index);
		}
	}
}


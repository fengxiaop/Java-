import java.util.Scanner; 							//����:(1)

public class IfD{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);			//����:(2)
		String isContinue=null,grade=null;
		while(true){											//ѭ��:(1)
				System.out.print("������ɼ�(0-100):");
				double score1=s.nextDouble();		//����:(3)
				
				if(score1>100){
					grade="����ĳɼ�";
				}else if(score1>=90 ){
					grade="����";
				}else if(score1>=80 ){
					grade="����";
				}else if(score1>=70 ){
					grade="�е�";
				}else if(score1>=60 ){
					grade="����";
				}else if(score1>=0 ){
					grade="������";
				}else{
					grade="����ĳɼ�";
				}
				System.out.println(grade);
				
				System.out.print("�Ƿ����Y/N?");
				isContinue=s.next();
				if(isContinue.equalsIgnoreCase("n")){			//ѭ��:(2)
					System.out.println("�ݰݣ�����");
					break;										//ѭ��:(3)
				}
					
		}	
		
	}
}
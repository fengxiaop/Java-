// app6_4,��ά������������
public class app6_4{
  public static void main(String args[]){
     int i,j,sum=0;
     int sale[][]={{30,35,26,32},{33,34,30,29}};
                                                	 	// �������鲢��ֵ��ֵ
	 for(i=0;i<sale.length;i++){					    //�����������������������

        System.out.print("ҵ��Ա"+(i+1)+"��ҵ���ֱ�Ϊ ");

  	    for(j=0;j<sale[i].length;j++){
     	    System.out.print(sale[i][j]+" ");
     	    sum+=sale[i][j];
  	    }

  	    System.out.println();
      }

     System.out.println("\n2019����������Ϊ"+sum+"�ݱ���");
    }
}

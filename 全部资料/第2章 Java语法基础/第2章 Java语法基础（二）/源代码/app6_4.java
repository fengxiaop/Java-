// app6_4,二维数组的输入输出
public class app6_4{
  public static void main(String args[]){
     int i,j,sum=0;
     int sale[][]={{30,35,26,32},{33,34,30,29}};
                                                	 	// 声明数组并赋值初值
	 for(i=0;i<sale.length;i++){					    //输出销售量并计算总销售量

        System.out.print("业务员"+(i+1)+"的业绩分别为 ");

  	    for(j=0;j<sale[i].length;j++){
     	    System.out.print(sale[i][j]+" ");
     	    sum+=sale[i][j];
  	    }

  	    System.out.println();
      }

     System.out.println("\n2019年总销售量为"+sum+"份保单");
    }
}

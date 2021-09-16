import java.util.Scanner; 							//输入:(1)

public class IfD{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);			//输入:(2)
		String isContinue=null,grade=null;
		while(true){											//循环:(1)
				System.out.print("请输入成绩(0-100):");
				double score1=s.nextDouble();		//输入:(3)
				
				if(score1>100){
					grade="错误的成绩";
				}else if(score1>=90 ){
					grade="优秀";
				}else if(score1>=80 ){
					grade="良好";
				}else if(score1>=70 ){
					grade="中等";
				}else if(score1>=60 ){
					grade="及格";
				}else if(score1>=0 ){
					grade="不及格";
				}else{
					grade="错误的成绩";
				}
				System.out.println(grade);
				
				System.out.print("是否继续Y/N?");
				isContinue=s.next();
				if(isContinue.equalsIgnoreCase("n")){			//循环:(2)
					System.out.println("拜拜！！！");
					break;										//循环:(3)
				}
					
		}	
		
	}
}
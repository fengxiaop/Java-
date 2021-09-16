package two;

//import javax.swing.JOptionPane;

class IfDemo {
	public static void main(String[ ] args){
	//	String strValue=JOptionPane.showInputDialog(null,"请输入一个整数","输入数据",JOptionPane.QUESTION_MESSAGE);
	//	int testscore=Integer.parseInt(strValue);

		int testscore=88;
		String grade;
		if(testscore>100){
			grade="错误的成绩";
		}else if(testscore>=90){
			grade="grade is:A";
		}else if(testscore>=80){
			grade="grade is:B";
		}else if(testscore>=70){
			grade="grade is:C";
		}else if(testscore>=60){
			grade="grade is:D";
		}else if(testscore>=0){
			grade="grade is:F";
		}else{
			grade="错误的成绩";
		}
		System.out.println(grade);
	}
}
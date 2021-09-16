package one;

import javax.swing.JOptionPane;	//第一步

public class DemoOption {

    public static void main(String[] args) {
        String str=JOptionPane.showInputDialog(null,"input a int:","Enter",JOptionPane.QUESTION_MESSAGE);
        //第二步，弹出对话框接收数据，数据全部按字符串类型接收，因此要变成整型、双精度等其他数据类型，需要转换
        int i=Integer.parseInt(str);		//第三步，转换数据类型，将字符串转换成整形
        System.out.println(i+10);

		//涉及到其他数据类型，都有类似用法
        str=JOptionPane.showInputDialog(null,"input a double:","Enter",JOptionPane.QUESTION_MESSAGE);
        double j=Double.parseDouble(str);	//第三步，转换数据类型，将字符串转换成双精度
        System.out.println(j+10);
    }
}
package one;

import javax.swing.JOptionPane;	//��һ��

public class DemoOption {

    public static void main(String[] args) {
        String str=JOptionPane.showInputDialog(null,"input a int:","Enter",JOptionPane.QUESTION_MESSAGE);
        //�ڶ����������Ի���������ݣ�����ȫ�����ַ������ͽ��գ����Ҫ������͡�˫���ȵ������������ͣ���Ҫת��
        int i=Integer.parseInt(str);		//��������ת���������ͣ����ַ���ת��������
        System.out.println(i+10);

		//�漰�������������ͣ����������÷�
        str=JOptionPane.showInputDialog(null,"input a double:","Enter",JOptionPane.QUESTION_MESSAGE);
        double j=Double.parseDouble(str);	//��������ת���������ͣ����ַ���ת����˫����
        System.out.println(j+10);
    }
}
package one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//����Scanner��ȡ�ļ�
public class TestScannerForFile {
	public static void main(String[] args) {
		Scanner s = null;   
        try {               
			s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\����\\Desktop\\javaȫ����Դ\\�½��ļ���\\prjNoTwo\\src\\new.txt")));
            //ʹ���ַ���jdk��Ϊ�ָ���   
            s.useDelimiter("jdk");   
            while (s.hasNext()) {   
                System.out.println(s.next());   
            }   
        } catch (FileNotFoundException e) {
			System.out.println("ϵͳ�Ҳ���ָ�����ļ�");			
		} finally {   
            if (s != null) {   
                s.close();   
            }   
        } 

	}

}

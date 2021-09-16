package one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//借助Scanner读取文件
public class TestScannerForFile {
	public static void main(String[] args) {
		Scanner s = null;   
        try {               
			s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\风萧\\Desktop\\java全部资源\\新建文件夹\\prjNoTwo\\src\\new.txt")));
            //使用字符串jdk作为分隔符   
            s.useDelimiter("jdk");   
            while (s.hasNext()) {   
                System.out.println(s.next());   
            }   
        } catch (FileNotFoundException e) {
			System.out.println("系统找不到指定的文件");			
		} finally {   
            if (s != null) {   
                s.close();   
            }   
        } 

	}

}

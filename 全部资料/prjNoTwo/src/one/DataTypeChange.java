package one;

//8��������������Ϊ��byte short int long double float char boolean
//8����װ����Ϊ��  Byte Short Integer Long Double Float Character Boolean
//��ν�����װ���ͣ����ַ���ת���ɸ�����Ӧ�Ļ�����������
public class DataTypeChange {
	public static void main(String[] args) {			
		//int
		String strA="10";
		int intA=Integer.parseInt(strA);
		System.out.println("strA="+strA+"\n");
		//byte by=Byte.parseByte("1");			//byte short�Դ�����
		//short sh=Short.parseShort("2");
		
		//long
		String strB="100";
		long longB=Long.parseLong(strB);
		System.out.println("strB="+strB+"\n");

		//float
		String strC="2.5";
		float floatE=Float.parseFloat(strC);
		System.out.println("strC="+strC+"\n");
		
		//double
		String strD="3.5";
		double doubleD=Double.parseDouble(strD);
		System.out.println("doubleD="+doubleD+"\n");
		
		//char ���������ת�����������⣬����ʾ���ת���ַ���
		char strE[]={'h','e','l','l','o'};
		String strE2=String.valueOf(strE);	//����һ
		System.out.println("strE2="+strE2+"\n");
		
		String strE1=new String(strE);		//������
		System.out.println("strE1="+strE1+"\n");
		
		//boolean 
		String strF="true";
		boolean boolF=Boolean.parseBoolean(strF);
		System.out.println("boolF="+boolF+"\n");
		
				
	}

}

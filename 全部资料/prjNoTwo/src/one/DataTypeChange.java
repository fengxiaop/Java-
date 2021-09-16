package one;

//8个基本数据类型为：byte short int long double float char boolean
//8个封装类型为：  Byte Short Integer Long Double Float Character Boolean
//如何借助封装类型，将字符串转换成各个对应的基本数据类型
public class DataTypeChange {
	public static void main(String[] args) {			
		//int
		String strA="10";
		int intA=Integer.parseInt(strA);
		System.out.println("strA="+strA+"\n");
		//byte by=Byte.parseByte("1");			//byte short以此类推
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
		
		//char 这个不存在转基本类型问题，故演示如何转成字符串
		char strE[]={'h','e','l','l','o'};
		String strE2=String.valueOf(strE);	//方案一
		System.out.println("strE2="+strE2+"\n");
		
		String strE1=new String(strE);		//方案二
		System.out.println("strE1="+strE1+"\n");
		
		//boolean 
		String strF="true";
		boolean boolF=Boolean.parseBoolean(strF);
		System.out.println("boolF="+boolF+"\n");
		
				
	}

}

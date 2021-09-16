package one;

public class Math1{
    public static void main(String args[]){
       System.out.println("PI="+Math.PI);	//3.14
       
       System.out.println("abs(-6.5)="+Math.abs(-6.5));	//6.5
       
       System.out.println("round(6.5)="+Math.round(6.5));	//7.0
       
       System.out.println("Math.max(-2.5,-3)="+Math.max(-2.5,-3));	//-2.5
       
       System.out.println("random()="+Math.random());
       
       double i=Math.sqrt(9);
       
       String str="aaa",str1="aaa";
       System.out.println(str.equals(str1));
       System.out.println(str.length());
    }	    
}
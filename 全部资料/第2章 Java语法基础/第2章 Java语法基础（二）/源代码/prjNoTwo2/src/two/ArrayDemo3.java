package two;

public class ArrayDemo3{
	  public static void main(String args[]){
	    int a[][];
	    a=new int[3][];			//定义行
	    
	    a[0]=new int[1];		//为不同行定义不同个数的元素
	    a[1]=new int[2];
	    a[2]=new int[3];
	    
	    a[0][0]=100;
	    
	    for(int i=0;i<a.length;i++){
	    	for(int j=0;j<a[i].length;j++){
	    		System.out.print(a[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    	
	  }
	}  
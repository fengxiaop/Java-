public class BreDemo{
     public static void main(String[ ] args) {
        int index=0;
        while (index<=10) {
            index+=1;
            if(index==4)
            	break;

           /* 当index的值大于10时，循环将终止。但有一种特殊的情况，如果index的值等于4，循环也将立即终止。*/
            System.out.println("The index is "+index);
          }
  	}
}

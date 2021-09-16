
public class MaxMin{
	public static void main(String[] args){
		int i,s=0;
		double max=0,min=100,temp,d;
		for(i=0;i<100;i++){	
			d=100*Math.random();
			temp=Math.floor(d);
			if(temp>max)
				max=temp;
			if(temp<min)
				min=temp;
			if(temp>50)
				s++;
			//System.out.println(d+"   "+temp);
		}
		System.out.println("Max="+max+" Min="+min+" s="+s);
	}
}

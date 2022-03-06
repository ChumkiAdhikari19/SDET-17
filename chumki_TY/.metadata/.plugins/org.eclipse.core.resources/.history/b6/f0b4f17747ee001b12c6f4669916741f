package ArrayProgramm;

public class FindScndMaxMinEle {
	
	public static void main(String[] args) {
		int [] ar= {50,89,75,10,100,56};
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("1st max is = " +ar[0]);
		System.out.println("2nd max is = " +ar[1]);
		System.out.println("1st min is = " +ar[ar.length-1]);
		System.out.println("2nd min is = " +ar[ar.length-2]);

	}
}

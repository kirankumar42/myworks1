package selenium.java;

public class DecimalToBinary {

	
	public static void main(String[] args) {
		
		int num=14;	
		int index=0;
		int binary[]=new int[14];
		while(num>0){
			binary[index++]=num%2;
			num=num/2;
			//System.out.println("This is num " +num);
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(binary[i]);
		}

	}

}

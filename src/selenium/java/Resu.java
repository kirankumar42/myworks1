package selenium.java;

public class Resu {

	
	public static void main(String[] args) {
		
		String str="pruthvi";
		char[] c=str.toCharArray();
		int left,right=0;
		right=c.length-1;
		for(left=0;left<right;left++, right--){
			char temp=c[left];
			c[left]=c[right];
			c[right]=temp;
		}
		for(char ch:c){
			System.out.print(ch);
		}
		System.out.println();
	
	}

}

package selenium.java;

public class UpperLower {
	public static void main(String[] args) {
		String str="kaLYAn";
		char[] cha=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.print("This is upper case letters: "+ch);
			}
			
			else if(Character.isLowerCase(ch))
			{
				System.out.print("this iss lowwer case : "+ch);
			}
			System.out.println();
		}

	}

}

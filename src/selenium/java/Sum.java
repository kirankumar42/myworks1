package selenium.java;

import java.util.Scanner;

public class Sum {
	
	static int add(int x, int y)
    {
        int carry;
        while(y!=0)
        {
            carry = x & y;
            System.out.println("carry:"+carry);
            x = x ^ y;
            System.out.println("X value"+x);
            y = carry << 1;
            System.out.println("Y value:"+y);
        }
        return x;   
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to be added:");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("The Summation is: "+add(x, y));
        input.close();
    }

}

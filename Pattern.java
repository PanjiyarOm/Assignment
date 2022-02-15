import java.util.Scanner;
class Pattern {
     public static void main(String[] args)
     {
    	Scanner get=new Scanner(System.in);
    	System.out.println("Enter the row");
    	int rows=get.nextInt();
    	for(int i=rows-1; i>=0; i--)
    	{
    		for(int j=0; j<=i; j++)
    		{
    			System.out.print("* "+ " ");
    		}
    		System.out.println();
    	}
    	 
     }
}

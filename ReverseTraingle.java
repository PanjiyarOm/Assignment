import java.util.Scanner;
class ReverseTraingle
{
   public static void main(String[] args)
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the number of rows and coloumn");
	   int n=input.nextInt();
	   for(int i=1; i<=n; i++)
	   {
		   for(int j=i; j<=n; j++)
		   {
			   System.out.print("* "+ "");
		   }
		   
		   System.out.println();
	   }
   }
}

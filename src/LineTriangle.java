
public class LineTriangle {
	public static void main(String[] args) {
		for  (int i=1;i<=5;i++)
		    {
		  for (int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
		  for (int r=1; r<(i*2);r++)
			{
			 if (r>1 && r<((i*2)-1) )
				{
					System.out.print(" ");
				}
			else 
				{
					System.out.print("*");
				}
			}
				
			
			System.out.println();
		}
	}
}
	
	



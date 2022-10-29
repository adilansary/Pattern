import java.util.Scanner;

public class Patterntwo {
  
	
	public static void main(String []args) {
		//int n;
		//Scanner 
 
    for(int i=1;i<=5;i++) {
      for(int j=i;j<=5-1;j++) {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++) {
        System.out.print(j);
      }
      for(int j=i-1;j>=1;j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
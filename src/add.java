import java.io.*;
import java.util.Scanner;

public class add {
	
	public static int add(int z, int y, int x) throws IOException{
		return 0;
	}
	
	public static int add2(int z, int y, int x) throws IOException{
		
		FileReader f = new FileReader("numbers.txt");
		Scanner s = new Scanner(f);
		
		if(s.hasNext()) 
		{
			z = s.nextInt();
			System.out.println("Z: " + z);
			y = s.nextInt();
			System.out.println("Y: " + y);
			x = s.nextInt();
			System.out.println("X: " + x+ '\n');
	
			int a = z*y + x;
			System.out.println("A:Z*Y + X = " + a );
			int b = z/y + (x*10);			
			System.out.println("B: Z/Y + (x*10) = " + b );
			int c = y*z/2;
			System.out.println("C: Y*Z/2 = " + c + '\n' );
			
			if ( z <= 25 && y >= 10 ){
				a = y + x;
				System.out.println("A: " + a);
				b = z + y;
				System.out.println("B: " + b);
			}
			else if(z >= 100){
				System.out.println("Please enter a value less than 100 for Z");
				System.out.println("Enter z: ");
				z = s.nextInt();
			}
			else {
				System.out.println("Z: " + z+ '\n');
				System.out.println("Z is not equal to nor greater than 25");
				System.out.println("Y is not equal to nor less than 10\n");
			}
	
			System.out.println("C: " + c);
		}	
		else {
			System.out.println("Error");
		}
		
		return 0; 
	} 
}
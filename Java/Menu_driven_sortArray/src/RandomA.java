import java.util.Random;
import java.util.Scanner;
public class RandomA 
{
	public int[] randomArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		int size = sc.nextInt();

		int[] rand=new int[size];
		for(int i=0;i<size;i++)
			{
				rand[i]=sc.nextInt();
			}
		return rand;
	}
	
}

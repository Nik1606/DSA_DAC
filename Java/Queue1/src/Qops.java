
public class Qops 
{
	static int front=0;
	static int rear=0;
	static int arr[]=new int[5];
	
	public static void main(String[] args) 
	{
		
		
	}
	
	public static void Enque(int n)
	{
		//check stack overflow 
		if(rear > arr.length-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			arr[rear]=n;
			++rear;
		}
	}
	
	public static int Dequeue()
	{
		int value= arr[front];
		++front;
		return value;
		
	}
}

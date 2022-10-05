
public class Numbers {
	int num;
	
	public Numbers()
	{
		num=0;
	}
	
	public Numbers(int n)
	{
		this.num=n;
	}
	
	public void setNum(int n)
	{
		num=n;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public String toString()
	{
		return "num = "+num+"";
	}
}

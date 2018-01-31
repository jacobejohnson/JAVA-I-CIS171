//Jacob Johnson
public class MultiplicationTableJohnson 
{
	public static void main(String[] args) 
	{
		final int NMAX = 12;
		final double XMAX = 12;
		
		for (double x = 1; x <= XMAX; x++) 
		{
			for (int n = 1; n <= NMAX; n++) 
			{
				System.out.printf("%4.0f", x * n);
			}
			System.out.println();
		}
	}
}


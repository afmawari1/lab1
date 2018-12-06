
import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {

	@Test
	public void test() 
	{
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort()
	{
		
	}
	public void testPositive()
	{
		int[]arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		
		SelectionSort temp = new SelectionSort();
		int[] maxValue = new int[5];
		 maxValue =temp.basicSelectionSort(arr);
		 assertArrayEquals("Error,", maxValue, Sortedarr);	
		System.out.println("Test positive passed");
	}
	public void testNegative()
	{
		int[]arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		
		SelectionSort temp = new SelectionSort();
		int[] maxValue = new int[5];
		 maxValue =temp.basicSelectionSort(arr);
		 assertArrayEquals("Error,", maxValue, Sortedarr);	
		System.out.println("Test Negative passed");
	}
	public void testMixed()
	{
		int[]arr = new int[5];
		arr[0] = 0;
		arr[1] = -9;
		arr[2] = 0;
		arr[3] = -10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = 0;
		Sortedarr[3] = 0;
		Sortedarr[4] = 2;
		
		SelectionSort temp = new SelectionSort();
		int[] maxValue = new int[5];
		 maxValue =temp.basicSelectionSort(arr);
		 assertArrayEquals("Error,", maxValue, Sortedarr);	
		System.out.println("Test Mixed passed");
	}
	public void testDuplicates()
	{
		int[]arr = new int[5];
		arr[0] = 2;
		arr[1] = -10;
		arr[2] = 0;
		arr[3] = -10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -10;
		Sortedarr[2] = 0;
		Sortedarr[3] = 2;
		Sortedarr[4] = 2;
		
		SelectionSort temp = new SelectionSort();
		int[] maxValue = new int[5];
		 maxValue =temp.basicSelectionSort(arr);
		 assertArrayEquals("Error,", maxValue, Sortedarr);	
		System.out.println("Test Duplicates passed");
	}


}

package goofy.stuff.modulomath;

import java.util.ArrayList;

public class NonModulo
{
	public int[] findMultiplesWithMod(int min, int max)
	{
		ArrayList<Integer> multiples = new ArrayList<Integer>();

		for (int i = min; i <= max; i++)
		{
			if ( (i % 3 == 0) || (i % 5 == 0) )
			{
				multiples.add(i);
			}
		}
		
		return convertIntArrListToArr(multiples);
	}
	
	public int[] findMultiplesWithoutMod(int min, int max)
	{
		
		ArrayList<Integer> multiples = new ArrayList<Integer>();

		for (int i = min; i <= max; i++)
		{
			
			if ( (calcRemainder(i, 3) == 0) || (calcRemainder(i, 5) == 0) )
			{
				multiples.add(i);
			}
		}

		return convertIntArrListToArr(multiples);
	}
	
	public int calcRemainder(int a, int b) //  a%b
	{
		int d = Math.floorMod(a, b);
		return d;
	}
	
	public int[] convertIntArrListToArr(final ArrayList<Integer> multiples)
	{
		int sizeMultArr = multiples.size();
		
		int[] multArr = new int[sizeMultArr];
		
		for (int i = 0; i < sizeMultArr; i++)
		{
			multArr[i] = multiples.get(i);
		}
		
		return multArr;
	}
}

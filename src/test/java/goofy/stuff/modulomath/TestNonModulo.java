package goofy.stuff.modulomath;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestNonModulo
{
	
	@Test
	void testFindMultiplesWithMod()
	{
		NonModulo noMo = new NonModulo();
		int [] multiples = noMo.findMultiplesWithMod(1, 16); // 3, 5, 6, 9, 10, 12, 15
		
		for (int mult : multiples)
		{
			System.out.println("multiples by modulo: " + mult);
		}
	}
	
	@Test
	void testFindMultiplesWithoutMod()
	{
		NonModulo noMo = new NonModulo();
		int[] multiples = noMo.findMultiplesWithoutMod(1, 16); // 3, 5, 6, 9, 10, 12, 15
		
		for (int mult : multiples)
		{
			System.out.println("multiples by multiplication: " + mult);
		}
	}

	@Test
	void testConvertIntArrListToArr()
	{
		NonModulo noMo = new NonModulo();
		
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		multiples.add(1);
		multiples.add(2);
		multiples.add(3);

		int[] mods = noMo.convertIntArrListToArr(multiples);
		
		assertEquals(3, mods.length);
	}

}

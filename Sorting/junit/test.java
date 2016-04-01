import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		Sorting s = new Sorting(); 
		int []num = {2,1,4,3,5,8,6,11,13,12,15,20};
		s.insertionSort(num);
		assertEquals(true,s.isSorted(num)); 
		Sorting s1 = new Sorting();
		int []num1 = {2,1,4,3,5,8,6,11,13,12,15,20};
		s1.quicksort(num1);
		assertEquals(true,s1.isSorted(num1)); 
		
		Sorting s2 = new Sorting(); 
		int []num2 = {20,14,-1,2,1,4,3,5,8,6,11,13,12,15,20,100};
		s2.insertionSort(num2);
		assertEquals(true,s.isSorted(num2)); 
		
	}

}

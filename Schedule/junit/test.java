import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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

	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		Schedule s = new Schedule();
		Work w = new Work("t1",0,1);
		Work w1 = new Work("t2",1,2);
		List<Work> l = new ArrayList<Work>();
		l.add(w);l.add(w1);
		
		List<Double> result = new ArrayList<Double>();
	    result.add(1.5);result.add(1.0);
		assertEquals(result,s.FCFS(l));
		
		List<Double> result1 = new ArrayList<Double>();
	    result1.add(1.5);result1.add(1.0);
		assertEquals(result1,s.SJF(l));
		
		
		Schedule s1 = new Schedule();
		Work ww = new Work("t1",10,30);
		Work ww1 = new Work("t2",10,40);
		Work ww2 = new Work("t3",20,10);
		Work ww3 = new Work("t4",30,20);
		List<Work> l1 = new ArrayList<Work>();
		l1.add(ww);l1.add(ww1);l1.add(ww2);l1.add(ww3);
		
		List<Double> result2 = new ArrayList<Double>();
	    result2.add(50.0);result2.add(2.125);
	
		assertEquals(result2,s1.SJF(l1)); 
		
	}
	
	


}

package lab8;

import static org.junit.Assert.*;
import java.lang.*;

import static java.lang.System.setOut;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class test {
	PrintStream old = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(baos);
	
	@Before                                         
    void setUp() {
		System.setOut(ps);
    	//System.setOut(old);
    }
	
	@Test
	public void testPredicate() {
		CheckIt.checkIt(true, true, true);
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(false,  false,  false);
		assertEquals("P isn't true", baos.toString().trim());
	}
	@Test
	public void testClause() {
		CheckIt.checkIt(true, true, true);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(false, false, false);	
		assertEquals("P isn't true", baos.toString().trim());
	}
	@Test
	public void testCombinatorial()
	{
		CheckIt.checkIt(true, true, true);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(true, true, false);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(true, false, true);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(true, false, false);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(false, true, true);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(false, false, true);	
		assertEquals("P isn't true", baos.toString().trim());
		CheckIt.checkIt(false, true, false);	
		assertEquals("P isn't true", baos.toString().trim());
		CheckIt.checkIt(false, false, false);	
		assertEquals("P isn't true", baos.toString().trim());
	}
	@Test
	public void testCACC() {
		CheckIt.checkIt(true, true, true);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(false, false, false);	
		assertEquals("P isn't true", baos.toString().trim());
	}
	@Test
	public void testRACC() {
		CheckIt.checkIt(true, true, true);	
		assertEquals("P is true", baos.toString().trim());
		CheckIt.checkIt(false, true, true);	
		assertEquals("P is true", baos.toString().trim());
	}
	@Test
	public void testPc() {
		CheckIt.checkIt(true, false, false);	
		assertEquals("P is true", baos.toString().trim());
	}

}

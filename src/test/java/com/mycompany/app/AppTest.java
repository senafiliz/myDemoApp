package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void testNullArray1() {
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 3, 3, 8, 12, 27, 44));
      assertEquals("not true", new App().method(null,array2,"bil481 homework", 4));
    }
    
    public void testNullString() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 3, 3, 8, 12, 27, 44));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 3, 3, 8, 12, 27, 44));
      assertEquals("not true", new App().method(array1,array2,null, 4));
    }

    public void testNumGreaterThanArrayLength() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 3, 3, 8, 12, 27, 44));
      assertEquals("not true", new App().method(array1, array2, "bil481 homework", 5));
    }
    
    public void testIndexGreaterThanStringLength() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 50));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 3, 3, 8, 12, 27, 44));
      assertEquals("not true", new App().method(array1, array2, "bil481 homework", 4));
    }

    public void testCorrect() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 50));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 3, 3, 8, 12, 27, 44));
      assertEquals("1 homeworkbil48", new App().method(array1, array2, "bil481 homework", 1));
    }

}

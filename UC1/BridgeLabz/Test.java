package com.TestMaximum.UC1.BridgeLabz;
import org.junit.Test;

public class Test {
	{
	    @Test
	    public void TC1()
	    {
	        int result=Findmax.max(30,20,10);
	        assertEquals(30,result);
	    }
	    @Test
	    public void TC2()
	    {
	        int result=Findmax.max(20,30,10);
	        assertEquals(30,result);
	    }
	    @Test
	    public void TC3()
	    {
	        int result=Findmax.max(20,10,30);
	        assertEquals(30,result);
	    }

	}

}

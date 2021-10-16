package com.TestMaximum.UC4.BridgeLabz;

public class ExtendMaxMethod {
	  
	    public void TC1()
	    {
	        int result=ExtendMaxMethod.max(30,20,10);
	        assertEquals(30,result);
	    }
	    
	    public void TC2()
	    {
	        int result=ExtendMaxMethod.max(20,30,10);
	        assertEquals(30,result);
	    }
	    
	    public void TC3()
	    {
	        int result=ExtendMaxMethod.max(20,10,30);
	        assertEquals(30,result);
	    }
	    
	    public void floatMaxTC1()
	    {
	        float result=ExtendMaxMethod.max(5.5f,0.01f, 1.02f);
	        assertEquals(5.5f,result,0.0f);
	    }
	    
	    public void floatMaxTC2()
	    {
	        float result=ExtendMaxMethod.max(0.01f,5.5f, 1.02f);
	        assertEquals(5.5f,result,0.0f);
	    }
	    public void floatMaxTC3()
	    {

	        float result=ExtendMaxMethod.max(0.01f,1.02f, 5.5f);
	        assertEquals(5.5f,result,0.0f);
	    }
	    
	    public void StringMaxTC1()
	    {
	        String result=ExtendMaxMethod.max("Apple","Peach","Banana");
	        assertEquals("maximum result","Peach",result);
	    }
	    
	    public void StringMaxTC2()
	    {
	        String result=ExtendMaxMethod.max("Apple","Bananna","Peach");
	        assertEquals("maximum result","Peach",result);
	    }
	    
	    public void StringMaxTC3()
	    {
	        String result=ExtendMaxMethod.max("Peach","Bananna","Apple");
	        assertEquals("maximum result","Peach",result);
	    }
}
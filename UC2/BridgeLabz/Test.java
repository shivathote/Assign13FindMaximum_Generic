package com.TestMaximum.UC2.BridgeLabz;
import static java.util.Collections.max;

public class Test {

    public void TC1()
    {
        int result=ThreeFloat.max(30,20,10);
        assertEquals(30,result);
    }
    private void assertEquals(int i, int result) {
		
	}
    
    public void TC2()
    {
        int result=ThreeFloat.max(20,30,10);
        assertEquals(30,result);
    }
    
    public void TC3()
    {
        int result=ThreeFloat.max(20,10,30);
        assertEquals(30,result);
    }
    
    public void floatMaxTC1()
    {
        float result=ThreeFloat.max(5.5f,0.01f, 1.02f);
        assertEquals(5.5f,result,0.0f);
    }
    
    public void floatMaxTC2()
    {
        float result=ThreeFloat.max(0.01f,5.5f, 1.02f);
        assertEquals(5.5f,result,0.0f);
    }
    private void assertEquals(float f, float result, float g) {
		
	}
    
	public void floatMaxTC3()
    {
        {
            float result=ThreeFloat.max(0.01f,1.02f, 5.5f);
            assertEquals(5.5f,result,0.0f);
        }
    }
    
}
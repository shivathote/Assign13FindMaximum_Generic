package com.TestMaximum.UC1.BridgeLabz;
import static java.util.Collections.max;

public class GivenThreeIntegers {
	 public static <T extends Comparable<T>> T max(T x,T y,T z)
	    {
	        return max(max(x,y),z);
	    }

	    private static <T extends Comparable<T>> T max(T x, T y)
	    {
	        if (x.compareTo(y)>0)
	        {
	            return x;

	        }
	        return y;
	    }
	
}

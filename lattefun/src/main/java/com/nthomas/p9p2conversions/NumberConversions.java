package com.nthomas.p9p2conversions;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberConversions {
	
	public String numberize(int i)	{
    NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
    DecimalFormat df = (DecimalFormat) numberFormat;
    df.applyPattern("#.00");
    df.setGroupingUsed(true);
    df.setGroupingSize(3);
    return df.format(i);
	}
    
    
}

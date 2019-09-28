package com.raj.nola.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        double payment = Double.parseDouble(args[0]);

        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        
        if( (payment >0) && (payment < Math.pow(10, 9))) {
        	
        	System.out.println("US: "+usFormat.format(payment));

        	System.out.println("India: "+inFormat.format(payment));
        	
        	System.out.println("China: "+cnFormat.format(payment));
        	
        	System.out.println("France: "+frFormat.format(payment));
        	
        	
        }else  {
        	
        	System.out.println("Value Entered should be in the range of 0 to 10\u2079");
        }

	}

}

package com.yash.Java8;

public class Print3dot {

	/*
	 * public String printThreeDot(String connect) throws InterruptedException {
	 * 
	 * String con1 = connect + "."; Thread.sleep(5000); String con2 = con1 + ".";
	 * Thread.sleep(5000); String con3 = con2 + "."; System.out.println(con3);
	 * return con3;
	 * 
	 * }
	 */
	public static void main(String[] args) throws InterruptedException {
		//new Print3dot().printThreeDot("Connecting");
		int count = 1;
		try{
		    while( true ){
		        Thread.sleep( 500 );

		        for( int i = 0; i < count; i++ );
		        System.out.print("." );
		        
		        count++;
		        if( count >= 4 ) 
		        	break;
		        Runtime.getRuntime().exec("clear");
		        //count--;
		    }
		}
		catch( Exception e ){
		    e.printStackTrace();
		}
	}
}

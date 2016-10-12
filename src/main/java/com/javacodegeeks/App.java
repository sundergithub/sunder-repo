package com.javacodegeeks;

/**
 * Hello world!
 *
 */
public class App 
{
    public String reverseString(String src){
    	return new StringBuilder(src).reverse().toString();
    }
	
	public static void main( String[] args )
    {
        final String str ="Hello!";
		App appObject = new App();
        System.out.println( "Thre reverse strinf of\""+ str + "\" is \""+ 
		                      appObject.reverseString(str) + "\"" );
        System.out.println("This is done!");
        System.out.println("This is second time change!");
    }
}

package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionBaseClass  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void testChildException() throws FileNotFoundException  {
		System.out.println(" Test IoException ");
		throw  new FileNotFoundException();
	}
	
	
	public void testBaseException() throws  IOException{
		throw  new IOException ();
	}

}

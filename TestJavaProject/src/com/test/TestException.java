package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		
		ExceptionBaseClass exceptionBaseClass = new ExceptionBaseClass();
		
		try {
			try {
				exceptionBaseClass.testBaseException();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}

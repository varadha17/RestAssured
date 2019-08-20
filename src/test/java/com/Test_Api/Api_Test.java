package com.Test_Api;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.API_Testing.Testing_Api;

public class Api_Test extends Testing_Api {
	
	
	@Test
	public void getDetails_Api_Test() throws EncryptedDocumentException, IOException {
		
		getDetails();
		
	}
	
	@Test
	public void getDetails_APi_Test2() throws EncryptedDocumentException, IOException {
		
		getDeatils2();
		
	}

}

package com.API_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testing_Api {
	
	public static RequestSpecification httprequest;
	public static Response res;
	public static String responseBody, getDataFromSheet;
	public static FileInputStream fis;
	public static Workbook wb;

	
	public static void getDetails() throws EncryptedDocumentException, IOException {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		httprequest = RestAssured.given();
		
		for(int i=1; i<=5;i++) {
		
		res = httprequest.request(Method.GET, Excel_data(i,0));
		
		responseBody = res.getBody().asString();
		
		System.out.println("Response:"+responseBody);

		
		}

	}
	
	public static void getDeatils2() throws EncryptedDocumentException, IOException {
		
		RestAssured.baseURI = "https://www.youtube.com";
		
		httprequest = RestAssured.given();
		
		for(int i=1; i<=2;i++) {
		
		res = httprequest.request(Method.GET, Excel_data(i,1));
		
		responseBody = res.getBody().asString();
		
		System.out.println("Response:"+responseBody);
		
		}
		
		
	}
	
	public static String Excel_data(int r, int c) throws EncryptedDocumentException, IOException {
		
		fis = new FileInputStream("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\API\\Excel\\Excel_File\\Rest.xlsx");
		
		wb = WorkbookFactory.create(fis);
		
		getDataFromSheet = wb.getSheet("Assure").getRow(r).getCell(c).getStringCellValue();
		
		return getDataFromSheet;
		
	}

}

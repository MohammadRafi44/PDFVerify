package pdfVerify;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.github.lkkushan101.PDFVerify.PDFVerify;


public class PDFVerifyExample {
	
	@Test
	public void PDF_Verify_01() throws IOException {
		
		/*
		 * Source Link:
		 * https://www.linkedin.com/posts/kushana_just-released-the-pdf-verify-api-100-activity-6773415671641518080-oGuK 

				The PDF Verify API 1.00. Now you can verfy contents and images of PDF documents in a single method call in your Selenium Test Automation Framework.
				Add the following dependency
				<dependency>
				<groupId>com.github.lkkushan101.PDFVerify</groupId>
				<artifactId>com.github.lkkushan101.PDFVerify</artifactId>
				<version>1.0</version>
				</dependency>
				
				Call the following methods to verify text
					PDFVerify.VerifyOnlinePDFContent(<URL of the document>, <text to verify>);
					PDFVerify.VerifyTextLocalPDF(<file path of the document>, <text to verify>);
				Call the following methods to verify image
					PDFVerify.VerifyImage(<file path>, <base image path>)
		*/
		
		
//		--need to resolve this Throwing some IO exception 
		PDFVerify.VerifyOnlinePDFContent("https:\\home.cs.colorado.edu\\~kena\\classes\\5828\\s12\\lectures\\05-introtesting.pdf", "Testing");

		//		--works fine 
//		PDFVerify.VerifyTextLocalPDF("C:\\Users\\mohammad.shaikh\\Documents\\Mohammad Rafi Shaik-CV.pdf", "Certified");
				
		//- need to resolve
		//		Call the following methods to verify image
//		final File f = new File("C:\\Users\\mohammad.shaikh\\Documents\\ImageForPDFVerify.png");
//		final File f = new File("C:\\Users\\mohammad.shaikh\\Documents\\FailPDFVerfiy.png");
		
//		PDFVerify.VerifyImage("C:\\Users\\mohammad.shaikh\\Documents\\Mohammad Rafi Shaik-CV.pdf",f, "Fail");
//		PDFVerify.VerifyImagePDFImageOnline(null, null, null);
	}
	
}

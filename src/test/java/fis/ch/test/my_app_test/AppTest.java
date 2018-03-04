package fis.ch.test.my_app_test;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * Unit test for simple App.
 */
public class AppTest
{

	public static void main (String[] args){
		AppTest app = new AppTest();
		app.runTestNgProgrammatically();
	}
	
	protected void runTestNgProgrammatically() {
		TestNG testng = new TestNG();
		testng.setOutputDirectory("output-scenarios");
		
		/**
		 * Disable default Listeners
		 * TestHTMLReporter
		 * JUnitXMLReporter 
		 * XMLReporter 
		 */
		testng.setUseDefaultListeners(false);
		
		CustomerReporter reporter = new CustomerReporter();
		testng.addListener(reporter);
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		/**
		 * Suite 1
		 */
		
		XmlSuite suiteZ = new XmlSuite();
		suiteZ.setName("SuiteZ");
		
		
		XmlTest testB = new XmlTest(suiteZ);
		testB.setName("suite_z_test_b");
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass(TestCase.class));
		
		testB.setXmlClasses(classes) ;
		
		/**
		 * Suite 2
		 */
		XmlSuite suiteW = new XmlSuite();
		suiteW.setName("SuiteW");
		
		XmlTest testA = new XmlTest(suiteW);
		testA.setName("suite_w_test_a");
		
		List<XmlClass> classes2 = new ArrayList<XmlClass>();
		classes2.add(new XmlClass(TestCaseA.class));
		
		testA.setClasses(classes2);
		
		
		suites.add(suiteW);
		suites.add(suiteZ);
		
		
		testng.setXmlSuites(suites);
		testng.run();
	}

}

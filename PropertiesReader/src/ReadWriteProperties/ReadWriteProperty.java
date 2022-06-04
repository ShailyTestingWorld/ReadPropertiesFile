package ReadWriteProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperty {
	
	public static void main(String[] args) throws IOException {
		
		try {   // side baar main yeh hamaray program main lana hain 
			// read give address
			// construtor kay undur method main path diya hain property file ka 
			FileInputStream readsaveconfig=new FileInputStream(System.getProperty("user.dir")+"//src//propertyFile//config.properties");
			   // load
			Properties config=new Properties();
			     config.load(readsaveconfig); // load method  jee jo input strram nay filee read kee vo load kur do memepry main 
			     
			       // get key value -- get propertymethod 
			    String saveurl= config.getProperty("url"); // url key hain , propeties file main , ooskee value yaha aay gee hum save karay aut print .
			        String emailsave = config.getProperty("emailid");
			             String passwordsave  =  config.getProperty("password");
			             
			             //print key value
			    System.out.println(saveurl);
			        System.out.println(emailsave);
			        System.out.println(passwordsave);
			        
			      // for diffrent  read prpertyfile  diffrent  FileInputSteam object  because need diffrnet object for save in memory 
			       
			  FileInputStream readsavelocator=new FileInputStream(System.getProperty("user.dir")+"//src//propertyFile//locators.properties");
			    // diffrent object  new thing new memeiry in heap in object 
			        
	        // create object so that we can call load method . 
			  Properties locator= new Properties();
			  
			      locator.load(readsavelocator);  // load jee file starm nay jo file read kee vo oss file ko load kur do 
			      
			           System.out.println(locator.getProperty("emailid")); // emailid key hain mutlub ki properties file main hain , ooskee value aa jat gee 
			           System.out.println(locator.getProperty("password"));
			      
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		

	}

}

package dataproviders;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties;
	//private final String propertyFilePath= "/Users/shreeeja/eclipse-workspace/Dsalgo/Configuration.properties";
	//ConfigFileReader.java changes:
	public static String dir = System.getProperty("user.dir");
	private final String propertyFilePath= dir+ "/Configuration.properties";
	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getDriverPathFF(){
		String driverPath = properties.getProperty("driverPathFF");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public String getDriverPathChrome(){
		String driverPath = properties.getProperty("driverPathChrome");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public String getDriverPathEdge(){
		String driverPath = properties.getProperty("driverPathEdge");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equalsIgnoreCase("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("edge")) return DriverType.EDGE;
		else if(browserName.equals("safari")) return DriverType.SAFARI;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	public String getTestDataResourcePath(){
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		if(testDataResourcePath!= null) return testDataResourcePath;
		else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");		
	}
	
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	public String getExcelFilePath() {
		String excelFilePath = properties.getProperty("excelFilePath");
		if(excelFilePath!= null)  return excelFilePath;
		else throw new RuntimeException("excel file Path not specified in the Configuration.properties file.");	
    }
	public String getSheetName() {
		String sheetname = properties.getProperty("sheetName");
		if(sheetname!=null) return sheetname;
		else throw new RuntimeException("Sheet Name not specified in the Configuration.properties file.");
        
    }

}
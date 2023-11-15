package dataproviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private static Properties properties;
	//private final String propertyFilePath= "C:\\Users\\rishj\\git\\ds_algo_projectss\\src\\test\\java\\config\\Configuration.properties";
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
	
	public String getDriverPathChrome(){
		String driverPath = properties.getProperty("driverPathchrome");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driver Path not specified in the Configuration.properties file.");		
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
	
	public String getDriverPathFF(){
		String driverPath = properties.getProperty("driverPathFF");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public String getDriverPathEdge(){
		String driverPath = properties.getProperty("driverPathedge");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public static long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getRegisterpageUrl() {
		String url1 = properties.getProperty("URL");
		if(url1 != null) return url1;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");
	
	}
	
	public String getSigninpageURL() {
		String url2 = properties.getProperty("URL");
		if(url2 != null) return url2;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");
	}
	
	public String getDatastructurepageURL() {
		String url3 = properties.getProperty("URL");
		if(url3 != null) return url3;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");
	}
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equalsIgnoreCase("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("msedgedriver")) return DriverType.MSEDGEDRIVER;
		else if(browserName.equals("safari")) return DriverType.SAFARI;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
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

}
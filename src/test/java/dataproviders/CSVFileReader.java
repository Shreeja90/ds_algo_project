package dataproviders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
 





public class CSVFileReader {

      public static List<String[]> readCSV(String csvfilepath){
    	List<String[]> data = new ArrayList<>();
    
		  	try (BufferedReader reader = new BufferedReader(new FileReader(csvfilepath))){
    		String line;
    		while((line = reader.readLine()) != null) {
    			String[] values = line.split(",");
    			data.add(values);
    		
    		}
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    	return data;
    }
    public String[] readCSVRow(String csvfilepath, int rowNum) {
    	List<String[]> data = readCSV(csvfilepath);
    	
    	if(rowNum >=1 && rowNum <= data.size()) {
    		return data.get(rowNum - 1);
    	}
    	else {
    		throw new 
    		IllegalArgumentException("Row number out of bounds");
    	
    	}
    	}
    }
package dataproviders;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.List;
	import com.google.gson.Gson;
	import managers.FileReaderManager;
	import testDataTypes.loginCredentials;
	
public class JsonDataReader {
	private final String loginFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "login.json";
	private List<loginCredentials> loginCredentialslist;
	
	public JsonDataReader(){
		loginCredentialslist = getLoginData();
	}
	
	private List<loginCredentials> getLoginData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(loginFilePath));
			loginCredentials[] loginCredentials = gson.fromJson(bufferReader, loginCredentials[].class);
			return Arrays.asList(loginCredentials);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + loginFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
		
	public final loginCredentials getCustomerByName(String username){
		for(loginCredentials login : loginCredentialslist) {
			if(login.getUsername().equalsIgnoreCase(username)) return login;
		}
		return null;
	}
	

}
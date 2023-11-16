package testDataTypes;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class loginCredentials {

private String username;
private String password1;
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getPassword1() {
return password1;
}

public void setPassword1(String password1) {
this.password1 = password1;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
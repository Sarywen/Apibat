package baseInfo;

import java.io.*;
import java.net.*;
import java.util.*;
import org.json.*;
import baseInfo.*;
public class ConnectEve {

	//public static ArrayList<String> callSequenceCheck (int keyID, String vCode, String call){
	public static JSONObject getAPIKeyInfo ( Credentials userInfo){
	    JSONObject convertedOutput = new JSONObject(); 
		try {
			StringBuilder output = new StringBuilder();
			String url = "https://api.eveonline.com/account/APIKeyInfo.xml.aspx?keyID=" + userInfo.getKeyID() + "&vCode=" + userInfo.getVerificationCode();
		    URL myURL = new URL(url);
		    URLConnection my = myURL.openConnection();
		    BufferedReader in = new BufferedReader(new InputStreamReader(my.getInputStream()));
		    String inputLine;
		    while((inputLine = in.readLine()) != null){
		    	output.append(inputLine);
		    }
		    in.close();
			convertedOutput = XML.toJSONObject(output.toString());

		} 
		catch (MalformedURLException e) { 
		    // new URL() failed
		    // ...
		} 
		catch (IOException e) {   
		    // openConnection() failed
		    // ...
		}
		 return convertedOutput;
	}
	public static JSONObject callSequence (int keyID, String vCode, String call){
	    StringBuilder output = new StringBuilder();
	    JSONObject convertedOutput = new JSONObject(); 
		try {
			//String url = "https://api.eveonline.com/account/"+ call + ".xml.aspx?keyID=" + keyID + "&vCode=" + vCode;
			String url = "https://api.eveonline.com/char/" + call+ ".xml.aspx?"+"keyID=5898830&vCode=I1j5eUhLH35lX5sH38FpPqBSEONOh3ayqvN9a1txr4RTdgLP7qDTdBOS0WYfsy9A"+"&characterID=" + keyID ;
		    URL myURL = new URL(url);
		    URLConnection my = myURL.openConnection();
		    BufferedReader in = new BufferedReader(new InputStreamReader(my.getInputStream()));
		    String inputLine;
		    //String [] output;
		    while((inputLine = in.readLine()) != null){
		    	output.append(inputLine);
		    }
		    in.close();
			convertedOutput = XML.toJSONObject(output.toString());

		} 
		catch (MalformedURLException e) { 
		    // new URL() failed
		    // ...
		} 
		catch (IOException e) {   
		    // openConnection() failed
		    // ...
		}
		 return convertedOutput;
	}
	public static void main(String [] args){
//		JSONObject apiDetails = callSequence(5898830, "I1j5eUhLH35lX5sH38FpPqBSEONOh3ayqvN9a1txr4RTdgLP7qDTdBOS0WYfsy9A", "Characters");
//		System.out.print(apiDetails.toString(4));
//		System.out.println("--------------------");
//		ArrayList<String> apiDetailsChecker = callSequenceCheck(5898830, "I1j5eUhLH35lX5sH38FpPqBSEONOh3ayqvN9a1txr4RTdgLP7qDTdBOS0WYfsy9A", "Characters");
//		for(String s: apiDetailsChecker){
//			System.out.println(s);
//		}
//		JSONObject apiDetails = callSequence(94983065, "I1j5eUhLH35lX5sH38FpPqBSEONOh3ayqvN9a1txr4RTdgLP7qDTdBOS0WYfsy9A", "MailMessages");
//		System.out.print(apiDetails.toString(4));
//		System.out.println("--------------------");
		Credentials sarywen = new Credentials(5898830, "I1j5eUhLH35lX5sH38FpPqBSEONOh3ayqvN9a1txr4RTdgLP7qDTdBOS0WYfsy9A");
		JSONObject apiDetails = getAPIKeyInfo(sarywen);
		System.out.print(apiDetails.toString(4));
		JSONObject test = apiDetails.getJSONObject("eveapi").getJSONObject("result").getJSONObject("key").getJSONObject("rowset").getJSONObject("row");
		String characterID = ((Object) test.get("characterID")).toString();
	//	characterID = characterID.toString();
		System.out.println("------------");
		System.out.print(characterID);
		System.out.println(characterID instanceof String);
		
	}
	
}

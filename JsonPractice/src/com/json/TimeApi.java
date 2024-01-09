package com.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.XML;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import netscape.javascript.JSObject;

public class TimeApi {

	public static void main(String[] args) throws IOException {
		String api_url = "http://api.openweathermap.org/geo/1.0/direct?q=jaipur,rj,IN&limit=10&appid=b535fff314794c34cb57ab212fb13379";
		URL url = new URL(api_url);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		BufferedReader br1 = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		String get_data;
			get_data=br1.readLine();
		
		System.out.println("--"+get_data);
		JSONArray array=(JSONArray)JSONValue.parse(get_data);
		System.out.println(array.get(0));
		System.out.println();
		JSONObject object=(JSONObject)array.get(0);
		System.out.println(object.get("state"));
		System.out.println(object.get("country"));
		
		String api_url2 ="http://restapi.adequateshop.com/api/Traveler";
		URL url2 = new URL(api_url2);
		HttpURLConnection connection2 = (HttpURLConnection) url2.openConnection();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
		
		String get_data2;
			get_data2=br2.readLine();
			System.out.println(get_data2);
			
	        // Convert XML to JSON using Jackson
			 org.json.JSONObject jsonObject = XML.toJSONObject(get_data2.toString());

		        // Print the JSON representation
		        System.out.println("Converted JSON:");
		        System.out.println(jsonObject.toString()); 		
		        
	}
}

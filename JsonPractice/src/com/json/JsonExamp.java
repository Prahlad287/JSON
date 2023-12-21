package com.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.jar.Attributes.Name;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;


public class JsonExamp{

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\JsonPractice\\Test.JSON");
	    JSONObject obj=(JSONObject)JSONValue.parse(reader);
	    System.out.println(obj);
	    
	    FileReader reader2=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\JsonPractice\\Test2.json");
	    JSONArray array=(JSONArray)JSONValue.parse(reader2);
	    System.out.println(array);
	    System.out.println(array.size());
	    JSONObject obj2=(JSONObject)array.get(0);
	    System.out.println(obj2);
	    System.out.println(obj2.get("name"));
		
		

	}

}

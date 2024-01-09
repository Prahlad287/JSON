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
		FileReader reader=new FileReader("D:\\Java Notes\\Test.json");
	    JSONObject obj=(JSONObject)JSONValue.parse(reader);
	    System.out.println(obj);
	    System.out.println();
	    
	    JSONArray obj1=(JSONArray)obj.get("courses");
	    System.out.println(obj1);
	    System.out.println(obj1.get(1));
	    System.out.println();
	    
	    System.out.println(obj.get("address"));
	    JSONObject obj3=(JSONObject)obj.get("address");
	    System.out.println(obj3.get("mob"));
	    System.out.println();
	    
	    System.out.println(obj.get("name"));
	    System.out.println(obj.get("id"));
	    System.out.println(obj.get("email"));
	    
	    
	    
	    
//	    System.out.println();
//	    FileReader reader2=new FileReader("D:\\Java Notes\\Test2.json");
//	    JSONArray array=(JSONArray)JSONValue.parse(reader2);
//	    System.out.println(array);
//	    System.out.println(array.size());
//	    JSONObject obj2=(JSONObject)array.get(0);
//	    System.out.println(obj2);
//	    System.out.println(obj2.get("name"));
		
		

	}
}

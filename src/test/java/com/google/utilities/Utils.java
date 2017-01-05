package com.google.utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Utils {

	public static int checkWebLinks(String link) {
	
	try {
		URL url = new URL(link);
		HttpURLConnection connection;
		connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int code = connection.getResponseCode();
		return code;
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
	}
	return -1;
	}
}

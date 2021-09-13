package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest3 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/10");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-type", "application/json");
			connection.connect();
			
			int statusCode = connection.getResponseCode();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		    
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			}

			// 변수에 담기
			String str = sb.toString();
			Gson gson = new Gson();
			Todo todo = gson.fromJson(str, Todo.class);
			
			System.out.println(todo.userId);
			System.out.println(todo.id);
			System.out.println(todo.title);
			System.out.println(todo.completed);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

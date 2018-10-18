package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class data {
public void getData() throws IOException {
		
		String temp="http://www.omdbapi.com/?s=iron&apikey=bec10cf1";

		URL url = new URL(temp);

		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

		String line;
		{
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		}
	}
}

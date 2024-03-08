package LESSON.lesson6.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadURL {
    
public static void main(String[] args) {
        // Specify the URL to read content from
        String urlString = "https://en.wikipedia.org/wiki/Giant_panda";

        try {
            // Create a URL object with the specified URL string
            @SuppressWarnings("deprecation")
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method (GET by default)
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Create a BufferedReader to read content from the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Read each line of the content and print it to the console
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader and the connection
            reader.close();
            connection.disconnect();
        } catch (IOException e) {
            // Handle any IOException that may occur during URL connection or reading
            e.printStackTrace();
        }
    }
    
}

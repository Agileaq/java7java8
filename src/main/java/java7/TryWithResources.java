package java7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

//if close fail, an exception throws out
public class TryWithResources {
	public static void main(String[] args) {
		//BufferedReader and BufferedWriter implemented Closeable
		try (BufferedReader inputReader = Files.newBufferedReader(
				Paths.get(new URI("file:///C:/ArcFolder/Java7Training/users.txt")),
				Charset.defaultCharset());/* Bear in mind the semicolons here */
				BufferedWriter outputWriter = Files.newBufferedWriter(
						Paths.get(new URI("file:///C:/ArcFolder/Java7Training/users.bak")),
						Charset.defaultCharset())) {
			String inputLine;
			while ((inputLine = inputReader.readLine()) != null) {
				outputWriter.write(inputLine);
				outputWriter.newLine();
			}
			System.out.println("Copy complete!");
			
			// "|" The use of this operator is discussed in the
			// Catching multiple exception types to improve type checking recipe
		} catch (URISyntaxException | IOException ex) {
			//In sems, when we catch multiple exceptions and we want to do the same thing.
			//e.g. Log the error, send the exception via e-mail, we write the codes many times.
			//It's redundant. Discuss later
			ex.printStackTrace();
		}
	}
}

package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static List<String[]> read(String file) {
		List<String[]> data = new ArrayList<>();
		String dataRowString;

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			while ((dataRowString = bufferedReader.readLine()) != null) {
				String[] stringArray = dataRowString.split(",");
				data.add(stringArray);
			}
			bufferedReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("FILE COULD NOT BE FOUND");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("FILE READ NOT SUCCESSFUL");
			e.printStackTrace();
		}
		return data;
	}
}

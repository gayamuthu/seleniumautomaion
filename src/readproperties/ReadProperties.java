package readproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		File file = new File("./data/config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		Object value = prop.get("UserName");
		System.out.println(value);
		Object value1 = prop.get("Password");
		System.out.println(value1);
		Object value2 = prop.get("url");
		System.out.println(value2);

	}

}

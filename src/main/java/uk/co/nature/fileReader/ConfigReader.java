package uk.co.nature.fileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getValue(String keyValue) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/env.properties"));
        return prop.getProperty(keyValue);
    }

}

package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    static {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(
                    System.getProperty("user.dir")
                    + "/src/test/resources/config.properties"
            );
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file");
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}

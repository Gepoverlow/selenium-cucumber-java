package DataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private final Properties properties;

    public ConfigFileReader() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String propertyFilePath = "config/configuration.properties";

        try {
            fileReader = new FileReader(propertyFilePath);
            bufferedReader = new BufferedReader(fileReader);
            properties = new Properties();

            try {
                properties.load(bufferedReader);
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getUrl() {
        String url = properties.getProperty("url");

        if (url != null) return url;
        else
            throw new RuntimeException("url not specified in the config file.");
    }

    public String getDriverType() {
        String driverType = properties.getProperty("driverType");

        return driverType.toUpperCase();
    }

}

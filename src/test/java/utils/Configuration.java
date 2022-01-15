package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

  private String backEndServiceHostUrl;

  public String getBackEndServiceHostUrl() {
    return backEndServiceHostUrl;
  }

  public static Configuration getInstace() {
    return new Configuration();
  }

  private Configuration() {

    try (InputStream input = this.getClass().getClassLoader()
        .getResourceAsStream("test-configuration.properties")) {

      Properties prop = new Properties();

      // load a properties file
      prop.load(input);

      // get the property value and print it out
      backEndServiceHostUrl = prop.getProperty("backEndServiceHostUrl");

    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

}

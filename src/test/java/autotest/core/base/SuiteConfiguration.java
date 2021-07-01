package autotest.core.base;

import java.io.IOException;
import java.util.Properties;

public class SuiteConfiguration {
    private static final String PROPERTIES = "/Config.properties";

    private final Properties properties;

    public SuiteConfiguration() throws IOException {
        this(System.getProperty("Config.properties", PROPERTIES));
    }

    private SuiteConfiguration(String fromResource) throws IOException {
        properties = new Properties();
        properties.load(SuiteConfiguration.class.getResourceAsStream(fromResource));
    }

    public boolean hasProperty(String name) {
        return properties.containsKey(name);
    }

    public String getProperty(String name) {
        return properties.getProperty(name);
    }
}

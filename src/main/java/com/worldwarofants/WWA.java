package com.worldwarofants;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class WWA {

    private static final String PROPERTIES_PATH = "wwa.properties";

    private Properties p;

    public WWA() {
        try {
            loadProperties();
        } catch(IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        WWA m = new WWA();
        System.out.println(m.getProperty("version"));
    }

    private void loadProperties() throws IOException {
        if(p == null) {
            p = new Properties();
        }

        p.load(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(PROPERTIES_PATH)));
    }

    private String getProperty(String property) {
        return p.getProperty(property);
    }
}

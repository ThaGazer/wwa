package com.worldwarofants;

import java.io.IOException;
import java.util.Properties;

public class Main {

    private static final String PROPERTIES_PATH = "/";

    Properties p;

    public Main() {
        try {
            loadProperties();
        } catch(IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.p.getProperty("version");
    }

    private void loadProperties() throws IOException {
        p.load(getClass().getResourceAsStream(PROPERTIES_PATH));
    }
}

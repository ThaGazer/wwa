package com.worldwarofants;

import com.worldwarofants.io.TitleScreen;
import com.worldwarofants.io.UserInterface;

import static com.worldwarofants.WWAProperties.*;
import static com.worldwarofants.WWAError.*;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

//TODO Logging
public class WWA {

    private static final String WWA_VERSION = "0.0.0";

    private Properties p;

    public WWA() {
        try {
            loadProperties();
        } catch(IOException e) {
            //TODO probably should print some error to the user here
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new WWA().play();
    }

    public void play() {
        UserInterface io = new TitleScreen(LOCATION_ASSETS.getName());

    }

    private void loadProperties() throws IOException {
        if(p == null) {
            p = new Properties();
        }

        p.load(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(PATH_PROPERTIES.getName())));
        versionCheck();
    }

    private void versionCheck() {
        if(p.isEmpty() || !WWA_VERSION.equals(p.getProperty(VERSION.getName()))) {
            throw new IllegalArgumentException(BAD_VERSION.getMessage());
        }
    }
}

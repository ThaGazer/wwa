package com.worldwarofants;

import com.worldwarofants.io.TitleScreen;

import java.io.*;
import java.net.URL;

public class Main {

    private static final String title = "/img/menus/Title.txt";

    public Main() {

    }

    public static void main(String[] args) {
        Main m = new Main();

        try {
            m.showTitleScreen();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void showTitleScreen() throws FileNotFoundException {
        new TitleScreen(getFileFromReasource())
                .show(new BufferedWriter(new OutputStreamWriter(System.out)));
    }

    private File getFileFromReasource() {
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(Main.title);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }
}

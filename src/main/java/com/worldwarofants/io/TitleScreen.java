package com.worldwarofants.io;

import java.io.*;

public class TitleScreen implements UserInterface {

    String assetLocation;
    BufferedReader in;

    public TitleScreen(String inputFile) {
        this(new File(inputFile));
    }

    public TitleScreen(File inputFile) {
        try {
            if(inputFile != null) {
                in = new BufferedReader(new FileReader(inputFile));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void draw(BufferedWriter out) {
        try {
            String line;
            while((line = in.readLine()) != null) {
                out.write(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

package com.worldwarofants.io;

import java.io.*;

public class TitleScreen implements UserInterface {

    BufferedReader in;

    public TitleScreen(File inputFile) throws FileNotFoundException {
        in = new BufferedReader(new FileReader(inputFile));
    }

    @Override
    public void show(BufferedWriter out) {
        try {
            String line = "";
            while((line = in.readLine()) != null) {
                out.write(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

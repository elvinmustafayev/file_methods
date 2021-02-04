package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtilityClass {

    public static void writeIntoFile(String fileName, String text) throws IOException {

        try(
                  BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

                 bw.write(text);
        }







    }

}

package com.company;

import java.io.*;

public class FileUtilityClass {

    private static void writeIntoFile(String fileName, String text, boolean append) throws IOException {
        /* textleri yazir */
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, append))) {

            bw.write(text);
        }


    }


    public static void writeIntoFile(String fileName, String text) throws IOException {
        writeIntoFile(fileName, text, false);
           // Elvins code

    }


    public static void appendIntoFile(String fileName, String text) throws IOException {
        writeIntoFile(fileName, text, true);


    }


    public static String read(String fileName) throws IOException {

        /* textleri oxuyur */
        try (InputStream in = new FileInputStream(fileName);
             InputStreamReader r = new InputStreamReader(in);
             BufferedReader reader = new BufferedReader(r)) {
            String line = null;
            String result = "";
            while ((line = reader.readLine()) != null) {
                result += line + "\n";

            }
            return result;
        }
    }

    public static byte[] readBytes(String fileName) throws IOException {

        File file = new File(fileName);

         try(FileInputStream fileInputStream = new FileInputStream(file)) {
             byte[] bytesArray = new byte[(int) file.length()];


             fileInputStream.read(bytesArray); /* burda read eleyir
              bytesArray- e doldurulur */

             return bytesArray;

         }
    }


    public static void writeBytes(String fileName, byte[] data) throws IOException {
        File file = new File(fileName);
        FileOutputStream fop = new FileOutputStream(file);

        fop.write(data);
        fop.flush();
        fop.close();

        System.out.println("Done");


    }

    public static Object readFileDeserialize(String name){
        Object obj = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))){
            obj = in.readObject();
        } finally {
            return obj;
        }
    }





    public static void writeObjectToFile(Serializable object, String name) throws IOException {
        try(FileOutputStream fout = new FileOutputStream(name);
            ObjectOutputStream oos = new ObjectOutputStream(fout)
        ){
            oos.writeObject(object);
        }
    }




}

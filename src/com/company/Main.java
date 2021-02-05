package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//       String str = FileUtilityClass.read("test.txt");
//        System.out.println(str);
//         FileUtilityClass.writeIntoFile("test.txt","Salam");

//        byte [] data = FileUtilityClass.readBytes("test.png");
//        FileUtilityClass.writeBytes("test2.png",data);

//        User u = new User();
////        u.name="test";
////        FileUtilityClass.writeObjectToFile(u,"test.obj");

        User u = (User) FileUtilityClass.readFileDeserialize("test.obj");
        System.out.println(u.name);
    }



}

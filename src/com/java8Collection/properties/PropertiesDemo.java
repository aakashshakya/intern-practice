package com.java8Collection.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String args[])throws Exception{
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("Info.txt");
        properties.load(fis);
        System.out.println(properties);
        String s=properties.getProperty("Name");
        System.out.println(s);
        properties.setProperty("UserName","Shiva");
        FileOutputStream fod=new FileOutputStream("Info.txt");
        properties.store(fod,"Updated for demo");

    }
}

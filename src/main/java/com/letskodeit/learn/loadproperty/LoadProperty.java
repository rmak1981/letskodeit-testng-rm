package com.letskodeit.learn.loadproperty;/*
Ravi's Creation
Date of Creation :-
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    String projectPath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key){
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "/src/test/java/com/letskodeit/learn/resources/properties/Config.Properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

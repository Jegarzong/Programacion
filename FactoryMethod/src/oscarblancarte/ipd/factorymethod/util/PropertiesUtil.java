/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.factorymethod.util;

import java.io.InputStream;
import java.security.AuthProvider;
import java.util.Properties;

public class PropertiesUtil {
    public static Properties loadProperty(String propertiesURL){
 try {
 Properties properties = new Properties();
InputStream inputStream = PropertiesUtil.class
.getClassLoader().getResourceAsStream(propertiesURL);
properties.load(inputStream);
return properties;
} catch (Exception e) {
e.printStackTrace();
 return null;
}
 }
}

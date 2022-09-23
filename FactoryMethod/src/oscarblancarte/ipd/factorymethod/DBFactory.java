/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.factorymethod;

 import java.util.Properties;
 import oscarblancarte.ipd.factorymethod.impl.MySQLDBAdapter;
 import oscarblancarte.ipd.factorymethod.util.PropertiesUtil;
public class DBFactory {
    private static final String DB_FACTORY_PROPERTY_URL = "META_INF/DBFactory.properties";
    private static final String DEFAULT_DB_CLASS_PROP = "defaultDBClass";

 public static IDBAdapter getDBadapter(DBType dbType) {
 switch (dbType) {
 case MySQL:
 return new MySQLDBAdapter();
 default:
 throw new IllegalArgumentException("No soportado");
 }
 }
 public static IDBAdapter getDefaultDBAdapter() {
 try {
 Properties prop = PropertiesUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
 String defaultDBClass = prop.getProperty(DEFAULT_DB_CLASS_PROP);
 System.out.println("DefaultDBClass ==> " + defaultDBClass);
 return (IDBAdapter) Class.forName(defaultDBClass).newInstance();
 } catch (Exception e) {
 e.printStackTrace();
 return null;
 }
 }
 }


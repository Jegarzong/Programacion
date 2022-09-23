/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oscarblancarte.ipd.factorymethod;

import java.sql.Connection;
public interface IDBAdapter {
  public Connection getConnection();
}

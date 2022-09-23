/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oscarblancarte.ipd.factorymethod;
import java.sql.SQLException;
import java.util.List;
import oscarblancarte.ipd.factorymethod.dao.ProductDAO;
import oscarblancarte.ipd.factorymethod.entity.Product;
public class FactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException {
         //Creamos los nuevos productos a registrar
 Product productA = new Product(1L, "Producto A", 100);
 Product productB = new Product(2L, "Producto B", 100);

 //Creamos una instancia del DAO
 ProductDAO productDAO = new ProductDAO();

 //Persistimos los productos
 productDAO.saveProduct(productA);
 productDAO.saveProduct(productB);

 //Consultamos nuevamente los productos
 List<Product> products = productDAO.findAllProducts();
 System.out.println("Product size ==> " + products.size());
 for(Product product : products){
 System.out.println(product);
        }
    }
    
}

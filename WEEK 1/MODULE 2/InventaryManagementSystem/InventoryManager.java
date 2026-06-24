import java.util.HashMap;
import java.util.Map;
public class InventoryManager 
{
    private HashMap<Integer,Product> inventory;
    public InventoryManager() 
    {
        this.inventory=new HashMap<>();
    }
    public void addProduct(Product product) 
    {
        if(inventory.containsKey(product.getProductId())) 
        {
            System.out.println("ERROR: Product ID " + product.getProductId()
                + " already exists. Use updateProduct() instead.");
            return;
        }
        inventory.put(product.getProductId(),product);
        System.out.println("ADDED  : " + product);
    }
    public void updateProduct(int productId,String newName,int newQty,double newPrice) 
    {
        Product product=inventory.get(productId);
        if(product==null) 
        {
            System.out.println("ERROR: Product ID " + productId + " not found.");
            return;
        }
        String old=product.toString();
        product.setProductName(newName);
        product.setQuantity(newQty);
        product.setPrice(newPrice);
        System.out.println("UPDATED: " + old);
        System.out.println("TO: " + product);
    }
    public void deleteProduct(int productId) 
    {
        Product removed=inventory.remove(productId);
        if (removed==null) 
        {
            System.out.println("ERROR: Product ID " + productId + " not found.");
        } 
        else 
        {
            System.out.println("DELETED: " + removed);
        }
    }
    public Product searchProduct(int productId) 
    {
        return inventory.get(productId);
    }
    public void displayAll() 
    {
        if (inventory.isEmpty()) 
        {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\nINVENTORY LIST");
        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) 
        {
            System.out.println(entry.getValue());
        }
        System.out.println("Total Products: " + inventory.size());
    }
}
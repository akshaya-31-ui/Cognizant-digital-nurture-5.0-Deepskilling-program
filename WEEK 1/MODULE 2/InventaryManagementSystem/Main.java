public class Main 
{
    public static void main(String[] args) 
    {
        InventoryManager manager = new InventoryManager();
        System.out.println("ADD PRODUCTS");
        manager.addProduct(new Product(1, "Laptop",        50,  75000.00));
        manager.addProduct(new Product(2, "Wireless Mouse", 200, 1500.00));
        manager.addProduct(new Product(3, "USB Keyboard",  150, 2500.00));
        manager.addProduct(new Product(4, "Monitor 24\"",   30, 18000.00));
        manager.addProduct(new Product(5, "Headphones",    100,  3500.00));
        manager.addProduct(new Product(6, "Duplicate Laptop", 5, 999.00));
        manager.displayAll();
        System.out.println("UPDATE PRODUCT");
        manager.updateProduct(2, "Wireless Mouse Pro", 180, 1800.00);
        System.out.println("\nSEARCH PRODUCT");
        Product notFound = (Product) manager.searchProduct(999);
        System.out.println("Search 2: " + (notFound==null ? "Not Found":notFound));
        Product Found = (Product) manager.searchProduct(999);
        System.out.println("Search 999: " + (Found==null?"Not Found":Found));
        System.out.println("\nDELETE PRODUCT");
        manager.deleteProduct(104);
        manager.deleteProduct(999); 
        manager.displayAll();
    }
}
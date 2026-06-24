class Main
{
    public static void main(String[] args) {
        Product[] product={
            new Product(305, "Gaming Laptop",     "Electronics"),
            new Product(102, "Wireless Mouse",    "Accessories"),
            new Product(450, "Running Shoes",     "Sports"),
            new Product(201, "Python Book",       "Books"),
            new Product(378, "Coffee Maker",      "Appliances"),
            new Product(155, "Noise Headphones",  "Electronics"),
            new Product(489, "Yoga Mat",          "Sports"),
            new Product(230, "Mechanical Keyboard","Accessories"),
        };
        System.out.println("All Products: ");
        for(Product p:product)
            System.out.println(p);
        System.out.println("Linear Searching:");
        int ind=SearchEngine.linearSearch(product,102);
        System.out.println("Result: " + (ind==-1 ? "Not Found" : product[ind]));
        int ind1=SearchEngine.linearSearchByName(product, "Yoga Mat");
        System.out.println("Result: " + (ind1==-1 ? "Not Found" : product[ind1]));
        Product[] sorted=product.clone();
        System.out.println("Sorted Product List");
        SearchEngine.sortById(sorted);
        for(Product p:sorted) 
            System.out.println(p);
        System.err.println("Binary Search");
        int ind2=SearchEngine.binarySearch(sorted,378);
        System.out.println("Result: " + (ind2==-1 ? "Not Found" : sorted[ind2]));
        System.out.println("\nCOMPARISON: ");
        System.out.println("Linear Search: O(n) " + product.length + " items");
        System.out.println("Binary Search: O(log n) "
            + (int)(Math.log(product.length) / Math.log(2) + 1) + " items for n="
            + product.length);
    }
}
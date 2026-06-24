import java.util.Arrays;
public class Main 
{
    public static void main(String[] args) 
    {
        Order[] originalOrders = {
            new Order(1001, "Ravi Kumar",   4500.00),
            new Order(1002, "Priya Sharma", 1200.00),
            new Order(1003, "Amit Singh",   8900.00),
            new Order(1004, "Sneha Patel",   750.00),
            new Order(1005, "Kiran Rao",    3200.00),
            new Order(1006, "Meena Nair",   6700.00),
            new Order(1007, "Arjun Das",    2100.00),
        };
        OrderSorter.printOrders(originalOrders,"ORIGINAL ORDERS (Unsorted)");
        Order[] bubbleOrders=Arrays.copyOf(originalOrders,originalOrders.length);
        System.out.println("\nBUBBLE SORT"); 
        OrderSorter.bubbleSort(bubbleOrders);
        OrderSorter.printOrders(bubbleOrders,"BUBBLE SORTED (by Total Price)");
        Order[] quickOrders=Arrays.copyOf(originalOrders,originalOrders.length);
        System.out.println("\n QUICK SORT");
        OrderSorter.quickSort(quickOrders,0,quickOrders.length-1);
        OrderSorter.printOrders(quickOrders,"QUICK SORTED (by Total Price)");
        System.out.println("\n PERFORMANCE COMPARISON ");
        System.out.println("Bubble Sort: Best=O(n)  | Avg=O(n²) | Worst=O(n²)");
        System.out.println("Quick Sort:  Best=O(n log n) | Avg=O(n log n) | Worst=O(n²)");
        System.out.println("\nWhy Quick Sort is preferred:");
        System.out.println("  → Much faster for large datasets");
        System.out.println("  → Average case O(n log n) vs O(n²) for Bubble Sort");
        System.out.println("  → For n=1000: Bubble=~500,000 ops, Quick=~10,000 ops");
    }
}
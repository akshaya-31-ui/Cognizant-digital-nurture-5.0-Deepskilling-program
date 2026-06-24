public class OrderSorter
{
    public static void bubbleSort(Order[] order)
    {
        int n=order.length;
        for(int i=0;i<n-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(order[j].getTotalPrice()>order[j+1].getTotalPrice())
                {
                    Order temp=order[j];
                    order[j]=order[j+1];
                    order[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)   break;
        }
    }
    public static void quickSort(Order[] order,int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(order,low,high);
            quickSort(order,low,pivot-1);
            quickSort(order,pivot+1,high);
        }
    }
    private static int partition(Order[] order,int low,int high)
    {
        double pivot=order[high].getTotalPrice();
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(order[j].getTotalPrice()<=pivot)
            {
                i++;
                Order temp=order[i];
                order[i]=order[j];
                order[j]=temp;
            }
        }
        Order temp=order[i+1];
        order[i+1]=order[high];
        order[high]=temp;
        return i+1;
    }
    public static void printOrders(Order[] order,String title) 
    {
        System.out.println("\n " + title);
        for (int i=0;i<order.length;i++) 
        {
            System.out.println("  " + (i + 1) + ". " + order[i]);
        }
    }
}
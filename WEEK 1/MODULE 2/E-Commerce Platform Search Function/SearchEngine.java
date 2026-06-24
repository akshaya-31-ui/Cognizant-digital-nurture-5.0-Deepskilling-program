public class SearchEngine
{
    public static int linearSearch(Product[] product,int targetId)
    {
        for(int i=0;i<product.length;i++)
        {
            if(product[i].getProductId()==targetId)
            {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(Product[] product,int targetId)
    {
        int left=0;
        int right=product.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(product[mid].getProductId()==targetId)
            {
                return mid;
            }
            else if(product[mid].getProductId()<targetId)
            {
                left=mid+1;
            }
            else 
            {
                right=mid-1;
            }
        }
        return -1;
    }
    public static int linearSearchByName(Product[] product,String name)
    {
        for(int i=0;i<product.length;i++)
        {
            if(product[i].getProductName().equalsIgnoreCase(name))
            {
                return i;
            }
        }
        return -1;
    }
    public static void sortById(Product[] sorted)
    {
        int n=sorted.length-1;
        for(int i=0;i<n-1;i++)
        {
            int minind=i;
            for(int j=i+1;j<n;j++)
            {
                if(sorted[i].getProductId()<sorted[minind].getProductId())
                {
                    minind=j;
                }
            }
            Product temp=sorted[minind];
            sorted[minind]=sorted[i];
            sorted[i]=temp;
        }
    }
}
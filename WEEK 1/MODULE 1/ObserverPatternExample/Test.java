public class Test
{
    public static void main(String[] args) {
        StockMarket cog = new StockMarket("Cognizant");
        Observer mobile1 = new MobileApp("Zerodha");
        Observer mobile2 = new MobileApp("Groww");
        Observer web1    = new WebApp("MoneyControl");
        cog.register(mobile1);
        cog.register(mobile2);
        cog.register(web1);
        System.out.println("Price update 1");
        cog.setPrice(3500.50);
        System.out.println("\nGroww unsubscribes");
        cog.deregister(mobile2);
        System.out.println("\nPrice update 2");
        cog.setPrice(3620.75);
    }
}
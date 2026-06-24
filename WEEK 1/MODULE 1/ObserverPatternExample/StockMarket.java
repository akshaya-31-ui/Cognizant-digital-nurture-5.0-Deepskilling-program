
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock 
{
    private List<Observer> observers=new ArrayList<>();
    private String stockName;
    private double price;
    public StockMarket(String stockName)
    {
        this.stockName=stockName;
    }
    public void setPrice(double price) 
    {
        this.price = price;
        notifyObserver();
    }
    public void register(Observer observer) 
    {
        observers.add(observer);
    }
    public void deregister(Observer observer) 
    {
        observers.remove(observer);
    }
    public void notifyObserver() 
    {
        for (Observer observer:observers) 
        {
            observer.update(stockName,price);
        }
    }
}
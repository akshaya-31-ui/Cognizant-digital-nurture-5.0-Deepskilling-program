public class Main 
{
    public static void main(String[] args) 
    {
        CustomerRepository repo=new CustomerRepositoryImpl();
        CustomerService service=new CustomerService(repo); // injecting dependency
        service.getCustomer(1);
        service.getCustomer(2);
        service.getCustomer(99);
    }
}
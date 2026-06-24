public class CustomerRepositoryImpl implements CustomerRepository 
{
    public String findCustomerById(int id) 
    {
        if (id==1) return "Ravi Kumar";
        if (id==2) return "Priya Sharma";
        return "Customer not found";
    }
}
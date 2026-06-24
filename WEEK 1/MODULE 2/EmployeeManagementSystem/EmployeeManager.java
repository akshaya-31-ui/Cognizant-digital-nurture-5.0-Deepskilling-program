public class EmployeeManager
{
    private Employee[] employee;
    private int size;
    private int capacity;
    public EmployeeManager(int capacity)
    {
        this.capacity=capacity;
        this.employee=new Employee[capacity];
        this.size=0;
    }
    public void addEmployee(Employee emp) 
    {
        if(size>=capacity) 
        {
            System.out.println("ERROR:Array is full,Cannot add more employees.");
            return;
        }
        employee[size]=emp;
        size++;
        System.out.println("ADDED: " + emp);
    }
    public int searchEmployee(int employeeId) 
    {
        System.out.println("\nSearching for Employee ID: " + employeeId);
        for(int i=0;i<size;i++) 
        {
            if(employee[i].getEmployeeId()==employeeId) 
            {
                System.out.println("FOUND at index " + i + ": " + employee[i]);
                return i;
            }
        }
        System.out.println("Employee ID " + employeeId + " NOT FOUND.");
        return -1;
    }
    public void traverseAll() 
    {
        System.out.println("\n ALL EMPLOYEES");
        if(size==0) 
        {
            System.out.println("No employees found.");
            return;
        }
        for(int i=0;i<size;i++) 
        {
            System.out.println("[" + i + "]" + employee[i]);
        }
    }
    public void deleteEmployee(int employeeId) 
    {
        int index=-1;
        for(int i=0;i<size;i++) 
        {
            if (employee[i].getEmployeeId()==employeeId) 
            {
                index=i;
                break;
            }
        }
        if(index==-1) 
        {
            System.out.println("DELETE ERROR: Employee ID " + employeeId + " not found.");
            return;
        }
        for(int i=index;i<size-1;i++) 
        {
            employee[i]=employee[i+1];
        }
        employee[size-1]=null;
        size--;
        System.out.println("Deleted successfully. " + "Remaining employees: " + size);
    }
}
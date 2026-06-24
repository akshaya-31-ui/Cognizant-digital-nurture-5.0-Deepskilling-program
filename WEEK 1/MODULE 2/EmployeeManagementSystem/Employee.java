class Employee
{
    private int employeeId;
    private String name;
    private String position;
    private double salary;
    public Employee(int employeeId, String name,String position, double salary) {
        this.employeeId=employeeId;
        this.name=name;
        this.position=position;
        this.salary=salary;
    }
    public int getEmployeeId() 
    { 
        return employeeId; 
    }
    public String getName()       
    { 
        return name; 
    }
    public String getPosition()   
    { 
        return position; 
    }
    public double getSalary()     
    { 
        return salary; 
    }
    public void setName(String name)         
    { 
        this.name=name; 
    }
    public void setPosition(String position) 
    { 
        this.position=position; 
    }
    public void setSalary(double salary)     
    { 
        this.salary=salary; 
    }
    @Override
    public String toString() 
    {
        return String.format(
            "Employee[ID=%-4d | Name=%-15s | Position=%-12s | Salary=Rs.%8.2f]",
            employeeId, name, position, salary
        );
    }
}
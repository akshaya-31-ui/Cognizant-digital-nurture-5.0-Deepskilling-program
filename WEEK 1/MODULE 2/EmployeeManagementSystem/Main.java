public class Main 
{
    public static void main(String[] args) 
    {
        EmployeeManager manager = new EmployeeManager(10);
        System.out.println("ADD EMPLOYEES");
        manager.addEmployee(new Employee(1001,"Alice Johnson","Manager",85000));
        manager.addEmployee(new Employee(1002,"Bob Brown","Developer",72000));
        manager.addEmployee(new Employee(1003,"Carol White","Designer",65000));
        manager.addEmployee(new Employee(1004,"David Green","Tester",58000));
        manager.addEmployee(new Employee(1005,"Emma Davis","Analyst",70000));
        manager.traverseAll();
        System.out.println("SEARCH");
        manager.searchEmployee(1003);
        manager.searchEmployee(9999);
        System.out.println("\n DELETE");
        manager.deleteEmployee(1002); 
        manager.traverseAll();
        System.out.println("COMPLEXITY ANALYSIS: ");
        System.out.println("Add      : O(1)  - Insert at end directly");
        System.out.println("Search   : O(n)  - Linear scan through all");
        System.out.println("Traverse : O(n)  - Visit every element");
        System.out.println("Delete   : O(n)  - Find + shift remaining");
        System.out.println("\n Limitations of Arrays:");
        System.out.println("  → Fixed size — cannot grow dynamically");
        System.out.println("  → Delete is O(n) due to shifting");
        System.out.println("  → Insert in middle is O(n) due to shifting");
        System.out.println("\n When to use Arrays:");
        System.out.println("  → When size is known and fixed");
        System.out.println("  → When fast index access is needed O(1)");
        System.out.println("  → When memory efficiency matters");
    }
}
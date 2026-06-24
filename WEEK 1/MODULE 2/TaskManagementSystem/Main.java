public class Main 
{
    public static void main(String[] args) 
    {
        TaskLinkedList taskList = new TaskLinkedList();
        taskList.addTask(new Task(1, "Design Database Schema",    "Pending"));
        taskList.addTask(new Task(2, "Develop Login Module",      "In Progress"));
        taskList.addTask(new Task(3, "Write Unit Tests",          "Pending"));
        taskList.addTask(new Task(4, "Deploy to Staging Server",  "Pending"));
        taskList.addTask(new Task(5, "Code Review",               "In Progress"));
        taskList.traverseAll();
        System.out.println("SEARCH");
        taskList.searchTask(3);
        taskList.searchTask(99);
        System.out.println("\n UPDATE STATUS ");
        taskList.updateStatus(1, "Done");
        taskList.updateStatus(3, "In Progress");
        System.out.println("\n DELETE");
        taskList.deleteTask(2); 
        taskList.deleteTask(1); 
        taskList.traverseAll();
        System.out.println(" COMPLEXITY ANALYSIS ");
        System.out.println("Add at end   : O(n) - traverse to end first");
        System.out.println("Add at front : O(1) - just update head pointer");
        System.out.println("Search       : O(n) - traverse until found");
        System.out.println("Traverse     : O(n) - visit every node");
        System.out.println("Delete       : O(n) - find then re-link");
        System.out.println("\nAdvantages over Arrays:");
        System.out.println("  → Dynamic size — grows/shrinks as needed");
        System.out.println("  → Delete/Insert O(1) once position found");
        System.out.println("  → No shifting of elements needed");
        System.out.println("  → No wasted pre-allocated space");
    }
}
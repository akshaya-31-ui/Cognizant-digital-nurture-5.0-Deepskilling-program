public class TaskLinkedList 
{
    private static class Node 
    {
        Task task;
        Node next;
        Node(Task task) {
            this.task=task;
            this.next=null;
        }
    }
    private Node head;  
    private int size;
    public TaskLinkedList() 
    {
        this.head=null;
        this.size=0;
    }
    public void addTask(Task task) 
    {
        Node newNode=new Node(task);
        if(head==null) 
        {
            head=newNode;
        } 
        else 
        {
            Node current=head;
            while(current.next!=null) 
            {
                current=current.next;
            }
            current.next=newNode;
        }
        size++;
        System.out.println("ADDED: " + task);
    }
    public void addTaskAtFront(Task task) 
    {
        Node newNode=new Node(task);
        newNode.next=head;
        head=newNode;
        size++;
        System.out.println("ADDED AT FRONT: " + task);
    }
    public Task searchTask(int taskId) 
    {
        Node current=head;
        while(current!=null) 
        {
            if(current.task.getTaskId()==taskId) {
                System.out.println("FOUND: " + current.task);
                return current.task;
            }
            current=current.next;
        }
        System.out.println("Task ID " + taskId + " NOT FOUND.");
        return null;
    }
    public void traverseAll() 
    {
        if(head==null) 
        {
            System.out.println("No tasks.");
            return;
        }
        Node current=head;
        int index=1;
        while(current!=null) 
        {
            System.out.println("  " + index + ". " + current.task);
            current=current.next;
            index++;
        }
    }
    public void deleteTask(int taskId) 
    {
        if(head==null) 
        {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if(head.task.getTaskId()==taskId) 
        {
            System.out.println("DELETED(head): " + head.task);
            head=head.next;
            size--;
            return;
        }
        Node current=head;
        while(current.next!=null) 
        {
            if(current.next.task.getTaskId()==taskId) 
            {
                System.out.println("DELETED: " + current.next.task);
                current.next=current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
        System.out.println("DELETE ERROR: Task ID " + taskId + " not found.");
    }
    public void updateStatus(int taskId, String newStatus) 
    {
        Node current=head;
        while(current!=null) 
        {
            if(current.task.getTaskId()==taskId) 
            {
                String old=current.task.getStatus();
                current.task.setStatus(newStatus);
                System.out.println("UPDATED Task " + taskId + ": " + old + " → " + newStatus);
                return;
            }
            current=current.next;
        }
        System.out.println("Task ID " + taskId + " not found for update.");
    }
    public int getSize() 
    { 
        return size; 
    }
}
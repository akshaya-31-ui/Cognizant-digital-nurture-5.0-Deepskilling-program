package org.example;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests
{
    @Test
    @Order(1)
    public void stepOne_Create()
    {
        System.out.println("Creating user..");
    }
    @Test
    @Order(2)
    public void stepTwo_Login()
    {
        System.out.println("User Logging..");
    }
    @Test
    @Order(3)
    public void stepThree_delete()
    {
        System.out.println("Deleting user..");
    }
}
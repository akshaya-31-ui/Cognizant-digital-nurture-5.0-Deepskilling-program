package org.example;
public class ExceptionThrower
{
     public void throwException(int age)
     {
         if(age<0)
         {
             throw new IllegalArgumentException("Age cannot be negative");
         }
     }
}
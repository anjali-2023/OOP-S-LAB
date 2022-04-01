/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

public class Employee {
    int emp_id;
    String emp_name;
    float salary;
    float totalsalary;
    Employee(int a, String b,float c )
    {
    emp_id=a;
    emp_name=b;
    salary=c;
    }
    
    public void totalsalary()
    {
     float totalsalary = salary+salary*20/100;
     System.out.println("The total salary is :"+ totalsalary);
    }
   
    public static void main(String[] args) 
    {
        Employee e1 =new Employee(101,"Ardra",10000);
        e1.totalsalary();
        
        Employee e2 =new Employee(204,"Meera",23000);
        e2.totalsalary();
    }
    
}

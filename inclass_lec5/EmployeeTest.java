











class Employee 
{
    String firstName; 
    String lastName;
    double monthlySalary;
    Employee(String firstName, String lastName, doublemonthlySalary) 
      { 
         this.firstName = firstName;
         this.lastName = lastName;
         if(monthlySalary > 0) 
         {
            this.monthlySalary = monthlySalary;
          }
      }
    String getFirstName() 
    {
       return firstName;
    }
    void setFirstName(String firstName) 
    {
      this.firstName = firstName;
    }
    String getLastName() 
    {
      return lastName;
    } 
    void setLastName(String lastName) 
    {
       this.lastName = lastName;
    }
    double getMonthlySalary() 
    {
       return monthlySalary;
    }
    void setMonthlySalary(doublemonthlySalary)
     {
        if(monthlySalary > 0) 
         {
           this.monthlySalary = monthlySalary;
         }
     }
}
class EmployeeTest 
{
    public static void main(String args[])
       {
          Employee employee1 = newEmployee("Nick", "Erwin", 300);
          Employee employee2 = newEmployee("Michael", "Ben", -150);
          System.out.println("\n" + employee1.getFirstName() + " " + employee1.getLastName() + " Yearly Salary :"+ (12 * employee1.getMonthlySalary()));
          System.out.println("\n" + employee2.getFirstName() + " " + employee2.getLastName() + " Yearly Salary :"+ (12 * employee2.getMonthlySalary())); yearlydoubleincrementedSalary1 = employee1.getMonthlySalary() + employee1.getMonthlySalary() * 0.1;
          employee1.setMonthlySalary(incrementedSalary1);
          doubleincrementedSalary2 = employee2.getMonthlySalary()+ employee2.getMonthlySalary() * 0.1;
          employee2.setMonthlySalary(incrementedSalary2);
          System.out.println("\n" + employee1.getFirstName() + " " + employee1.getLastName() + " Yearly Salary :"+ (12 * employee1.getMonthlySalary()));
          System.out.println("\n" + employee2.getFirstName() + " " + employee2.getLastName() + " Yearly Salary :"+ (12 * employee2.getMonthlySalary()));
          }
}

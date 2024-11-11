package Oct.ex_08112024;
import java.time.Period;
import java.time.LocalDate;
public class oopsConcept
{
   private String name;
   private float salary;
   private LocalDate hireDate;

   public oopsConcept(String name,float salary,LocalDate hireDate)
   {
       this.salary=salary;
       this.name=name;
       this.hireDate=hireDate;

   }
   public String getName()
   {
       return name;
   }

   public void setName()
   {
       this.name = name;
   }

   public float getSalary()
   {
       return getSalary();
   }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;

    }
    public int year_of_exp()
    {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printEmpDetails() {
        System.out.println("\nName: " + name);

        // Print the salary of the employee
        System.out.println("Salary: " + salary);

        // Print the hire date of the employee
        System.out.println("Hire Date: " + hireDate);
    }
    public static void main(String []args)
    {
        oopsConcept emp1=new oopsConcept("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        emp1.printEmpDetails();
        System.out.println(emp1.year_of_exp());

}
}

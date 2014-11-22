
public class Empl{
     
    private String name;
    private int salary;
    private int empId;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
    
    public Empl(int id, String name, int salary){
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }
     

     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
    
    public int getEmpId() {
        return empId;
    }

    
    
}



public class Main {
    public static void main(String args[]){
    Employee emp= new Employee("RAM",7800);
    EmployeeRepository rep= new EmployeeRepository();
    EmployeePrinter print= new EmployeePrinter();

    rep.save(emp);
    print.print(emp);
}
}

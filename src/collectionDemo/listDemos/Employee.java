package collectionDemo.listDemos;

public class Employee implements Comparable<Employee>{
    private Integer employeeId;
    private String employeeName;
    private Integer employeeSalary;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName, Integer employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        //positive
        //negative
        //0
        //20 10
        //10 20
//        return this.getEmployeeId() - employee.getEmployeeId();
        return this.getEmployeeSalary() - employee.getEmployeeSalary();
    }
}

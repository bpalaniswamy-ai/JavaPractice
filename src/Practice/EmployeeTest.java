package Practice;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "raj", 30, "Male", 85000, "research");

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("shilpa");
        emp2.setAge(35);
        emp2.setGender("Female");
        emp2.setSalary(100000);
        emp2.setDepartment("Manager");

        System.out.println(emp1);
        System.out.println(emp2);
    }
}

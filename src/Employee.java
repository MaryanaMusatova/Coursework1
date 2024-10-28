import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    private static int idCount = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getIdCount() {
        return idCount;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setIdCount(int idCount) {
        Employee.idCount = idCount;
    }

    public static Employee createEmployee(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        return employee;
    }

    public static void namedEmployees() {
        Employee[] employees = new Employee[10];
        employees[0] = createEmployee("Абашин Иван Сергеевич", 1, 147500);
        employees[1] = createEmployee("Бочарников Виталий Андреевич", 3, 99560);
        employees[2] = createEmployee("Гоппе Дмитрий Валентинович", 5, 163000);
        employees[3] = createEmployee("Ефимов Николай Александрович", 2, 89400);
        employees[4] = createEmployee("Костромина Анна Анатольевна", 1, 125000);
        employees[5] = createEmployee("Лукьянов Юрий Викторович", 4, 110700);
        employees[6] = createEmployee("Морозова Валерия Юрьевна", 3, 107000);
        employees[7] = createEmployee("Никифоров Андрей Андреевич", 4, 170400);
        employees[8] = createEmployee("Петренко Оксана Георгиевна", 2, 100800);
        employees[9] = createEmployee("Самохвалов Александр Петрович", 5, 157000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return id + " " + fullName + " " + department + " " + salary;
    }
}


public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Курсовое задание. Книга сотрудников. Базовая сложность");
        Employee.namedEmployee();
        int result = calculateSalary();
        System.out.println("Общая сумма затрат на зарплату составляет " + result + " руб");
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeMaxSalary());
        System.out.println("Средняя зарплата: " + getMiddleSalary());
        printFullNames();
    }

    private static int calculateSalary() {
        int result = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            result = result + employee.getSalary();
        }
        return result;
    }

    public static Employee getEmployeeMinSalary() {
        Employee employeeMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;

    }

    public static Employee getEmployeeMaxSalary() {
        Employee employeeMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public static double getMiddleSalary() {
        return (double) calculateSalary() / employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " ");
        }
    }

}
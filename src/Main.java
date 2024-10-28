public class Main {
    private static Employee[] employees = new Employee[10];

    public static Employee createEmployee(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        return employee;
    }

    private static int calculateSalary(Employee[] employees) {
        int result = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            result = result + employee.getSalary();
        }
        return result;
    }

    public static Employee getEmployeeMinSalary(Employee[] employees) {
        Employee employeeMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;

    }

    public static Employee getEmployeeMaxSalary(Employee[] employees) {
        Employee employeeMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public static double getMiddleSalary(Employee[] employees) {
        return (double) calculateSalary(employees) / employees.length;
    }

    public static void printFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Курсовое задание. Книга сотрудников. Базовая сложность");
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

        int result = calculateSalary(employees);
        System.out.println("Общая сумма затрат на зарплату составляет " + result + " руб");
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeMaxSalary(employees));
        System.out.println("Средняя зарплата: " + getMiddleSalary(employees));
        printFullNames(employees);

    }
}


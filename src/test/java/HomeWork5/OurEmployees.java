package HomeWork5;

public class OurEmployees {

    public static void main(String[] args) {
        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Василий", "Директор","dir@mail.ru",5353035, 150000, 48);
        employeesArr[1] = new Employee("Светлана", "Секретарь","sec@mail.ru",3324235,50000,19);
        employeesArr[2] = new Employee("Федор", "Заместитель","zam@mail.ru",3242355,100000,30);
        employeesArr[3] = new Employee("Галина", "Уборщица","clean@mail.ru",2342353,50000,85);
        employeesArr[4] = new Employee("Кирилл", "Работник","rab@mail.ru",4235236,35000,25);

        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getAge() > 40) {
                employeesArr[i].employeeInfo();
            }
        }

    }


}

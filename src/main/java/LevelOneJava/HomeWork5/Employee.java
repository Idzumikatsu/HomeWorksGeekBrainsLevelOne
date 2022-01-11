package LevelOneJava.HomeWork5;

public class Employee{
    private String name;
    private String rank;
    private String email;
    private long phoneNumber;
    private float wages;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(float wages) {
        if (wages >= 0) {
            this.wages = wages;
        } else {
            System.out.println("Зарплата не может быть отрицательной");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 14) {
            System.out.println("Детский труд запрещен в нашей стране");
        } else if (age > 14 && age <= 17) {
            System.out.println("Судя по введенному Вами возрасту, работнику необходимо письменное разрешение от родителей");
        } else if (age >= 18 && age <= 120) {
            this.age = age;
        } else if (age <= 0) {
            System.out.println("Работник еще не родился");
        } else {
            System.out.println("Люди правда столько живут?");
        }
    }

    public Employee(String name, String rank, String eMail, long phoneNumber, float wages, int age) {
        this.name = name;
        this.rank = rank;
        this.email = eMail;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;
    }


    public void employeeInfo() {
        System.out.println("Имя: " + name + ", Должность: " + rank + ", Эл.почта: " + email + ", Телефон: " + phoneNumber + ", ЗП: " + wages + ", Возраст: " + age);
        }
}

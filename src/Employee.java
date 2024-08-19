public class Employee {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private double salary;
    private int age;

    public Employee(String fio, String position, String email, int phone, double salary, int age){
        this.fio=fio;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }
    public void printInfo(){
        System.out.print(fio + " ");
        System.out.print(position + " ");
        System.out.print(email + " ");
        System.out.print(phone + " ");
        System.out.print(salary + " ");
        System.out.print(age + " ");
    }
}

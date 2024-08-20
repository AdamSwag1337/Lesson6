public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Федоров Иван Иванович", "Директор", "Fedorov@mail.ru", 5150101, 100, 50);
        employeeArray[1] = new Employee("Коршунов Никита Сергеевич", "Зам.Директора", "Kor@mail.ru", 5150102, 70, 38);
        employeeArray[2] = new Employee("Степанова Анна Анатольевна", "Экономист", "Stepanova@mail.ru", 5150103, 45, 30);
        employeeArray[3] = new Employee("Рыбак Дмитрий Сергеевич", "Водитель", "Fisher@mail.ru", 5150104, 28, 25);
        employeeArray[4] = new Employee("Валетов Илья Юрьевич", "Рабочий", "Valetov@mail.ru", 5150105, 25, 34);
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println("Сотрудник " + (i + 1) + ":");
            employeeArray[i].printInfo();
            System.out.println();
        }
        Park park = new Park();
        Park.Attractions attraction1 = new Park.Attractions("Американские горки ", "с 10:00 до 19:00 ", 100 );
        Park.Attractions attraction2 = new Park.Attractions("Сюрприз ", "с 10:00 до 18:00 ", 80.20 );
        Park.Attractions attraction3 = new Park.Attractions("Тир ", "с 10:00 до 16:00 ", 25.40 );
        attraction1.printAttInfo();
        attraction2.printAttInfo();
        attraction3.printAttInfo();
        }
    }

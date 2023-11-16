package Lesson5;

public class Employees {
    String name;
    int id ;
    String title;
    String dateOfBirth ;
    int salary;
    String address;
public Employees(String name, int id, String title, String dateOfBirth, int salary, String address){
    this.name=name;
    this.id=id;
    this.dateOfBirth=dateOfBirth;
    this.salary=salary;
    this.address=address;
};


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary() {
        System.out.println("________________");
        System.out.println(String.format( name + "salary is "+ salary));
    }
    public void managerResp() {
        System.out.println("________________");
        System.out.println(String.format("Manager"+ name + " is able to hire and fire employees"));
    }
    public void clercResp() {
        System.out.println("________________");
        System.out.println(String.format("Clerk"+ name+ " can call to the customer and answer incoming calls"));
    }
    public void accountsResp() {
        System.out.println("________________");
        System.out.println(String.format("Accountant " + name+ " can open a new account, close account and create reports"));
    }
    public void printDetails(){
        System.out.println("________________");
        System.out.println("Name:"+ name);
        System.out.println("Id:"+ id);
        System.out.println("Title:"+ title);
        System.out.println("DateOfBirth:"+ dateOfBirth);
        System.out.println("Salary:"+ salary);
        System.out.println("Address:"+ address);
    }
}

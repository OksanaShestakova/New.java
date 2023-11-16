package Lesson5;

public class BankEmpl {
    public static void main(String[] args) {
        Employees manager1= new Employees("Nick S.",3,"Manager", "12.07.1989",10000,"Rome");

        Employees clerk1= new Employees("Ann K.",15,"Clerk", "15.07.1990",3000,"Paris");
        Employees clerk2= new Employees("Mike T.",16,"Clerk", "15.07.1978",3000,"Madrid");
        Employees clerk3= new Employees("Tom N.",17,"Clerk", "15.07.1986",3000,"Rome");

        Employees accountant1= new Employees("Garry I.",21,"Accountant", "1.07.1993",5000,"Barcelona");
        Employees accountant2= new Employees("Tim K.",22,"Accountant", "5.07.1988",5000,"Istanbul");
        Employees accountant3= new Employees("Olga K.",23,"Accountant", "7.07.1989",5000,"Rome");
        Employees accountant4= new Employees("Matt P.",24,"MAccountant", "12.07.1989",5000,"Madrid");
        Employees accountant5= new Employees("Terry U.",25,"Accountant", "1.07.1986",5000,"Barcelona");

        manager1.printDetails();
        accountant5.printDetails();
        accountant4.receiveSalary();
        accountant2.accountsResp();

    }

}

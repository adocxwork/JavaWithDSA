class Employee{
    String name;
    int yearOfJoining;
    String address;
}

public class a5 {
    public static void main(String[] args) {
        Employee robert = new Employee();
        robert.name = "Robert";
        robert.yearOfJoining = 1994;
        robert.address = "64C- WallsStreet";
        
        Employee sam = new Employee();
        sam.name = "Sam";
        sam.yearOfJoining = 2000;
        sam.address = "68D- WallsStreet";
        
        Employee john = new Employee();
        john.name = "John";
        john.yearOfJoining = 1999;
        john.address = "26B- WallsStreet";
        
        System.out.println("Name,  Year_of_joining,  Address");
        System.out.println();
        System.out.println(robert.name + ",  " + robert.yearOfJoining + ",  " + robert.address);
        System.out.println(sam.name + ",  " + sam.yearOfJoining + ",  " + sam.address);
        System.out.println(john.name + ",  " + john.yearOfJoining + ",  " + john.address);
        
    }
}

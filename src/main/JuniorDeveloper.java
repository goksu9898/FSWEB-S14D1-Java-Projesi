package main;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("JuniorDeveloper starts to working");
        setSalary(10);
    }
}

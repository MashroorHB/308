import java.util.Scanner;

public class Developer extends Employee{
    private String name;
    private String projectname;


    public Developer(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public void add(Employee e) {
        ;
    }

    @Override
    public void remove() {
        ;
    }

    @Override
    public void printHierarchy(int t) {
        String space = "";
        for(int i=0; i<t; i++){
            space+="\t";
        }
        System.out.println(space + "-  " + name);
    }

    @Override
    public void printComponentDetails() {
        System.out.println("Name: "+name);
        System.out.println("Role: Developer");
        System.out.println("Current Project: "+projectname);
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    @Override
    public void prompt() {
        ;
    }
}

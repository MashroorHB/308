import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Employee{
    private String projectname;
    private List<Employee> subordinate;

    public Manager(String name, String projectname){
        this.name = name;
        this.projectname = projectname;
        subordinate = new ArrayList<>();
    }

    public void add(Employee so) {
        subordinate.add(so);
        if(so instanceof Developer) ((Developer) so).setProjectname(projectname);
    }

    public void remove(){
        while(subordinate.size()>0){
            subordinate.remove(0);
        }
    }

    @Override
    public void printHierarchy(int t) {
        String space = "";
        for(int i=0; i<t; i++){
            space+="\t";
        }
        System.out.println(space + "-  " + name + " (" + projectname + ")");
        for(int i=0; i<subordinate.size(); i++){
            subordinate.get(i).printHierarchy(t+1);
        }
    }



    @Override
    public void printComponentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: Project Manager");
        System.out.println("Current Project: " + projectname);
        System.out.println("Number of Supervisees: " + subordinate.size());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Project Manager";
    }

    @Override
    public void prompt() {
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("Select an action:\n1. Add a developer\n2. Remove a developer\n3. Print hierarchy\n4. Print details\n5. Exit current prompt");
            String g = sc.nextLine();
            if(g.equalsIgnoreCase("1")){
                System.out.println("Write name of the developer:");
                s = sc.nextLine();
                Developer a = new Developer(s);
                this.add(a);
            }
            else if(g.equalsIgnoreCase("2")){
                System.out.println("Select a developer:");
                for(int i=0; i<subordinate.size(); i++){
                    System.out.println((i+1)+"."+subordinate.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                subordinate.get(k-1).remove();
                System.out.println("Removed "+subordinate.get(k).getName());
                subordinate.remove(k-1);
            }
            else if(g.equalsIgnoreCase("3")){
                System.out.println("Select a developer:");
                for(int i=0; i<subordinate.size(); i++){
                    System.out.println((i+1)+"."+subordinate.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                subordinate.get(k-1).printHierarchy(0);
            }
            else if(g.equalsIgnoreCase("4")){
                System.out.println("Select a developer:");
                for(int i=0; i<subordinate.size(); i++){
                    System.out.println((i+1)+"."+subordinate.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                subordinate.get(k-1).printComponentDetails();
            }
            else return;
        }
    }
}

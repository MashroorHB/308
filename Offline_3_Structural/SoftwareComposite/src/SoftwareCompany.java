import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftwareCompany implements Participant {
    private String name;
    private List<Employee> subordinate;

    public SoftwareCompany(String name){
        this.name = name;
        subordinate = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Employee e) {
        subordinate.add(e);
    }

    public void remove(){
        for(int i=0; i<subordinate.size(); i++){
            subordinate.get(i).remove();
        }
        while(subordinate.size()>0){
            subordinate.remove(0);
        }
    }

    @Override
    public String getRole() {
        return "Software Company";
    }


    @Override
    public void printHierarchy(int t) {
        String space = "";
        for(int i=0; i<t; i++){
            space+="\t";
        }
        System.out.println(space + "-  " + name );
        for(int i=0; i<subordinate.size(); i++){
            subordinate.get(i).printHierarchy(t+1);
        }
    }

    @Override
    public void printComponentDetails() {
        System.out.println("Name: "+name);
        System.out.println("Role: Software Company");
        System.out.println("Number of Projects: "+subordinate.size());

    }

    @Override
    public void prompt() {
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("Select an action:\n1. Add a project\n2. Remove a project\n.3. Go to project\n4. Print hierarchy\n5. Print details\n6. Exit current prompt");
            String g = sc.nextLine();
            if(g.equalsIgnoreCase("1")){
                System.out.println("Write name of the project:");
                s = sc.nextLine();
                System.out.println("Write name of the manager:");
                String m = sc.nextLine();
                Manager a = new Manager(m,s);
                this.add(a);
            }
            else if(g.equalsIgnoreCase("2")){
                System.out.println("Select a project manager:");
                for(int i=0; i<subordinate.size(); i++){
                    System.out.println((i+1)+"."+subordinate.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();

                subordinate.get(k-1).remove();
                System.out.println("Removed "+subordinate.get(k).getName()+" and all of their subordinates");
                subordinate.remove(k-1);
            }
            else if(g.equalsIgnoreCase("3")){
                System.out.println("Select a project manager:");
                for(int i=0; i<subordinate.size(); i++){
                    System.out.println((i+1)+"."+subordinate.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                subordinate.get(k-1).prompt();
            }
            else if(g.equalsIgnoreCase("4")){
                System.out.println("Select a project manager:");
                for(int i=0; i<subordinate.size(); i++){
                    System.out.println((i+1)+"."+subordinate.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                subordinate.get(k-1).printHierarchy(0);
            }
            else if(g.equalsIgnoreCase("5")){
                System.out.println("Select a project manager:");
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

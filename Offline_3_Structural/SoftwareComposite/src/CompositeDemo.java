import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompositeDemo {
    public static void main(String[] args) {
//        SoftwareCompany a = new SoftwareCompany("Manhattan Company");
//        Manager b = new Manager("Alan Turing", "CSE308");
//        a.add(b);
//        Manager c = new Manager("David Patterson", "CSE308");
//        a.add(c);
//        Developer d = new Developer("Robert Oppenheimer");
//        b.add(d);
//        Developer e = new Developer("John von Neumann");
//        b.add(e);
//        Developer f = new Developer("Alfred Aho");
//        c.add(f);
//
//        b.printComponentDetails();
//        System.out.println("");
//        a.printHierarchy(0);
        List<SoftwareCompany> companies = new ArrayList<>();
        System.out.println("Welcome to developer recruitment window ...");
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("Select an action:\n1. Add a company\n2. Remove a company\n3. Go to company\n4. Print hierarchy\n5. Print details\n6. Exit current prompt");
            String g = sc.nextLine();
            if(g.equalsIgnoreCase("1")){
                System.out.println("Write name of the company:");
                s = sc.nextLine();
                SoftwareCompany a = new SoftwareCompany(s);
                companies.add(a);
            }
            else if(g.equalsIgnoreCase("2")){
                System.out.println("Select a company:");
                for(int i=0; i<companies.size(); i++){
                    System.out.println((i+1)+"."+companies.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                companies.get(k-1).remove();
                System.out.println("Removed "+companies.get(k-1).getName()+" and all of their subordinates");
                companies.remove(k-1);
            }
            else if(g.equalsIgnoreCase("3")){
                System.out.println("Select a company:");
                for(int i=0; i<companies.size(); i++){
                    System.out.println((i+1)+"."+companies.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                companies.get(k-1).prompt();
            }
            else if(g.equalsIgnoreCase("4")){
                System.out.println("Select a company:");
                for(int i=0; i<companies.size(); i++){
                    System.out.println((i+1)+"."+companies.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                companies.get(k-1).printHierarchy(0);
            }
            else if(g.equalsIgnoreCase("5")){
                System.out.println("Select a company:");
                for(int i=0; i<companies.size(); i++){
                    System.out.println((i+1)+"."+companies.get(i).getName());
                }
                int k = sc.nextInt();
                s = sc.nextLine();
                companies.get(k-1).printComponentDetails();
            }
            else break;
        }

    }
}

import bodies.*;
import mediator.*;

import java.io.BufferedReader;
import java.util.Scanner;

public class ScrutinyMain {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator(7);

        Body teacher = new Examiner(mediator);
        Body controller = new Controller(mediator);

        Body student[] = new Student[5];
        student[0] = new Student(mediator, 1905067);
        student[1] = new Student(mediator, 1905069);
        student[2] = new Student(mediator, 1905077);
        student[3] = new Student(mediator, 1905082);
        student[4] = new Student(mediator, 1905084);

        mediator.generateScripts();

        System.out.println("Sending scripts to examiner");

        for(int i=0; i<5; i++){
            student[i].send();
        }

        System.out.println("Sending from Examiner to Controller");

        teacher.receive();
        teacher.send();

        controller.receive();

        controller.send();

        for(int i=0; i<5; i++){
            student[i].receive();
        }


        while(true){
            System.out.println("Does any student want to apply for rescrutiny? Y/N");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("Y")){
                for(int i=0; i<5; i++){
                    System.out.println(student[i].getName()+" wants to recheck?");
                    s = sc.nextLine();
                    if(s.equalsIgnoreCase("Y")){
                        student[i].send();
                    }
                }
                System.out.println("Sending from Examiner to Controller");

                teacher.receive();
                teacher.send();

                controller.receive();

                controller.send();

            }
        }
    }
}

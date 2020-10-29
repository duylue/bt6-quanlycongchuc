package programs;

import creat.Menus;
import manager.PersonalInformation;
import staffIT.StaffIT;

import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        PersonalInformation per = new PersonalInformation();
        Menus menus= new Menus();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 Creat personal information  ");
            System.out.println("2 check personal information ");
            System.out.println("3 check staffs salary 8m+ ");
            System.out.println("4 sum salary in month ");
            System.out.println("5 check all infor staff ");
            System.out.println("6 exit ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    StaffIT newStaff= menus.addStaff();
                    per.add(newStaff);
                    break;
                case 2:
                    per.checkPerInformation();
                    break;
                case 3:
                    per.checkSS8Plus();break;
                case 4:
                    System.out.println("sum salary in month is ");
                    per.sumSalary();
                    break;
                case 5:
                    per.read();
                    break;
                case 6:
                    System.out.print("exit");
                   System.exit(1);
            }
        }while (true);
    }

}

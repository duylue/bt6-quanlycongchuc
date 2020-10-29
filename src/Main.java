



import staff.Staff_IT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
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
                    Staff_IT newStaff= menus.addStaff();
                    manage.add(newStaff);
                    break;
                case 2:
                    manage.checkPerInformation();
                    break;
                case 3:
                    manage.checkSS8Plus();break;
                case 4:
                    System.out.println("sum salary in month is ");
                    manage.sumSalary();
                    break;
                case 5:
                    manage.read();
                    break;
                case 6:
                    System.out.print("exit");
                   System.exit(1);
            }
        }while (true);
    }

}

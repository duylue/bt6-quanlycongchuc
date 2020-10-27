package creat;

import staffIT.StaffIT;

import java.util.Scanner;

public class Menus {
    Scanner scanner = new Scanner(System.in);
    public StaffIT addStaff() {
        StaffIT it = new StaffIT();
        System.out.println("Enter ID : ");
        it.setId(scanner.nextLine());
        System.out.println("Enter full name : ");
        it.setFullName(scanner.nextLine());
        System.out.println("Enter address: ");
        it.setAddress(scanner.nextLine());
        System.out.println("Enter Age : ");
        it.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter salary basic: ");
        it.setSalaryBasic(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter salary bonus : ");
        it.setSalaryBonus(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter salary punish : ");
        it.setSalaryPunish(Integer.parseInt(scanner.nextLine()));
        return it;
    }
}

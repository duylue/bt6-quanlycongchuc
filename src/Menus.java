import staff.Staff_IT;

import java.util.Scanner;

public class Menus {
    Scanner scanner = new Scanner(System.in);
    public Staff_IT addStaff() {
        Staff_IT it = new Staff_IT();
        System.out.println("Enter ID : ");
        it.setId(scanner.nextLine());
        System.out.println("Enter full name : ");
        it.setFullName(scanner.nextLine());
        System.out.println("Enter address: ");
        it.setAddress(scanner.nextLine());
        System.out.println("Enter Age : ");
        it.setAge(input());
        System.out.println("Enter salary basic: ");
        it.setSalaryBasic(input());
        System.out.println("Enter salary bonus : ");
        it.setSalaryBonus(input());
        System.out.println("Enter salary punish : ");
        it.setSalaryPunish(input());
        return it;
    }
    public int input(){
        int input = 0;
        try {
            int number = Integer.parseInt(new Scanner(System.in).nextLine());
            if (number>0){
                input= number;
            }else {
                System.out.println("Không hợp lệ, Nhập lại!");
                input= input();
            }
        }catch (Exception e){
            System.out.println("Không hợp lệ, Nhập lại!");
            input=input();
        }
        return input;
    }
}

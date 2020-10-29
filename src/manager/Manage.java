package manager;

import staffIT.StaffIT;

import java.util.ArrayList;
import java.util.Collections;

public class PersonalInformation {
    private ArrayList<StaffIT> listStaff = new ArrayList<>();

    public void add(StaffIT staff) {
        listStaff.add(staff);
    }

    public void read() {
        Collections.sort(listStaff);
        for (StaffIT x : listStaff
        ) {
            System.out.println(x.toString());
        }
    }

    public void checkPerInformation() {
        for (StaffIT x : listStaff
        ) {
            System.out.println(x.getPerInformation());
        }
    }

    public void checkSS8Plus(){
        ArrayList<StaffIT> salary8mPlus = new ArrayList<>();
        for (StaffIT x : listStaff) {
            if (x.trueSalary() > 8000000) {
                salary8mPlus.add(x);
            }
        }
        for (StaffIT a:salary8mPlus) {
            System.out.println(a.toString());
        }

    }
    public void sumSalary(){
        int sum=0;
        for (StaffIT x : listStaff
        ) {
            sum+=x.trueSalary();
        }
        System.out.println(sum);

    }

}

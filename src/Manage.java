import staff.Staff_IT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Manage {
    private ArrayList<Staff_IT> listStaff = (ArrayList<Staff_IT>) readFile();

    public void add(Staff_IT staff) {
        listStaff.add(staff);
        writeFile();

    }

    static final String nameFile = "STAFFIT2.DAT";

    public void writeFile() {

        try {
            FileOutputStream fos = new FileOutputStream(nameFile);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(listStaff);
            oss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Object readFile() {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream(nameFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void read() {
        Collections.sort(listStaff);
        for (Staff_IT x : listStaff
        ) {
            System.out.println(x.toString());
        }
    }

    public void checkPerInformation() {
        for (Staff_IT x : listStaff) {
            System.out.println(x.getPerInformation());
        }
    }

    public void checkSS8Plus() {
        ArrayList<Staff_IT> salary8mPlus = new ArrayList<>();
        for (Staff_IT x : listStaff) {
            if (x.trueSalary() > 8000000) {
                salary8mPlus.add(x);
            }
        }
        for (Staff_IT a : salary8mPlus) {
            System.out.println(a.toString());
        }

    }

    public void sumSalary() {
        int sum = 0;
        for (Staff_IT x : listStaff) {
            sum += x.trueSalary();
        }
        System.out.println(sum);

    }

}

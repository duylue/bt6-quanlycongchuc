package staff;

import staff.Staff;

import java.io.Serializable;

public class Staff_IT extends Staff implements Comparable<Staff_IT> {
    private int salaryBasic;
    private int salaryBonus;
    private int salaryPunish;

    public Staff_IT() {
    }


    public int getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(int salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public int getSalaryPunish() {
        return salaryPunish;
    }

    public void setSalaryPunish(int salaryPunish) {
        this.salaryPunish = salaryPunish;
    }

    public int trueSalary() {
        int trueSalary = getSalaryBasic() + getSalaryBonus() - getSalaryPunish();
        return trueSalary;
    }

    public String addStyleSalary() {
        String str = String.valueOf(getSalaryBasic());
        return str;
    }

    @Override
    public String toString() {
        return "StaffIT{" +
                "id : '" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", address : '" + getAddress() + '\'' +
                ", Age : '" + getAge() + '\'' +
                ", salaryBasic=" + salaryBasic +
                ", salaryBonus=" + salaryBonus +
                ", salaryPunish=" + salaryPunish +
                ", salaryTrue=" + trueSalary() +
                '}';
    }

    @Override
    public String getPerInformation() {

        return super.getPerInformation();
    }

    @Override
    public int compareTo(Staff_IT staffIT) {

        return this.addStyleSalary().compareTo(staffIT.addStyleSalary());
    }


}

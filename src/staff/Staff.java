package staff;

public class Staff {
    private String id;
    private String fullName ;
    private String address;
    private int age;

    public Staff() {
    }

    public Staff(String id, String fullName, String address, int age) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getPerInformation() {
        return "Staff Có ID :"+ id + " {" +
                " id= '" + id + '\'' +
                ", fullName= '" + fullName + '\'' +
                ", address= '" + address + '\'' +
                ", edge= " + age +
                '}';
    }

}

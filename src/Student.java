public class Student {
    private String name;
    private String surname;
    private String idno;
    private String address;
    private int not;

    public Student(String name, String surname, String idno, String address,int not) {
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.address = address;
        if(not>100 || not<0){
            not=0;
        }
        this.not=not;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public String getSurname(){
        return this.name;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getIdno(){
        return this.idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
}

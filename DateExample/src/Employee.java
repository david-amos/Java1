import java.time.LocalDate;

public class Employee {
    private String empName;
    private String empPhone;
    private LocalDate empBirthDate;

    public Employee(){
        empName = "";
        empPhone = "";
        empBirthDate = LocalDate.of(2000,01,01);
    }

    public Employee(String nm, String ph, LocalDate bd){
        setEmpName(nm);
        setEmpPhone(ph);
        setEmpBirthDate(bd);
    }

    public String getEmpName(){return empName;}

    public void setEmpName(String nm){empName = nm;}

    public String getEmpPhone(){return empPhone;}

    public void setEmpPhone(String ph){empPhone = ph;}

    public LocalDate getEmpBirthDate(){return empBirthDate;}

    public void setEmpBirthDate(LocalDate bd){empBirthDate = bd;}
}

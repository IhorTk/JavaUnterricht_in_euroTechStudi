package Day_32_Konstruktor;

public class SDET {
    String name, company, newCompany ="";
    public int age;
    public char gender;
    public double salary;
    public boolean isSuccessful;

    public SDET(String name,  int age, char gender, String company, double salary, boolean isSuccessful) {
        this.name = name;
        this.company = company;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.isSuccessful = isSuccessful;
    }

    public int increaseSalary(int salary) {
        if (isSuccessful == true) {
            return salary + 10000;
        } else {
            return salary - 5000;
        }
    }

    public String companyChange(String newCompany){
        if(isSuccessful==true) {
            return newCompany = "Traume";
        }else{
            return newCompany = "Haos";
        }
    }

    @Override
    public String toString() {
        return "SDET{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", newCompany='" + newCompany + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", isSuccessful=" + isSuccessful +
                '}';
    }
}

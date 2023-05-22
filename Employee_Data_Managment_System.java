package assesment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee_Data_Managment_System {
    int empno;
    String name;
    String Gender;
    int basicsal;
    String city;
    String depyname;

    public Employee_Data_Managment_System(int empno, String name, String gender, int basicsal, String city, String depyname) {
        this.empno = empno;
        this.name = name;
        Gender = gender;
        this.basicsal = basicsal;
        this.city = city;
        this.depyname = depyname;
    }

    public String toString() {
        return
                "empno=" + empno +
                        ", name='" + name + '\'' +
                        ", Gender='" + Gender + '\'' +
                        ", basicsal=" + basicsal +
                        ", city='" + city + '\'' +
                        ", depyname='" + depyname + '\'';
    }

    static ArrayList<Employee_Data_Managment_System> salary(ArrayList<Employee_Data_Managment_System> list) {
        ArrayList<Employee_Data_Managment_System> salarylist = new ArrayList<>();
        for (Employee_Data_Managment_System e : list)
            if (e.basicsal > 45000)
                salarylist.add(e);
        return salarylist;
    }

    static ArrayList<Employee_Data_Managment_System> StayinHYD(ArrayList<Employee_Data_Managment_System> list) {
        ArrayList<Employee_Data_Managment_System> HYDlist = new ArrayList<>();
        for (Employee_Data_Managment_System e : list) {
            if (e.city.equals("Hyderabad")) {
                HYDlist.add(e);
            }
        }
        return HYDlist;
    }

    static int CountEmp(ArrayList<Employee_Data_Managment_System> list) {
        int count = list.size();
        return count;
    }

    static ArrayList<Employee_Data_Managment_System> CSEDepratment(ArrayList<Employee_Data_Managment_System> list) {
        ArrayList<Employee_Data_Managment_System> CSE = new ArrayList<>();
        for (Employee_Data_Managment_System e : list) {
            if (e.depyname.equals("CSE")) {
                CSE.add(e);
            }
        }
        return CSE;
    }

    static ArrayList<Employee_Data_Managment_System> salaryrange(ArrayList<Employee_Data_Managment_System> list) {
        ArrayList<Employee_Data_Managment_System> salaryrange = new ArrayList<>();
        for (Employee_Data_Managment_System e : list)
            if (e.basicsal > 45000 && e.basicsal < 60000)
                salaryrange.add(e);
        return salaryrange;
    }

    static void MalesandFemales(ArrayList<Employee_Data_Managment_System> list) {
        int male_count = 0;
        int female_count = 0;
        for (Employee_Data_Managment_System e : list) {
            if (e.Gender.equals("Male")) {
                male_count += 1;
            } else {
                female_count += 1;
            }
        }
        System.out.println("male count " + male_count);
        System.out.println("female count " + female_count);
    }

    static ArrayList<Employee_Data_Managment_System> StayinHYDandsalary(ArrayList<Employee_Data_Managment_System> list) {
        ArrayList<Employee_Data_Managment_System> HYDlist = new ArrayList<>();
        for (Employee_Data_Managment_System e : list) {
            if (e.city.equals("Hyderabad") && e.basicsal > 40000) {
                HYDlist.add(e);
            }
        }
        return HYDlist;
    }

    static int StayinBnglrandsalary(ArrayList<Employee_Data_Managment_System> list) {
        int total_bnglr_sal = 0;
        for (Employee_Data_Managment_System e : list) {
            if (e.city.equals("Banglore")) {
                total_bnglr_sal += e.basicsal;
            }
        }
        return total_bnglr_sal;
    }

    static int ECEDepratment(ArrayList<Employee_Data_Managment_System> list) {
        int count = 0;
        for (Employee_Data_Managment_System e : list) {
            if (e.depyname.equals("ECE")) {
                count++;
            }
        }
        return count;
    }

    static int Samantha(ArrayList<Employee_Data_Managment_System> list) {
        for (Employee_Data_Managment_System e : list) {
            if (e.name.equals("Samantha")) {
                return e.basicsal;
            }
        }
        return 0;
    }

    static ArrayList<String> startswithS(ArrayList<Employee_Data_Managment_System> list) {
        ArrayList<String> Slist = new ArrayList<>();
        for (Employee_Data_Managment_System e : list) {
            if (e.name.startsWith("S")) {
                Slist.add(e.name);
            }
        }
        return Slist;
    }

    static ArrayList<Employee_Data_Managment_System> SalaryDesc(ArrayList<Employee_Data_Managment_System> list) {
        ArrayList<Employee_Data_Managment_System> Desclist = new ArrayList<>();
        list.sort(Comparator.comparingDouble((Employee_Data_Managment_System emp) -> emp.basicsal).reversed());

        for (Employee_Data_Managment_System emp : list) {
            Desclist.add(emp);
        }
        return Desclist;
    }

    public static void main(String[] args) {
//        Employee_Data_Managment_System e1= new Employee_Data_Managment_System

        ArrayList<Employee_Data_Managment_System> list = new ArrayList<>();
        Employee_Data_Managment_System e1 = new Employee_Data_Managment_System(1001, "kannababu", "Male", 40000, "Hyderabad", "EIE");
        Employee_Data_Managment_System e2 = new Employee_Data_Managment_System(1002, "Srinivas", "Male", 42000, "Chennai", "CSE");
        Employee_Data_Managment_System e3 = new Employee_Data_Managment_System(1003, "Yacob", "Male", 45000, "Banglore", "CSE");
        Employee_Data_Managment_System e4 = new Employee_Data_Managment_System(1004, "Venkat", "Male", 55000, "Hyderabad", "CSE");
        Employee_Data_Managment_System e5 = new Employee_Data_Managment_System(1005, "Samantha", "FeMale", 65000, "Chennai", "ECE");
        Employee_Data_Managment_System e6 = new Employee_Data_Managment_System(1006, "Anushka", "FeMale", 43000, "Banglore", "EIE");
        Employee_Data_Managment_System e7 = new Employee_Data_Managment_System(1007, "Sekhar", "Male", 23000, "Banglore", "ECE");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        System.out.println("details of all Employees");
        System.out.println("   ");
        for (Employee_Data_Managment_System e : list) {
            System.out.println(e);
        }
        System.out.println("   ");
        System.out.println("*************************************************   ");
        System.out.println("   ");
        System.out.println("details whose salary is greater than 45000");
        System.out.println("   ");
        for (Employee_Data_Managment_System e:salary(list)){
            System.out.println(e);
        }

        System.out.println("   ");
        System.out.println("************************************************   ");
        System.out.println("   ");
        System.out.println("details of Employees live in HYderabd");
        System.out.println("   ");
        for (Employee_Data_Managment_System e:StayinHYD(list)){
            System.out.println(e);
        }

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Number of employees in Company" + ' ' + CountEmp(list));

        System.out.println("   ");
        System.out.println("***************************************** ");
        System.out.println("   ");
        System.out.println("Details of employees in CSE Department ");
        System.out.println("   ");
        for (Employee_Data_Managment_System e:CSEDepratment(list)){
            System.out.println(e);
        }

        System.out.println("   ");
        System.out.println("*******************************************");
        System.out.println("   ");
        System.out.println("Details of employe whose salary is in between 45000 nad 60000");
        System.out.println("   ");
        for (Employee_Data_Managment_System e:salaryrange(list)){
            System.out.println(e);
        }

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("***********************************************   ");
        MalesandFemales(list);

        System.out.println("   ");
        System.out.println("***********************************************   ");
        System.out.println("   ");
        System.out.println("Details of employees who stay in hyderbad nad salary greater than 40000");
        System.out.println("   ");
        for (Employee_Data_Managment_System e:StayinHYDandsalary(list)){
            System.out.println(e);
        }

        System.out.println("   ");
        System.out.println("***********************************************   ");
        System.out.println("   ");
        System.out.println("total salary of employees who live in banglore" + ' ' + StayinBnglrandsalary(list));

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("No.of employees in ECE" + ' ' + ECEDepratment(list));
        System.out.println("*************************************************   ");
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Salary of Samantha" + ' ' + Samantha(list));
        System.out.println("*************************************************   ");
        System.out.println("   ");
        System.out.println("******************************");
        System.out.println("Name Starts with S" + ' ' + startswithS(list));


        System.out.println("   ");
        System.out.println("******************************");
        System.out.println("Salary of employees in Descding Order");
        System.out.println("   ");
        for (Employee_Data_Managment_System e:SalaryDesc(list)){
            System.out.println(e);
        }

    }
}

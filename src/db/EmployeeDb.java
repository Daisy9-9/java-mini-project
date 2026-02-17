package db;

import lombok.Getter;
import model.entities.Employee;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class EmployeeDb {
    private final List <Employee> employeeList;
    public EmployeeDb(){
        employeeList = new ArrayList<>(){{
            add(new Employee(
                    "Liza",2000.00, LocalDate.now()
            ));
            add(new Employee(
                    "Jenny",3000.00, LocalDate.now().minusDays(7)
            ));
            add(new Employee(
                    "Sl ke mank eg",5000.00, LocalDate.now().minusMonths(2)
            ));
            add(new Employee(
                    "Tena",5000.00, LocalDate.now()
            ));
            add(new Employee(
                    "Sok Pisey",4500.00, LocalDate.now().minusDays(7)
            ));
            add(new Employee(
                    "vann Da",1400.00, LocalDate.now().minusMonths(2)
            ));
            add(new Employee(
                    "G davith",200.00, LocalDate.now().minusDays(7)
            ));
            add(new Employee(
                    "Rose",1400.00, LocalDate.now().minusMonths(2)
            ));
        }};
    }


}
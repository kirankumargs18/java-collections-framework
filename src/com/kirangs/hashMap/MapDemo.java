package com.kirangs.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

//        Employee emp1 = new Employee(1, "John Doe", "Engineering");
//        Employee emp2 = new Employee(2, "Jane Smith", "Marketing");
//        Employee emp3 = new Employee(3, "Mike Johnson", "Sales");

//        Map<String, Employee> employeeMap = new HashMap<>();
//
//        employeeMap.put(emp1.getDepartment(), emp1);
//
//        //putIfAbsent method inserts only if value is not present for the key else it will ignore
//        Employee putIfAbsent = employeeMap.putIfAbsent("Engineering", new Employee(1, "John Doe", "Engineering"));
//        System.out.println(putIfAbsent);
//        System.out.println(employeeMap.get("Engineering"));

        Employee emp1 = new Employee(1, "John Doe", "Engineering");
        Employee emp2 = new Employee(2, "Jane Smith", "Marketing");
        Employee emp3 = new Employee(3, "Mike Johnson", "Sales");

        Map<String, Employee> employeeMap = new HashMap<>();
        System.out.println(employeeMap.put(emp1.getDepartment(), emp1));
        employeeMap.put(emp2.getDepartment(), emp2);
        System.out.println(employeeMap.put(emp3.getDepartment(), emp3));

        Set<Map.Entry<String, Employee>> entries = employeeMap.entrySet();

        //using enhanced for loop
        for (Map.Entry<String, Employee> employeeEntry : employeeMap.entrySet()) {
            System.out.println(employeeEntry.getKey() + " : " + employeeEntry.getValue().getName());
        }

        //using stream
        employeeMap.entrySet().stream().forEach((entry -> System.out.println(entry.getKey() + " : " + entry.getValue().getName())));
    }
}

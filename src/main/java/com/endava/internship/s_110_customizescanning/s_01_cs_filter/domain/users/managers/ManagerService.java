package com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.managers;


import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.employees.Employee;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    public Result manageEmployee(Manager manager, Employee employee) {
        return manager.manage(employee);
    }
}

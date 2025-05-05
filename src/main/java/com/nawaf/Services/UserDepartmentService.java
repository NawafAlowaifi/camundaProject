package com.nawaf.Services;

import org.springframework.stereotype.Component;

@Component
public class UserDepartmentService {
    public String getUserDepartment() {
        System.out.println("Coming from getUserDepartment");
        return "Accounts";
    }
}

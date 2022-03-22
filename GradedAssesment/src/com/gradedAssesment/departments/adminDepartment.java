package com.gradedAssesment.departments;

public class adminDepartment extends superDepartment{

    public adminDepartment() {
        super();
    }

    public String departmentName(){
        return "Welcome to Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }
}

package com.gradedAssesment.departments;

public class techDepartment extends superDepartment{

    String getTechStackInformation;

    public techDepartment() {
        super();
        this.getTechStackInformation = getTechStackInformation();
        System.out.println("getTechStackInformation");
    }

    public String departmentName(){
        return "Welcome to Tech Department";
    }

    public String getTodaysWork(){
        return "Complete coding of module 1";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    public String getTechStackInformation(){
        return "Core Java";
    }
}

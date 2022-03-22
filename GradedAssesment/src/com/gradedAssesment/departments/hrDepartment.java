package com.gradedAssesment.departments;

public class hrDepartment extends superDepartment{

    String doActivity;
    public hrDepartment() {
        super();
        this.doActivity=doActivity();
        System.out.println(doActivity);

    }

    public String departmentName(){
        return "Welcome to HR Department";
    }

    public String getTodaysWork(){
        return "Fill Today's worksheet and mark your attendance";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    public String doActivity(){
        return "Team lunch";
    }

}

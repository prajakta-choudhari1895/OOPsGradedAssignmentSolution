package com.gradedAssesment.departments;

public class superDepartment {

    String departmentName,getTodaysWork,getWorkDeadline,isTodayAHoliday;

    public superDepartment(){
        setDepartmentName();
        System.out.println(departmentName);
        setGetTodaysWork();
        System.out.println(getTodaysWork);
        setGetWorkDeadline();
        System.out.println(getWorkDeadline);
        setIsTodayAHoliday();
        System.out.println(isTodayAHoliday);
    }

    public String departmentName(){
        return "Super Department";
    }

    public void setDepartmentName(){
        this.departmentName = departmentName();
    }

    public String getTodaysWork(){
        return "No work as of now";
    }

    public void setGetTodaysWork(){
        this.getTodaysWork = getTodaysWork();
    }

    public String getWorkDeadline(){
        return "Nil";
    }

    public void setGetWorkDeadline(){
        this.getWorkDeadline=getWorkDeadline();
    }

    public String isTodayAHoliday(){
        return "Today is not a holiday";
    }

    public void setIsTodayAHoliday(){
        this.isTodayAHoliday=isTodayAHoliday();
    }
}

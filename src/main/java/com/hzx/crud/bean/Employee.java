package com.hzx.crud.bean;

public class Employee {
    private Integer empId;

    private String empName;

    private String empSno;

    private Integer deptId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpSno() {
        return empSno;
    }

    public void setEmpSno(String empSno) {
        this.empSno = empSno == null ? null : empSno.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
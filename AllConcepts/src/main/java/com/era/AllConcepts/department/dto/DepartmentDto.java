package com.era.AllConcepts.department.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DepartmentDto {

    private Long deptId;

    private String deptName;

    private String DeptHead;

    private Long totalEmployee;

    private Long totalTeams;

}

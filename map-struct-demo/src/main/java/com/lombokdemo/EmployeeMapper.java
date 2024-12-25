package com.lombokdemo;

import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {
    Employee sourceToDestination(EmployeeDto source);
    EmployeeDto destinationToSource(Employee destination);

}

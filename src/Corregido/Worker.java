/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corregido;

import conmalolor.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Worker extends Employee
{   
    //variable de tipo employeeType
    private EmployeeType employeeType;    

    public Worker(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;    
    }    
    
    public float cs(){
        return fecha.mes() % 2 == 0 ? salary : salary + rmu / 12 * 2;
    }
    
    public float CalculateYearBonus(){
        return 0;
    }
    
}

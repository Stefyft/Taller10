/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corregido;

import conmalolor.EmployeeType;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author CltControl
 */
public class Manager extends Employee {
    
    private EmployeeType employeeType;  

    
    //calcula el bonus anual
    public float CalculateYearBonus() 
    {
      return salary + salary * 1.0F;
        
 
    }

    @Override
    public float cs() {
        float valueM = salary + (bonusPercentage * 0.7F);
        return fecha.mes()%2==0?valueM:valueM + rmu/12*2;    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corregido;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public abstract class Employee {
    
    protected final float rmu = (float) 386.0;
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;

    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public abstract float cs(int month) ;

    //calcula el bonus anual
    public abstract float CalculateYearBonus();
    
}

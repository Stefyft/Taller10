/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corregido;


/**
 *
 * @author Administrador
 */
public class Supervisor extends Employee {

    
    
    

    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public float cs() {
       
       
                float valueS = salary + (bonusPercentage * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return fecha.mes() % 2 == 0 ? valueS : valueS + rmu / 12 * 2;
           
    }

    //calcula el bonus anual
    @Override
    public float CalculateYearBonus() {
       
                return salary + salary * 0.7F;
           
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corregido;


import java.util.List;




public class Example {
    
    public List<Cliente> clientes;
    public List<Employee> empleados;
    
    public void MostrarInformacion(Cliente cliente){
  
        validarInfo(cliente.Nombre,cliente.Apellido,cliente.Cedula);
        
        System.out.println("Nombre: " + cliente.Nombre + ", Apellido: " + cliente.Apellido + ", con numero de cedula: " + cliente.Cedula );
        
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
       
        validarInfo(Nombre,Apellido,Cedula);
      
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula,new Location("","","",""));
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");
        
    }
    
  
    public void  validarInfo(String Nombre, String Apellido, String Cedula){
        boolean nombreIncorrecto=Nombre.equals("") && Nombre.length()> 16;
        boolean apellidoIncorrecto=Apellido.equals("") && Apellido.length()> 16;
        boolean cedulaIncorrecta=!Cedula.equals("") && Cedula.length()< 10;
        
        if(nombreIncorrecto){
            System.out.println("ingreso de nombre incorrecto");
        }
        else{System.out.println("ingreso de nombre correcto"); }
        
        if(apellidoIncorrecto){
          System.out.println("ingreso de apellido incorrecto");
        }
        else{  System.out.println("ingreso de apellido correcto");}
        
        if(cedulaIncorrecta){ System.out.println("ingreso de cedula incorrecto");}
        else{ System.out.println("ingreso de cedula correcto");}
    
    
    
    }
    
}

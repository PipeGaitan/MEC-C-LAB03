/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GUIA3 {

    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args) {
        
       Scanner D= new Scanner(System.in);
        System.out.println("INGRESE LA HORA Y LOS MINUTOS PARA SU ALARMA FORMATO 24H");
        System.out.println("INGRESE SU HORA");
        int h=D.nextInt();
        System.out.println("INGRESE LOS MINUTOS");
        int m=D.nextInt();
        System.out.println("INGRESE TIEMPO DE DURACION DE LA ALRMA");
        int T=D.nextInt();
        
     Date fecha = new Date();
   
     int año = (fecha.getYear());
     int mes = (fecha.getMonth());
     int dia = (fecha.getDate());
     
   
     Date fecha2 = new Date(año,mes,dia,h,m,0);
     int min2 = (fecha2.getMinutes());
     int hora2 = (fecha2.getHours());
     
            
            
     System.out.println("HORA DE SU ALARMA : "+fecha2);
             
     TimerTask timertask;
     timertask = new TimerTask() {
        
         @Override
        public void run() {
             
            Date fecha1 = new Date();
            int min = (fecha1.getMinutes());
            int hora = (fecha1.getHours());
            System.out.println(fecha1);
             
            if(hora==hora2&&min==min2){
            cancel();
            System.out.println("EMPIEZA ALARMA");
            
            TimerTask timertask;
            timertask = new TimerTask() {
        int count = 0;
         @Override
        public void run() {
            
            System.out.println("ding ding");
            Date fecha1 = new Date();
            System.out.println(fecha1);
           
             if(count == T){
                 cancel();
                 System.out.println("ALARMA DETENIDA");
             } 
             count++;
    }   
    };
 Timer timer = new Timer();
 timer.scheduleAtFixedRate(timertask, 0, 10000);
            }
            }
     };
 Timer timer = new Timer();
 timer.scheduleAtFixedRate(timertask, 0, 1000);
    }
}

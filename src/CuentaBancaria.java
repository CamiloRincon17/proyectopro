public class CuentaBancaria{
    public static void main(String[] args) {
        int Dinero=1000;
        int RetiroWeek=200;
        int Week=4;
    
        
        int i=0;
while(Week>i){
     i=1+i;
    Dinero-=RetiroWeek; 
    System.out.println("El Dinero que esta persona tiene en el banco es de "+Dinero+" en la semana "+i); 

        }     
        }
    }

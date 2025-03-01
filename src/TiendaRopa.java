public class TiendaRopa {
public static void main(String[] args) {
    int Camisa =25;
    int Pantalon=30;
    int CantidadCamisetas=2;
    int CantidadPantalones=2;
    int Camisa1=Camisa*CantidadCamisetas; 
    int Pantalon1=Pantalon*CantidadPantalones;
    int Suma =Camisa1+Pantalon1; 
    float Descuentode15 =Suma * 0.15f;
    float TodoDescontado = Suma- Descuentode15 ;
    float Descuentode5 = Suma*0.05f; 
    System.out.println("el presio total de la ropa con el primer descuento "+TodoDescontado);
    System.out.println("el precio de todas las prendas es con descuento de 5% por conpar una segunada camiseta " +(TodoDescontado - Descuentode5)); 

}
    
}
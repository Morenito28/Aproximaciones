public class JuegosCortos extends Videojuego{
    private int Ventas;
    private int numeroVideojuegos;
    JuegosCortos(String Codigo, String Nombre, String Categoria, int Ventas){
        super(Codigo, Nombre, Categoria);
        setVentas(Ventas);
    }
    
    double caucularVentas(){
        for(int i = 0; i < numeroVideojuegos; i++){
            Ventas++;
        }
        
        return Ventas;
    }
    
    public int getVentas(){
        return Ventas;
    }
    
    public void setVentas(int Ventas){
        if (Ventas >= 0){
            this.Ventas = Ventas;
        }
        else{
            this.Ventas = 0;
        }
    }
}
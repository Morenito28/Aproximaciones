public class JuegosNormales extends Videojuego{
    private int Ventas;
    private int numeroVideojuegos;
    
    JuegosNormales(String Codigo, String Nombre, String Categoria, int Ventas) throws Exception{
        super(Codigo, Nombre, Categoria);
        setVentas(Ventas);
    }
    
    public double calcularVentas(){
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
import java.util.ArrayList;

public class Plataforma{
    private final String NIT;
    private String nombrePlataforma;
    private String Direccion;
    private ArrayList Juego;
    private int numeroVideojuegos;
    
    public Plataforma(String NIT, String Nombre, String Direccion){
        if (NIT != null){
            this.NIT = NIT;
        } else{
            this.NIT = "";
        }
        
        setNombrePlataforma(Nombre);
        setDireccion(Direccion);
        Juego = Juego = new ArrayList();
        numeroVideojuegos = 0;
    }
    
    public String getNIT(){
        return NIT;
    }
    
    public String getNombrePlataforma(){
        return nombrePlataforma;
    }
    public void setNombrePlataforma(String Nombre){
        if (Nombre != null){
            this.nombrePlataforma = Nombre;
        } else{
            this.nombrePlataforma = "";
        }
    }
    
    public String getDireccion(){
        return Direccion;
    }
    public void setDireccion(String Direccion){
        if (Direccion != null){
            this.Direccion = Direccion;
        } else{
            this.Direccion = "";
        }
    }
    
    public double calcularPromedioGeneral(){
        double Promedio = 0;
        for (int i = 0; i < Juego.size(); i++){
            Promedio += ((Videojuego)Juego.get(i)).calcularVentas();
        }
        
        return Promedio / numeroVideojuegos;
    }
    
    public void adicionarVideojuegoCorto(String Codigo, String Nombre, String Categoria, int Ventas)throws Exception{
        Juego.add(new JuegosCortos(Codigo, Nombre, Categoria, Ventas));
    }
    
    public void adicionarVideojuegoNormal(String Codigo, String Nombre, String Categoria, int Ventas)throws Exception{
        Juego.add(new JuegosNormales(Codigo, Nombre, Categoria, Ventas));
    }
    
    public void adicionarVideojuegoLargo(String Codigo, String Nombre, String Categoria, int Ventas)throws Exception{
        Juego.add(new JuegosLargos(Codigo, Nombre, Categoria, Ventas));
    }
}

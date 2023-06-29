public class Videojuego{
    protected final String Codigo;
    private String Nombre;
    private String Categoria;
    
    public Videojuego(String Codigo, String Nombre, String Categoria){
        if (Codigo != null){
            this.Codigo = Codigo;   
        }
        else {
            this.Codigo = "";
        }
        
        setNombre(Nombre);
        setCategoria(Categoria);
    }
    
    double calcularVentas(){
        return 0;
    }
    
    
    
    public String getCodigo(){
        return Codigo;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        if (Nombre != null){
            this.Nombre = Nombre;
        }
        else{
            this.Nombre = "";
        }
    }
    
    public String getCategoria(){
        return Categoria;
    }
    
    public void setCategoria(String Categoria){
        if (Categoria != null){
            this.Categoria = Categoria;
        }
        else{
            this.Categoria = "";
        }
    }
}
public abstract class Videojuego{
    protected final String Codigo;
    private String Nombre;
    private String Categoria;
    
    public Videojuego(String Codigo, String Nombre, String Categoria) throws Exception{
        if (Codigo.trim().equals("")){
            throw new Exception("Valor inválido en la identificación");
        }
        if (Codigo.matches(".*[a-zA-Z].*")){
            throw new Exception("El código de juego no puede tener estos caracteres.");
        }
        
        this.Codigo = Codigo;
        setNombre(Nombre);
        setCategoria(Categoria);
    }
    
    public abstract double calcularVentas();
    
        
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
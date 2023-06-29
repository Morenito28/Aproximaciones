import java.util.Scanner;

public class Ventas{
    public static void main(String[] args) throws Exception{
        Scanner Scan = new Scanner(System.in);
        
        Plataforma laPlataforma = new Plataforma("910.475.254", "Steam", "Barrios Unidos");
        String Codigo, Nombre, Categoria;
        int Ventas;
        double Promedio = 0;
        int OP = 0;
        
        do{
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("[1]- Adicionar Juego Corto: ");
            System.out.println("[2]- Adicopnar Juego Normal: ");
            System.out.println("[3]- Adicionar Juego Largo");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una opción: ");
            OP = Scan.nextInt();
            
            switch(OP){
                case 1:
                    Scan.nextLine();
                    System.out.println("Digite el código del videojuego: ");
                    Codigo = Scan.next();
                    
                    System.out.println("Digite el nombre del videojuego: ");
                    Nombre = Scan.next();
                        
                    System.out.println("Digite la categoría del videojuego: ");
                    Categoria = Scan.next();
                        
                    System.out.println("Cantidad de ventas del videojuego: ");
                    Ventas = Scan.nextInt();
                        
                    try{
                        laPlataforma.adicionarVideojuegoCorto(Codigo, Nombre,Categoria, Ventas);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    System.out.println("************************************");
                    break;
                    
                case 2:
                    Scan.nextLine();
                    System.out.println("Digite el código del videojuego: ");
                    Codigo = Scan.next();
                    
                    System.out.println("Digite el nombre del videojuego: ");
                    Nombre = Scan.next();
                
                    System.out.println("Digite la categoría del videojuego: ");
                    Categoria = Scan.next();
                    
                    System.out.println("Cantidad de ventas del videojuego: ");
                    Ventas = Scan.nextInt();
                    
                    try{
                        laPlataforma.adicionarVideojuegoNormal(Codigo, Nombre,Categoria, Ventas);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    System.out.println("************************************");
                    break;
                    
                case 3:
                    Scan.nextLine();
                    System.out.println("Digite el código del videojuego: ");
                    Codigo = Scan.next();
                        
                    System.out.println("Digite el nombre del videojuego: ");
                    Nombre = Scan.next();
                        
                    System.out.println("Digite la categoría del videojuego: ");
                    Categoria = Scan.next();
                        
                    System.out.println("Cantidad de ventas del videojuego: ");
                    Ventas = Scan.nextInt();
                        
                    try{
                        laPlataforma.adicionarVideojuegoLargo(Codigo, Nombre,Categoria, Ventas);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }

                    System.out.println("************************************");
                    break;
                    
                case 4:
                    Scan.nextLine();
                    Promedio = laPlataforma.calcularPromedioGeneral();
                    System.out.println("El promedio de ventas es: " + Promedio + ".");
                    break;
                    
                default:
                    Scan.nextLine();
                    System.out.println("Ha seleccionado Salir.");
                    
            }
        } while(OP != 5);        
    }
}
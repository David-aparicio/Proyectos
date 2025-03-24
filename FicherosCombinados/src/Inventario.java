import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Inventario{

    public static void main(String[] args) {

        LinkedList<Producto> productos = new LinkedList<>();


        Scanner sc = new Scanner(System.in);
        try(FileReader file = new FileReader("Recursos\\productos.csv");BufferedReader reader = new BufferedReader(file);){
            String linea = reader.readLine();
            
            while (linea!= null) {
                String[] datos = linea.split("/");               
                    Producto p = new Producto(datos[0], datos[1], datos[2], datos[3]);
                    productos.add(p);
                    linea = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } 
        int pos = 0;
        boolean eof = false;
        try(FileInputStream fichero = new FileInputStream("Recursos\\almacen.dat"); DataInputStream reader = new DataInputStream(fichero)){

            if(!eof){
                int cantidad = reader.readInt();
                double precio = reader.readDouble();
                int descuento = reader.readInt();
                int iva = reader.readInt();
                boolean aplicarDto = reader.readBoolean();

                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setPrecio(precio);
                productos.get(pos).setDescuento(descuento);
                productos.get(pos).setIva(iva);
                productos.get(pos).setAplicarDto(aplicarDto);
                
            }else{
                eof = true;
            }
        }catch(EOFException e) {
            eof = true;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        String opcion;
        
        do {
            System.out.println("1. Mostrar Productos en el Inventario");
            System.out.println("2. Eliminar Producto por referencia - Ejemplo(ref-001)");
            System.out.println("3. Guardar y Salir");
            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                for (Producto p : productos) {
                    System.out.println(p);
                }
                    
                    break;
                case "2":
                    System.out.print("Introduce la referencia del producto para eliminarlo: ");
                    String referencia = sc.nextLine();

                    break;
                case "3":
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("./resource/productos.csv"))) {
                    for (Producto p : productos) {
                        writer.write(p.getReferencia() + "," + p.getNombre() + "," + p.getDescripcion() + "," + p.getTipo());
                        writer.newLine();
                    }
                    System.out.println("Productos guardados en productos.csv");
                } 
                catch (IOException e) {
                    System.out.println("Error al guardar el archivo CSV: " + e.getMessage());
                }
        
                try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("./resource/almacen.dat"))) {
                    for (Producto p : productos) {
                        dataOutputStream.writeInt(p.getCantidad());
                        dataOutputStream.writeDouble(p.getPrecio());
                        dataOutputStream.writeInt(p.getDescuento());
                        dataOutputStream.writeInt(p.getIva());
                        dataOutputStream.writeBoolean(p.isAplicarDto());
                    }
                    System.out.println("Productos guardados en almacen.dat");
                } 
                catch (IOException e) {
                    System.out.println("Error al guardar el archivo DAT: " + e.getMessage());
                }

                    break;
                
                
                default:
                    System.out.println("Opcion no valida");
            
        }
    }while (opcion != "3");
        
    }
}

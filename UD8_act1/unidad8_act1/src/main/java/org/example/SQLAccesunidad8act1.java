package org.example;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SQLAccesunidad8act1 {

    //Mostrar Productos
    public List<Inventario> getMostrartodos() {
        List<Inventario> productos = new LinkedList<>();
        //Sentencia SQL
        String sql = "SELECT * FROM Inventario";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
        ResultSet dataSet = statement.executeQuery(sql);){
            while (dataSet.next()){
                int Id = dataSet.getInt(1);
                String Referencia = dataSet.getString(2);
                String Nombre = dataSet.getString(3);
                String Descripcion = dataSet.getString(4);
                int Tipo = dataSet.getInt(5);
                int Cantidad = dataSet.getInt(6);
                double Precio = dataSet.getDouble(7);
                int Descuento = dataSet.getInt(8);
                int IVA = dataSet.getInt(9);
                boolean AplicarDto = dataSet.getBoolean(10);

                Inventario p1 = new Inventario(Id,Referencia,Nombre,Descripcion,Tipo, Cantidad,Precio,Descuento,IVA,AplicarDto);
                productos.add(p1);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return productos;
    }

    //Buscar por Referencia
    public List<Inventario> getBuscarReferencia(String referencia) {
        List<Inventario> BuscReferencia = new LinkedList<>();

        String sql = "SELECT * FROM Inventario WHERE Referencia = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sql);){
            statement.setString(1, referencia);
            ResultSet dataSet = statement.executeQuery();
            while (dataSet.next()){
                int Id = dataSet.getInt(1);
                String Referencia = dataSet.getString(2);
                String Nombre = dataSet.getString(3);
                String Descripcion = dataSet.getString(4);
                int Tipo = dataSet.getInt(5);
                int Cantidad = dataSet.getInt(6);
                double Precio = dataSet.getDouble(7);
                int Descuento = dataSet.getInt(8);
                int IVA = dataSet.getInt(9);
                boolean AplicarDto = dataSet.getBoolean(10);

                Inventario p2 = new Inventario(Id,Referencia,Nombre,Descripcion,Tipo, Cantidad,Precio,Descuento,IVA,AplicarDto);
                BuscReferencia.add(p2);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return BuscReferencia;
    }
    //Buscar por tipos

        //Primero vamos a enseñar todos los tipos de la tabla de sql

        public List<Tipos> getTiposmostrar() {
        List<Tipos> tiposList = new LinkedList<>();
        String sql = "SELECT * FROM Tipos";

        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet dataSet = statement.executeQuery();){
            while (dataSet.next()){
                int Id = dataSet.getInt(1);
                String Nombre = dataSet.getString(2);

                Tipos t1 = new Tipos(Id,Nombre);
                tiposList.add(t1);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return tiposList;
        }
        //Ahora la funcion de tipos

        public List<Inventario> getBuscarTipos(int tipo) {
        List<Inventario> BuscTipo = new LinkedList<>();
        String sql = "SELECT * FROM Inventario WHERE Tipo = ?";
            try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sql);){
                statement.setInt(1, tipo);
                ResultSet dataSet = statement.executeQuery();
                while (dataSet.next()){
                    int Id = dataSet.getInt(1);
                    String Referencia = dataSet.getString(2);
                    String Nombre = dataSet.getString(3);
                    String Descripcion = dataSet.getString(4);
                    int Tipo = dataSet.getInt(5);
                    int Cantidad = dataSet.getInt(6);
                    double Precio = dataSet.getDouble(7);
                    int Descuento = dataSet.getInt(8);
                    int IVA = dataSet.getInt(9);
                    boolean AplicarDto = dataSet.getBoolean(10);

                    Inventario p3 = new Inventario(Id,Referencia,Nombre,Descripcion,Tipo, Cantidad,Precio,Descuento,IVA,AplicarDto);
                    BuscTipo.add(p3);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return BuscTipo;
        }

        //Buscar por cantidad
        public List<Inventario> getBuscarCantidad(int cantidad) {
        List<Inventario> BuscCantidad = new LinkedList<>();
        String sql = "SELECT * FROM Inventario WHERE Cantidad = ?";
        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sql);){
            statement.setInt(1, cantidad);
            ResultSet dataSet = statement.executeQuery();
            while (dataSet.next()){
                int Id = dataSet.getInt(1);
                String Referencia = dataSet.getString(2);
                String Nombre = dataSet.getString(3);
                String Descripcion = dataSet.getString(4);
                int Tipo = dataSet.getInt(5);
                int Cantidad = dataSet.getInt(6);
                double Precio = dataSet.getDouble(7);
                int Descuento = dataSet.getInt(8);
                int IVA = dataSet.getInt(9);
                boolean AplicarDto = dataSet.getBoolean(10);

                Inventario p4 = new Inventario(Id,Referencia,Nombre,Descripcion,Tipo, Cantidad,Precio,Descuento,IVA,AplicarDto);
                BuscCantidad.add(p4);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return BuscCantidad;
        }
        //AÑADIRR
    public int insertarProducto(Inventario producto1) {
        int response = -1;
        String sqlStatement = "INSERT INTO Inventario VALUES (Referencia, Nombre, Descripcion, Tipo, Cantidad, Precio, Descuento, IVA, AplicarDto) "+"(?,?,?,?,?,?,?,?,?)";
        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);){

            statement.setNString(1, producto1.getReferencia());
            statement.setNString(2, producto1.getNombre());
            statement.setNString(3, producto1.getDescripcion());
            statement.setInt(4, producto1.getTipo());
            statement.setInt(5, producto1.getCantidad());
            statement.setDouble(6, producto1.getPrecio());
            statement.setInt(7, producto1.getDescuento());
            statement.setInt(8, producto1.getIva());
            statement.setBoolean(9, producto1.isAplicarDto());

            response = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return response;
    }
}


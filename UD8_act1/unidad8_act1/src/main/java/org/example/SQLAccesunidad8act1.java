package org.example;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SQLAccesunidad8act1 {

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

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return productos;
    }


}

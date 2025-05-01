package org.example;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SQLAccesVideoDaw {


    public int insertarVideoDaw(VideoDaw nuevoVideoclub){
        int response = -1;
        String sqlStatement = "INSERT INTO Videodaw (cif,direccion) VALUES (?,?)";
        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);){
            statement.setNString(1, nuevoVideoclub.getCif());
            statement.setNString(2, nuevoVideoclub.getDireccion());

            response = statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    public int insertarPelicula(Pelicula nuevoPelicula){
        int response = -1;
        String sqlStatement = "INSERT INTO Pelicula (titulo,genero_id) VALUES (?,?)";
        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);){
            statement.setNString(1, nuevoPelicula.getTitulo());
            statement.setInt(2, nuevoPelicula.getGeneroId());
            response = statement.executeUpdate();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    public List<GeneroPelícula> getMostrarGP(){
        List<GeneroPelícula> generos = new LinkedList<>();
        String sqlStatement = "SELECT * FROM Pelicula";
        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);
             ResultSet dataSet = statement.executeQuery(sqlStatement);){
            while (dataSet.next()){
                int id = dataSet.getInt(1);
                String nombre = dataSet.getString(2);

                GeneroPelícula g1 = new GeneroPelícula(id,nombre);
                generos.add(g1);
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return generos;
    }

    public int insertarVideojuego(Videojuego nuevoVideojuego){
        int response = -1;
        String sqlStatement = "INSERT INTO Videojuego (titulo,genero_id) VALUES (?,?)";
        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);){
            statement.setNString(1, nuevoVideojuego.getTitulo());
            statement.setInt(2, nuevoVideojuego.getGeneroId());
            response = statement.executeUpdate();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    public List<GeneroVideojuego> getMostrarGV(){
        List<GeneroVideojuego> generos = new LinkedList<>();
        String sqlStatement = "SELECT * FROM Videojuego";
        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);
             ResultSet dataSet = statement.executeQuery(sqlStatement);){
            while (dataSet.next()){
                int id = dataSet.getInt(1);
                String nombre = dataSet.getString(2);

                GeneroVideojuego g2 = new GeneroVideojuego(id,nombre);
                generos.add(g2);
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return generos;
    }

    public int ingresarCliente(Cliente nuevoCliente){
        int response = -1;
        String sqlStatement = "INSERT INTO Cliente (dni,nombre,direccion,fechaNacimiento) VALUES (?,?,?,?)";
        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);){
            statement.setNString(1, nuevoCliente.getDni());
            statement.setString(2, nuevoCliente.getNombre());
            statement.setString(3, nuevoCliente.getDireccion());
            statement.setDate(4, nuevoCliente.getFechaNacimiento()); PREGUNTAR MAÑANA ESTOOOOO

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }



}

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
        String sqlStatement = "SELECT * FROM GeneroPelicula";
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
        String sqlStatement = "SELECT * FROM GeneroVideojuego";
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

            long epoch = nuevoCliente.getFechaNacimiento();
            java.sql.Date fechaNacimiento = new java.sql.Date(epoch * 1000);
            statement.setDate(4, fechaNacimiento);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    public int alquilarPelicula(int idCliente, int idPelicula) throws SQLException {
        int response = -1;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //Actualizar
            String updatePeliculaSql = "UPDATE Pelicula SET fechaAlquilada = CURRENT_TIMESTAMP, isAlquilada = true WHERE id = ?";
            statement = connection.prepareStatement(updatePeliculaSql);
            statement.setInt(1,idPelicula);
            statement.executeUpdate();

            //Insertar en la tabla Alquileres
            String insertAlquilerSql = "INSERT INTO Alquileres (cliente_id, pelicula_id) VALUES (?, ?)";
            statement = connection.prepareStatement(insertAlquilerSql);
            statement.setInt(1, idCliente);
            statement.setInt(2, idPelicula);
            statement.executeUpdate();

            connection.commit();
            response = 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
            try {
                connection.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return response;
    }
    public int alquilarVideojuego(int idCliente, int idVideojuego) throws SQLException {
        int response = -1;
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            String updateVideojuegoSql = "UPDATE Videojuego SET fechaAlquilada = CURRENT_TIMESTAMP, isAlquilada = true WHERE id = ?";
            connection = SQLDataBaseManager.getConnection();
            statement = connection.prepareStatement(updateVideojuegoSql);
            statement.setInt(1, idVideojuego);
            statement.executeUpdate();


            String insertAlquilerSql = "INSERT INTO Alquileres (cliente_id, videojuego_id) VALUES (?, ?)";
            statement = connection.prepareStatement(insertAlquilerSql);
            statement.setInt(1, idCliente);
            statement.setInt(2, idVideojuego);
            statement.executeUpdate();

            connection.commit();
            response = 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return response;
    }

    public List<Cliente> getMostrarClientes(){
        List<Cliente> clienteList = new LinkedList<>();
        String sqlStatement = "SELECT * FROM Cliente";
        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);
            ResultSet dataSet = statement.executeQuery(sqlStatement);){
            while (dataSet.next()){
                int id = dataSet.getInt(1);
                String dni = dataSet.getString(2);
                String nombre = dataSet.getString(3);
                long fechaNacimiento = dataSet.getLong(4);
                String direccion = dataSet.getString(5);
                long fechaRegistro = dataSet.getLong(6);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return clienteList;
    }
    public List<Videojuego> getMostrarVideojuegos(){
        List<Videojuego> videojuegoList = new LinkedList<>();
        String sqlStatement = "SELECT * FROM Videojuego WHERE isAlquilada = false";
        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);
             ResultSet dataSet = statement.executeQuery(sqlStatement);){
            while (dataSet.next()){
                int id = dataSet.getInt(1);
                String titulo = dataSet.getString(2);
                int generoId = dataSet.getInt(3);
                long fechaRegistro = dataSet.getLong(4);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return videojuegoList;
    }
    public int devolverPelicula(int idPelicula) throws SQLException {
        int response = -1;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            // Actualizar la película a no alquilada
            String updatePeliculaSql = "UPDATE Pelicula SET fechaAlquilada = null, isAlquilada = false WHERE id = ?";
            connection = SQLDataBaseManager.getConnection();
            statement = connection.prepareStatement(updatePeliculaSql);
            statement.setInt(1, idPelicula);
            statement.executeUpdate();

            connection.commit();
            response = 1;  // Éxito
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (connection != null) {
                try {
                    connection.rollback();  // Revertir si algo falla
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return response;
    }

    public int devolverVideojuego(int idVideojuego) throws SQLException {
        int response = -1;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            // Actualizar el videojuego a no alquilado
            String updateVideojuegoSql = "UPDATE Videojuego SET fechaAlquilada = null, isAlquilada = false WHERE id = ?";
            connection = SQLDataBaseManager.getConnection();
            statement = connection.prepareStatement(updateVideojuegoSql);
            statement.setInt(1, idVideojuego);
            statement.executeUpdate();

            connection.commit();
            response = 1;  // Éxito
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (connection != null) {
                try {
                    connection.rollback();  // Revertir si algo falla
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return response;
    }
    public List<Pelicula> getMostrarPeliculas() {
        List<Pelicula> peliculaList = new LinkedList<>();
        String sqlStatement = "SELECT * FROM Pelicula WHERE isAlquilada = false";  // Solo las que no estén alquiladas

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sqlStatement);
             ResultSet dataSet = statement.executeQuery()) {

            while (dataSet.next()) {

                int id = dataSet.getInt(1);
                String titulo = dataSet.getString(2);
                int generoId = dataSet.getInt(3);
                long fechaRegistro = dataSet.getLong(4);

            }

        } catch (Exception e) {
            System.out.println("Error al obtener las películas: " + e.getMessage());
        }
        return peliculaList;
    }
    public int eliminarClienteConAlquileres(int idCliente) {
        int response = -1;
        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = SQLDataBaseManager.getConnection();

            connection.setAutoCommit(false);

            // Eliminar los alquileres asociados al cliente
            String deleteAlquileresSql = "DELETE FROM Alquileres WHERE cliente_id = ?";
            statement = connection.prepareStatement(deleteAlquileresSql);
            statement.setInt(1, idCliente);
            statement.executeUpdate();

            // Luego, eliminar el cliente
            String deleteClienteSql = "DELETE FROM Cliente WHERE id = ?";
            statement = connection.prepareStatement(deleteClienteSql);
            statement.setInt(1, idCliente);
            int rowsAffected = statement.executeUpdate();

            // Si se eliminó el cliente correctamente, confirmar la transacción
            if (rowsAffected > 0) {
                connection.commit();
                response = 1;
            } else {
                connection.rollback();
                response = 0;
            }

        } catch (Exception e) {

            if (connection != null) {
                try {
                    connection.rollback();  // Revertir la transacción
                } catch (SQLException ex) {
                    System.out.println("Error al hacer rollback: " + ex.getMessage());
                }
            }
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }

        return response;
    }

    public int eliminarPelicula(int idPelicula) {
        int response = -1;
        // Eliminar alquileres
        String deleteAlquilerSql = "DELETE FROM Alquileres WHERE pelicula_id = ?";
        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(deleteAlquilerSql)) {

            statement.setInt(1, idPelicula);
            statement.executeUpdate();

            // Eliminar la película
            String deletePeliculaSql = "DELETE FROM Pelicula WHERE id = ?";
            try (PreparedStatement statement2 = connection.prepareStatement(deletePeliculaSql)) {
                statement2.setInt(1, idPelicula);
                int rowsAffected = statement2.executeUpdate();

                if (rowsAffected > 0) {
                    response = 1;
                } else {
                    response = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }
    public int eliminarVideojuego(int idVideojuego) {
        int response = -1;
        // Eliminar alquileres relacionados con el videojuego
        String deleteAlquilerSql = "DELETE FROM Alquileres WHERE videojuego_id = ?";
        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(deleteAlquilerSql)) {

            statement.setInt(1, idVideojuego);
            statement.executeUpdate();

            // Eliminar el videojuego
            String deleteVideojuegoSql = "DELETE FROM Videojuego WHERE id = ?";
            try (PreparedStatement statement2 = connection.prepareStatement(deleteVideojuegoSql)) {
                statement2.setInt(1, idVideojuego);
                int rowsAffected = statement2.executeUpdate();

                if (rowsAffected > 0) {
                    response = 1;
                } else {
                    response = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }



}

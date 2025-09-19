package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Atualiza {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/curso";
        String usuario = "postgres";
        String senha = "postgres";

        String sql = "UPDATE estudante SET nome = ? WHERE estudante_id = ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            System.out.println("Conex�o realizada com sucesso!");

            stmt.setString(1, "carlos");
            stmt.setInt(2,3);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro na opera��o com o banco de dados!");
            System.out.println("Detalhes: " + e.getMessage());
        }
    }
}

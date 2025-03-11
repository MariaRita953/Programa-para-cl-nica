/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ary
 */
public class DeletDAO {
    public static void excluirPaciente(int id) {
        String sql = "DELETE FROM pacientes WHERE id = ?";

        try (Connection con = ConnectionFactory.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum paciente encontrado com esse ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao excluir paciente: " + e.getMessage());
        }
    }
}

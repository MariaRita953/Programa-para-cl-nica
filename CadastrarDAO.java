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
public class CadastrarDAO {
     public static void cadastrarPaciente(String nome, String telefone, String sintoma, String endereco) {
        String sql = "INSERT INTO pacientes (nome, telefone, sintoma, endereco) VALUES (?, ?, ?, ?)";

        try (Connection con = ConnectionFactory.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, sintoma);
            stmt.setString(4, endereco);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro do paciente realizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente: " + e.getMessage());
        }
    } 
}

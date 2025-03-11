/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ary
 */
public class TabelaDTO {
     public static void preencherTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        
        String sql = "SELECT id, nome, telefone, sintoma, endereco FROM pacientes";
        try (Connection con = ConnectionFactory.conectar();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Object[] linha = {
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("sintoma"),
                    rs.getString("endereco")
                };
                modelo.addRow(linha);
            }   
            
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
}

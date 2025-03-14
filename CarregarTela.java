/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

/**
 *
 * @author maria
 */
public class CarregarTela {
    public static void main(String[] args) {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        ConnectionFactory.conectar();
    }
}

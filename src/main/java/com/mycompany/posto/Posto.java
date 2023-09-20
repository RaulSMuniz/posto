package com.mycompany.posto;
import javax.swing.JOptionPane;

public class Posto {

    public static void main(String[] args) {
        Posto2 p = new Posto2();
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(""
        + "=-=-=-=- Menu -=-=-=-= \n"
        + "1. Álcool \n"
        + "2. Gasolina \n"
        + "Escolha uma opção."));
        if (opcao == 1){
            p.litro = Double.parseDouble(JOptionPane.showInputDialog ("Quantos litros de álcool você deseja?"));
            
            JOptionPane.showMessageDialog(null, "Valor a ser pago: " + p.al());   
        }
        else if (opcao == 2){
            p.litro = Double.parseDouble(JOptionPane.showInputDialog ("Quantos litros de gasolina você deseja?"));
            JOptionPane.showMessageDialog(null, "Valor a ser pago: " + p.gas());
            }
        }
    }


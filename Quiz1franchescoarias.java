/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz1franchescoarias;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Quiz1franchescoarias {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));

        if (salario >= 3000000) {
            double sem = salario * 0.0925;
            double ivm = salario * 0.0508;
            double impuesto = salario - 0.20 * 0.2;
            double asoEmpleado = salario * 0.025;
            double salarioTotal= salario-277500-152400-125400-75000;
            JOptionPane.showMessageDialog(null, "Su nombre es "+ nombre);
            JOptionPane.showMessageDialog(null, "Su apellido es "+ apellido);
            JOptionPane.showMessageDialog(null, "Su salario es "+ salario);
            JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS por el concepto de SEM"+ sem);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el concepto de ivm"+ ivm);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el \nconcepto de impuesto de salario"+ impuesto);
            JOptionPane.showMessageDialog(null, "Su salario total es "+ salarioTotal);
        } else if (salario >= 1550000) {
            double sem = salario * 0.0925;
            double ivm = salario * 0.0508;
            double impuesto = salario - 0.20 * 0.15;
            double asoEmpleado = salario * 0.025;
            double salarioTotal= salario-500000-138750-76200-22200-37500;
            JOptionPane.showMessageDialog(null, "Su nombre es "+ nombre);
            JOptionPane.showMessageDialog(null, "Su apellido es "+ apellido);
            JOptionPane.showMessageDialog(null, "Su salario es "+ salario);
            JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS por el concepto de SEM"+ sem);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el concepto de ivm"+ ivm);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el \nconcepto de impuesto de salario"+ impuesto);
            JOptionPane.showMessageDialog(null, "Su salario total es "+ salarioTotal);
        } else if (salario >= 1000000) {
            double sem = salario * 0.0925;
            double ivm = salario * 0.0508;
            double impuesto = salario - 0.20 * 0.1;
            double asoEmpleado = salario * 0.025;
            double salarioTotal = salario-000000-92500-50800-7800-37500;
            JOptionPane.showMessageDialog(null, "Su nombre es "+ nombre);
            JOptionPane.showMessageDialog(null, "Su apellido es "+ apellido);
            JOptionPane.showMessageDialog(null, "Su salario es "+ salario);
            JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS por el concepto de SEM"+ sem);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el concepto de ivm"+ ivm);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el \nconcepto de impuesto de salario"+ impuesto);
            JOptionPane.showMessageDialog(null, "Su salario total es "+ salarioTotal);
        } else if (salario >= 300000) {
            double sem = salario * 0.0925;
            double ivm = salario * 0.0508;
            double impuesto = salario - 0 * 0;
            double asoEmpleado = salario * 0.025;
            double salarioTotal = salario-27750-15240-0-7500;
            JOptionPane.showMessageDialog(null, "Su nombre es "+ nombre);
            JOptionPane.showMessageDialog(null, "Su apellido es "+ apellido);
            JOptionPane.showMessageDialog(null, "Su salario es "+ salario);
            JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS por el concepto de SEM"+ sem);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el concepto de ivm"+ ivm);
            JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS por el \nconcepto de impuesto de salario"+ impuesto);
            JOptionPane.showMessageDialog(null, "Su salario total es "+ salarioTotal);
        } 
            


            

        
        
 
        

    }
}

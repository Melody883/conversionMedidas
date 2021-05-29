/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofisica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kolau
 */
public class conversionMedidas {
    public void conversionMedidas(){
        System.out.println("Este es la Conversión de Medidas");
        Scanner Menu;
        Scanner menu = new Scanner(System.in);
        int opc;
        String mensaje; {
        double pulgadas, metros, kilometros, centimetros, pies, millas, kilogramo, gramo, libra, onza, segundos, minutos, horas, dias, años;

        opc = Integer.parseInt("Ingrese la opción qe desea: \n1.- Metros a kilometros \n2.- Metros a millas \n3.- Kilometros a millas "
                + "\n4.- Kilometros a metros \n5.- Pies a pulgadas \n6.- Pulgadas a centimetros \n7. - Kilogramo a gramo \n8. Kilogramo a libra "
                + "\n9 Gramo a libra \n10. Gramo a onza \n11. Libra a onza \n12. Libra a gramo \n13. Onza a Kilogramo \n14. Onza a gramos"
                + "\n15. Segundos a minutos \n16. Minutos a horas \n17. Segundos a dias \n18. Minutos a años \n19. Horas a dias \n20. Horas a años");
        int op = menu.nextInt();

        switch (op) {
            case 1:
                metros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en metros: "));
                kilometros = metros * 0.001;
                mensaje = (metros + "Metros equivalen a " + kilometros + " kilometros");
                break;
            case 2:
                metros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en metros: "));
                millas = metros * 0.000621371;
                mensaje = (metros + "Metros equivalen a " + millas + " millas");
                break;
            case 3:
                kilometros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en kilometros: "));
                millas = kilometros * 0.621371;
                mensaje = (kilometros + "Kilometros equivalen a " + millas + " millas");
                break;
            case 4:
                kilometros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en kilometros: "));
                metros = kilometros * 1000;
                mensaje = (kilometros + "Kilometros equivales a " + metros + " metros");
                break;
            case 5:
                pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en pies: "));
                pulgadas = pies * 12;
                mensaje = (pies + "Pies equivalen a " + pulgadas + " pulgadas");
                break;
            case 6:
                pulgadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en pulgadas: "));
                centimetros = pulgadas * 2.54;
                mensaje = (pulgadas + "Pulgadas equivalen a " + centimetros + " centimetros");
                break;
            case 7:
                kilogramo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en kilogramos: "));
                gramo = kilogramo * 1000;
                mensaje = (kilogramo + "Kilogramos equivalen a " + gramo + " gramo");
                break;
            case 8:
                kilogramo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en kilogramo: "));
                libra = kilogramo * 2.205;
                mensaje = (kilogramo + "Kilogramo equivalen a " + libra + " centimetros");
                break;
            case 9:
                gramo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en gramo: "));
                libra = gramo * 0.0022;
                mensaje = (gramo + "Gramos equivalen a " + libra + " libra");
                break;
            case 10:
                gramo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en gramo: "));
                onza = gramo * 0.0353;
                mensaje = (gramo + "Gramo equivalen a " + onza + " onza");
                break;
            case 11:
                libra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en libra: "));
                onza = libra * 16;
                mensaje = (libra + "Libra equivalen a " + onza + " onza");
                break;
            case 12:
                libra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en libra: "));
                gramo = libra * 453.5921;
                mensaje = (libra + "Libras equivalen a " + gramo + " gramo");
                break;
            case 13:
                onza = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en onza: "));
                kilogramo = onza * 0.0283;
                mensaje = (onza + "Pulgadas equivalen a " + kilogramo + " kilogramo");
                break;
            case 14:
                onza = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en onza: "));
                gramo = onza * 28.3495;
                mensaje = (onza + "Onza equivalen a " + gramo + " gramo");
                break;
            case 15:
                segundos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en segundos: "));
                minutos = segundos * 0.0167;
                mensaje = (segundos + "Segundos equivalen a " + minutos + " minutos");
                break;
            case 16:
                minutos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en horas: "));
                horas = minutos * 0.0167;
                mensaje = (minutos + "Minutoss equivalen a " + horas + " horass");
                break;
            case 17:
                segundos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en segundos: "));
                horas = segundos * 0.000278;
                mensaje = (segundos + "Pulgadas equivalen a " + horas + " horas");
                break;
            case 18:
                minutos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en minutos: "));
                años = minutos * 1.903;
                mensaje = (minutos + "Minutos equivalen a " + años + " años");
                break;
            case 19:
                horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en horas: "));
                dias = horas * 0.0417;
                mensaje = (horas + "Horas equivalen a " + dias + " diass");
                break;
            case 20:
                horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en horas: "));
                años = horas * 0.000114;
                mensaje = (horas + "Pulgadas equivalen a " + años + " años");
                break;
            default:
                mensaje = ("La opción seleccionada es invalida.");
                break;

        }
        JOptionPane.showConfirmDialog(null, mensaje);
    }
}}

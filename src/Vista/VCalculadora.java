package Vista;

import Controlador.ControllerOperaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VCalculadora extends JFrame {

    public JPanel panel1;
    String num1;
    String num2;
    String simbolo;
    Float resultado;
    public ControllerOperaciones controller;
    public VCalculadora() {
        setSize(350,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        componentes();
        this.setVisible(true);
        controller = ControllerOperaciones.getInstances();

    }

    private void componentes(){
        paneles();
        botones();
    }

    private void paneles(){
        panel1 = new JPanel();
        panel1.setBackground(Color.gray);;
        panel1.setLayout(null);
        add(panel1);
    }

    private void botones(){
        TextField pantalla = new TextField();
        pantalla.setBounds(20, 15, 300, 40);
        Font fuente = new Font("Serif", Font.BOLD,25);
        pantalla.setFont(fuente);

        pantalla.setEditable(false);
        panel1.add(pantalla);


        JButton boton1 = new JButton("7");
        panel1.add(boton1);
        boton1.setBounds(20, 100, 75, 30);
        JButton boton2 = new JButton("8");
        panel1.add(boton2);
        boton2.setBounds(100, 100, 75, 30);
        JButton boton3 = new JButton("9");
        panel1.add(boton3);
        boton3.setBounds(180, 100, 75, 30);
        JButton boton4 = new JButton("4");
        panel1.add(boton4);
        boton4.setBounds(20, 150, 75, 30);
        JButton boton5 = new JButton("5");
        panel1.add(boton5);
        boton5.setBounds(100, 150, 75, 30);
        JButton boton6 = new JButton("6");
        panel1.add(boton6);
        boton6.setBounds(180, 150, 75, 30);
        JButton boton7 = new JButton("1");
        panel1.add(boton7);
        boton7.setBounds(20, 200, 75, 30);
        JButton boton8 = new JButton("2");
        panel1.add(boton8);
        boton8.setBounds(100, 200, 75, 30);
        JButton boton9 = new JButton("3");
        panel1.add(boton9);
        boton9.setBounds(180, 200, 75, 30);
        JButton boton0 = new JButton("0");
        panel1.add(boton0);
        boton0.setBounds(100, 250, 75, 30);
        JButton suma = new JButton("+");
        panel1.add(suma);
        suma.setBounds(250, 100, 75, 30);
        JButton resta = new JButton("-");
        panel1.add(resta);
        resta.setBounds(250, 150, 75, 30);
        JButton multiplicar = new JButton("x");
        panel1.add(multiplicar);
        multiplicar.setBounds(250, 200, 75, 30);
        JButton dividir = new JButton("÷");
        panel1.add(dividir);
        dividir.setBounds(250, 62, 75, 30);
        JButton igual = new JButton("=");
        panel1.add(igual);
        igual.setBounds(250, 250, 75, 30);


        suma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = num1;
                num1 = "";
                pantalla.setText(pantalla.getText()+suma.getText());
                simbolo = suma.getText();
                resultado = null;
            }
        });
        resta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = num1;
                num1 = "";
                pantalla.setText(pantalla.getText()+resta.getText());
                simbolo = resta.getText();
                resultado = null;
            }
        });
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = num1;
                num1 = "";
                pantalla.setText(pantalla.getText()+multiplicar.getText());
                simbolo = multiplicar.getText();
                resultado = null;
            }
        });
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = num1;
                num1 = "";
                pantalla.setText(pantalla.getText()+dividir.getText());
                simbolo = dividir.getText();
                resultado = null;
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (simbolo=="+"){
                    resultado = controller.sumar(Float.parseFloat(num2),Float.parseFloat(num1));
                    pantalla.setText(String.valueOf(resultado));
                    num1 = String.valueOf(resultado);

                } else if (simbolo.equalsIgnoreCase("-")) {
                    resultado = controller.resta(Float.parseFloat(num2),Float.parseFloat(num1));
                    pantalla.setText(String.valueOf(resultado));
                    num1 = String.valueOf(resultado);

                } else if (simbolo.equalsIgnoreCase("x")) {
                    resultado = controller.multiplicar(Float.parseFloat(num2),Float.parseFloat(num1));
                    pantalla.setText(String.valueOf(resultado));
                    num1 = String.valueOf(resultado);

                } else if (simbolo.equalsIgnoreCase("÷")) {
                    Float division = controller.dividir(Float.parseFloat(num2),Float.parseFloat(num1));
                    pantalla.setText(String.valueOf(division));
                    num1 = String.valueOf(resultado);

                }


            }
        });
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num2 = null;
                    num1 = null;
                    resultado = null;
                }
                if (num1 == null) {
                    num1 = boton0.getText();
                    pantalla.setText(num1);
                } else {
                    num1 = num1 + boton0.getText();
                    pantalla.setText(pantalla.getText()+boton0.getText());
                }
            }
        });

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}

                if (num1 == null) {
                    num1 = boton1.getText();
                    pantalla.setText(num1);
                } else {
                    num1 = num1 + boton1.getText();
                    pantalla.setText(pantalla.getText()+boton1.getText());
                }
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}
                if (num1 == null){
                    num1 = boton2.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton2.getText();
                    pantalla.setText(pantalla.getText()+boton2.getText());
                }
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}
                if (num1 == null){
                    num1 = boton3.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton3.getText();
                    pantalla.setText(pantalla.getText()+boton3.getText());
                }
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}
                if (num1 == null){
                    num1 = boton4.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton4.getText();
                    pantalla.setText(pantalla.getText()+boton4.getText());
                }
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}
                if (num1 == null){
                    num1 = boton5.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton5.getText();
                    pantalla.setText(pantalla.getText()+boton5.getText());
                }
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}
                if (num1 == null){
                    num1 = boton6.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton6.getText();
                    pantalla.setText(pantalla.getText()+boton6.getText());
                }
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}
                if (num1 == null){
                    num1 = boton7.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton7.getText();
                    pantalla.setText(pantalla.getText()+boton7.getText());
                }
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;}
                if (num1 == null){
                    num1 = boton8.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton8.getText();
                    pantalla.setText(pantalla.getText()+boton8.getText());
                }
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultado != null){
                    num1 = null;
                    num2 = null;
                    resultado = null;
                }
                if (num1 == null){
                    num1 = boton9.getText();
                    pantalla.setText(num1);
                }
                else{
                    num1 = num1 + boton9.getText();
                    pantalla.setText(pantalla.getText()+boton9.getText());
                }
            }
        });



    }

}

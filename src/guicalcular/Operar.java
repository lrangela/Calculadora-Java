/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package guicalcular;*/

/**
 *
 * @author luis
 */
import javax.swing.*;
import java.awt.event.*; 
import java.text.DecimalFormat;

public class Operar extends JFrame implements ActionListener {
    
    private JTextField operando1, operando2, resultado;
    private  JButton restar, sumar, multiplicar, dividir, cerrar;
    private JLabel titulo, texto1, texto2, result;
 
    public Operar(){
        
        super("Calculadora");
        setLayout(null);
        //text fields
        operando1 = new JTextField();
        operando1.setBounds(100, 100, 100, 20);
        add(operando1);
        operando2 = new JTextField();
        operando2.setBounds(100, 130, 100, 20);
        add(operando2);
        resultado = new JTextField();
        resultado.setBounds(100, 160, 100, 20);
        add(resultado);
        
        //buttons
        restar = new JButton("Restar");
        restar.setBounds(220, 100, 100, 50);
        add(restar);
        restar.addActionListener(this);
  
        sumar = new JButton("Sumar");
        sumar.setBounds(220, 160, 100, 50);
        add(sumar);
        sumar.addActionListener(this);
  
        multiplicar = new JButton("Multiplicar");
        multiplicar.setBounds(220, 220, 100, 50);
        add(multiplicar);
        multiplicar.addActionListener(this);
  
        dividir = new JButton("Dividir");
        dividir.setBounds(220, 280, 100, 50);
        add(dividir);
        dividir.addActionListener(this);
  
        cerrar = new JButton("Salir");
        cerrar.setBounds(100, 200, 100, 50);
        add(cerrar);
        cerrar.addActionListener(this);
  
        //labels
        titulo = new JLabel("Calculadora");
        titulo.setBounds(130, 40, 200, 30);
        add(titulo);
  
        texto1 = new JLabel("Primer Valor: ");
        texto1.setBounds(10, 95, 200, 30);
        add(texto1);
  
        texto2 = new JLabel("Segundo Valor: ");
        texto2.setBounds(10, 125, 200, 30);
        add(texto2);
  
        result = new JLabel("Resultado: ");
        result.setBounds(10, 155, 200, 30);
        add(result);
        
        
 }
    
    @Override 
    public void actionPerformed(ActionEvent e) {     
    
        if(e.getSource() == restar){
            String oper1=operando1.getText();
            String oper2=operando2.getText();
            double num1=Double.parseDouble(oper1);
            double num2=Double.parseDouble(oper2);
            double resul=num1-num2;
            String total=String.valueOf(resul);
            resultado.setText(total);
        }
  
        if(e.getSource() == sumar){
            String oper1=operando1.getText();
            String oper2=operando2.getText();
            double num1=Double.parseDouble(oper1);
            double num2=Double.parseDouble(oper2);
            double resul=num1+num2;
            String total=String.valueOf(resul);
            resultado.setText(total);
        }
  
        if(e.getSource() == multiplicar){
            String oper1=operando1.getText();
            String oper2=operando2.getText();
            double num1=Double.parseDouble(oper1);
            double num2=Double.parseDouble(oper2);
            double resul=num1*num2;
            String total=String.valueOf(resul);
            resultado.setText(total);
        }
  
        if(e.getSource() == dividir){
            String oper1=operando1.getText();
            String oper2=operando2.getText();
            double num1=Double.parseDouble(oper1);
            double num2=Double.parseDouble(oper2);
            double resul=num1/num2;
            DecimalFormat df = new DecimalFormat("#.0000");
            String total =String.valueOf(df.format(resul));
            
            resultado.setText(total);
        }  
  
        if(e.getSource() == cerrar){
            System.exit(0);
        }
 }
 
    public static void main(String[] ar){
        Operar ope = new Operar();
        ope.setBounds(10, 10, 400, 400);
        ope.setResizable(false);
        ope.setVisible(true);
        ope.setLocationRelativeTo(null);
        ope.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}


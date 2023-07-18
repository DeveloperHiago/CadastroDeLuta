package com.mycompany.cadlutador;
import javax.swing.JOptionPane;

/**
 *
 * @author Hiago
 */
public class CadLutador {
    
    public static void main(String[] args) {
        
 String nome = JOptionPane.showInputDialog("Digite seu nome");
 
 String alturass = JOptionPane.showInputDialog("Digite sua altura");
 double altura = Double.parseDouble(alturass);
 
  String pesoss = JOptionPane.showInputDialog("Digite seu peso");
  double peso = Double.parseDouble(pesoss);
 
 int vitoria = Integer.parseInt(JOptionPane.showInputDialog("Digite qt vitorias"));
 
 int derrota = Integer.parseInt(JOptionPane.showInputDialog("Digite qt derrotas"));
 
 String nomeD = JOptionPane.showInputDialog("Digite nome desafiante");
 
String alturasd = JOptionPane.showInputDialog("Digite altura desafiante");
double alturaD = Double.parseDouble(alturasd);
 
  String pesosd = JOptionPane.showInputDialog("Digite peso desafiante");
  double pesoD = Double.parseDouble(pesosd);
 
 int vitoriaD = Integer.parseInt(JOptionPane.showInputDialog("Digite qt vitorias desafiante"));
 
 int derrotaD = Integer.parseInt(JOptionPane.showInputDialog("Digite qt derrotas desafiante"));
 Lutador LutadorD = new Lutador(nomeD,alturaD,pesoD,vitoriaD,derrotaD);

 
 
 Lutador Lutador = new Lutador(nome,altura,peso,vitoria,derrota);
 
  
        Lutador.mostrar();
        LutadorD.mostrar();
        Luta Pancadaria = new Luta(nome, nomeD, vitoria, vitoriaD);
        Pancadaria.marcaLutar(Lutador, LutadorD);
        Pancadaria.lutar();
          
    }
}
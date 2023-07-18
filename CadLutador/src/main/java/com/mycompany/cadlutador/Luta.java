/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadlutador;


import java.util.Random;

/**
 *
 * @author Hiago
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private String meuNomes;
    private String meuNomed;
    private int vitoria;
    private int vitoriaD;

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getVitoriaD() {
        return vitoriaD;
    }

    public void setVitoriaD(int vitoriaD) {
        this.vitoriaD = vitoriaD;
        System.out.println("");
    }
    
    
    Luta(String nome1, String nomed, int vitoria, int vitoriaD) {
      this.meuNomes = nome1;
      this.meuNomed = nomed;
      this.vitoria = vitoria;
      this.vitoriaD = vitoriaD;
    }
 
    public String getMeuNomed() {
        return meuNomed;
    }

    public void setMeuNomed(String meuNomed) {
        this.meuNomed = meuNomed;
    }

    public String getMeuNomes() {
        return meuNomes;
    }

    public void setMeuNomes(String meuNome1) {
        this.meuNomes = meuNome1;
    }

    
    public void marcaLutar(Lutador l1, Lutador l2){
        if(l1.getMinhaCategoria().equals(l2.getMinhaCategoria()) && l1 != l2){
    this.aprovada = true;
    this.desafiado = l1;
    this.desafiante = l2;
        }else {
    this.aprovada = false;
    this.desafiado = null;
    this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("A luta vai acontecer");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
           
               if(vencedor == 0){
                    System.out.println("Empate");
            }
                   if(vencedor == 1){
                      this.vitoria++;
                     System.out.println("Desafiado ganhou "+ "," + "parabéns "+ this.meuNomes+" "+ " Agora vc conseguiu mais 1 vitoria"+ " "+this.vitoria);
                     
                   }
          
               if(vencedor == 2){
                   this.vitoriaD++;
                    System.out.println("Desafiante ganhou"+ "," + "parabéns "+ this.meuNomed+" "+ " Agora vc conseguiu mais 1 vitoria"+ " "+this.vitoriaD);
               }
            
        }else{
            System.out.println("Não vai ter luta entre: "+ this.meuNomes);
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    

}

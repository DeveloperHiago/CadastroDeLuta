package com.mycompany.cadlutador;

public class Lutador {
    private String meuNomes;
    private double meuAlturas;
    private double meuPesos;
    private int meuVitoriass;
    private int meuDerrotas;
    private String minhaCategoria;
    
    public Lutador(String meuNome1, double meuAltura1, double meuPeso1, int meuVitoria1, int meuDerrota1) {
        this.meuNomes = meuNome1;
        this.meuAlturas = meuAltura1;
        this.meuPesos = meuPeso1;
        this.meuVitoriass = meuVitoria1;
        this.meuDerrotas = meuDerrota1;
        setMinhaCategoria();
    }
    
    public String getMeuNome() {
        return meuNomes;
    }
    
    public void setMeuNome(String meuNome) {
        this.meuNomes = meuNome;
    }
    
    public double getMeuAltura() {
        return meuAlturas;
    }
    
    public void setMeuAltura(double meuAltura) {
        this.meuAlturas = meuAltura;
    }
    
    public double getMeuPeso() {
        return meuPesos;
    }
    
    public void setMeuPeso(double meuPeso) {
        this.meuPesos = meuPeso;
        setMinhaCategoria();
    }
    
    public int getMeuVitoria() {
        return meuVitoriass;
    }
    
    public void setMeuVitoria(int meuVitoria) {
        this.meuVitoriass = meuVitoria;
    }
    
    public int getMeuDerrota() {
        return meuDerrotas;
    }
    
    public void setMeuDerrota(int meuDerrota) {
        this.meuDerrotas = meuDerrota;
    }
    
    public String getMinhaCategoria() {
        return minhaCategoria;
    }
    
    public void setMinhaCategoria() {
        if (meuPesos < 30) {
            minhaCategoria = "Peso Pena";
        } else if (meuPesos >= 30 && meuPesos < 50) {
            minhaCategoria = "Peso Médio";
        } else {
            minhaCategoria = "Peso Pesado";
        }
    }
    
    public void mostrar() {
        System.out.println("Nome: " + meuNomes);
        System.out.println("Altura: " + meuAlturas);
        System.out.println("Peso: " + meuPesos);
        System.out.println("Categoria: " + minhaCategoria);
        System.out.println("Vitórias: " + meuVitoriass);
        System.out.println("Derrotas: " + meuDerrotas);
    }
}

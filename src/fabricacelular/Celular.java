package fabricacelular;

import java.util.ArrayList;

public class Celular {

    private String marca;
    private String modelo;
    private float tamanho;
    private int pxCamera;
    private Bateria bateria;
    private ArrayList<Programa> programas = new ArrayList<>();

    public Celular(String marca, Bateria bateria) {
        this.marca = marca;
        this.modelo = "Galaxy S22 Ultra";
        this.tamanho = 6.8f;
        this.pxCamera = 108;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getPxCamera() {
        return pxCamera;
    }

    public void setPxCamera(int pxCamera) {
        this.pxCamera = pxCamera;
    }

    public String getBateria() {
        return this.bateria.getMarca() +"-" + this.bateria.getModelo();
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Celular: " + "marca: " + marca + ", modelo: " + modelo + ", tamanho: " + tamanho + ", Pixels camera:" + pxCamera +'}';
    }
    
    public ArrayList<Programa> getPrograma(){
        return this.programas;
    }
    
    public void setPrograma(Programa programas){
        this.programas = programas;
    }

}

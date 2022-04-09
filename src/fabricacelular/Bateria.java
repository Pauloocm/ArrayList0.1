package fabricacelular;

public class Bateria {

    private String marca;
    private String modelo;
    private float voltagem;
    private int capacidade;
    private static int tamanho = 0;
    

    public Bateria(String marca, String modelo, int capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.voltagem = 4.2f;
        this.tamanho ++;
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

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public static int getTamanho() {
        return tamanho;
    }

    public static void setTamanho(int tamanho) {
        Bateria.tamanho = tamanho;
    }
    
    
}

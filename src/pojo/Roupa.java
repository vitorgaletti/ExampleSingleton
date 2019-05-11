
package pojo;

public class Roupa {

    private String descricao;
    private String marca;
    private String tamanho;
    private String cor;
    private int quantidade;
    
    public Roupa(String descricao, String marca, String tamanho, String cor, int quantidade) {
        this.descricao = descricao;
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
   
}

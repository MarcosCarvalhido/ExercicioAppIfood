public class Restaurante {
    protected String nome;
    protected String endereço;
    protected String categoria;

    public Restaurante(String nome, String endereço, String categoria){
        this.nome = nome;
        this.endereço = endereço;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

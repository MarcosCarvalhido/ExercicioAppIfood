public class Pratos {
    protected String nome;
    protected double preço;

    public Pratos(String nome, double preço){
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }
    public double getPreço() {
        return preço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
}

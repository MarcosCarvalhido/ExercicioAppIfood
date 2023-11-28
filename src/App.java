import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class App {
    private ArrayList<Restaurante> listaDeRestaurantes;

    public ArrayList<Restaurante> getRestaurantes() {
        return this.listaDeRestaurantes;
    }

    public App() {
        this.listaDeRestaurantes = new ArrayList<Restaurante>();
    }
    
    public static void main(String[] args) throws Exception {

        App ifood = new App();
        
        ifood.LerArquivo("ListaDeRestaurantes.txt");

        for (Restaurante r : ifood.getRestaurantes()) {
            System.out.println(r);
        }
        
    }
    public void LerArquivo(String arquivo) throws IOException{
        FileReader entrada = new FileReader("src/resources/" + arquivo);
        BufferedReader bufferedReader = new BufferedReader(entrada);

        String linha;
        boolean FIM = false;

        while (!FIM) {
            linha = bufferedReader.readLine();
            if (linha != null) {
                String[] palavras = linha.split(";");
                Restaurante restaurante = new Restaurante(palavras[0],palavras[1],palavras[2]);
                listaDeRestaurantes.add(restaurante);
            }
            else{
                FIM = true;
            }
        }
        entrada.close();
    }
    public void GravarArquivo(String nomeArquivo) throws IOException{
        FileWriter saida = new FileWriter("src/resources/" + nomeArquivo, Charset.forName("UTF8"));
        
        for (Restaurante restaurante : this.listaDeRestaurantes){
            saida.write(restaurante.toString()+"\n");
        }
        saida.close();
    }
}

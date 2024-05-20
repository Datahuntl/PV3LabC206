import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Arquivo {
    public void escrever (Jogo jogo)
    {
        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;
        String linha = null;
        double testlinha

        try
        {
            fluxoSaida = new FileOutputStream("C:\\Users\\welli\\OneDrive - Instituto Nacional de Telecomunicações\\Desktop\\Arquivo.txt", true);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            linha = jogo.getNome();
            bufferSaida.write(linha);
            bufferSaida.newLine();
            linha = jogo.getGenero();
            bufferSaida.write(linha);
            bufferSaida.newLine();

            try {
                jogo.precoJogo(jogo.getPreco());
                bufferSaida.write(jogo.getPreco());
                bufferSaida.newLine();
            } catch (PrecoNegativoZero e) {
                break;
            }

            bufferSaida.write(linha);
            bufferSaida.newLine();
        }
        catch(FileNotFoundException ex)
        {
            System.err.printf("FileNotFoundException: $s.$n", ex);
        }
        catch(IOException ex)
        {
            System.err.printf("IOException: $s.$n", ex);
        }
        finally
        {
            try
            {
                bufferSaida.close();
            }
            catch(IOException ex)
            {
            System.err.printf("IOException: $s.$n", ex);
            }
        }
    }

    public void ler ()
    {
        InputStream fluxoEntrada = null;
        InputStreamReader leitorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;
        String linha = null;

        try 
        {
            fluxoEntrada = new FileInputStream("C:\\Users\\welli\\OneDrive - Instituto Nacional de Telecomunicações\\Desktop\\Arquivo.txt");
            leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(leitorFluxoEntrada);
            linha = bufferEntrada.readLine();
            while(linha != null)
            {
                System.out.println(linha);
                linha = bufferEntrada.readLine();
            }
        }
        catch(FileNotFoundException ex)
        {
            System.err.printf("FileNotFoundException: $s.$n", ex);
        }
        catch(IOException ex)
        {
            System.err.printf("IOException: $s.$n", ex);
        }
        finally
        {
            try
            {
                bufferEntrada.close();
            }
            catch(IOException ex)
            {
            System.err.printf("IOException: $s.$n", ex);
            }
        }
    }
}

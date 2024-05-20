import java.util.Scanner;

public class Jogo{
    
    private String Nome;
    private double Preco;
    private String Genero;

    public Jogo
    {
        
    }

    public void precoJogo(double preco) throws PrecoNegativoZero{

        if(preco <= 0)
        {
            throw new PrecoNegativoZero("Preço Menor ou Igual a Zero Definido para o Jogo");
        }

    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public double getPreco()
    {
        return Preco;
    }

    public void setPreco(double preco)
    {
        Preco = preco;
    }

    public String getGenero()
    {
        return Genero;
    }

    public void setGenero(String genero)
    {
        Genero = genero;
    }
}
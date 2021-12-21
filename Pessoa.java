import java.io.*;
import java.util.Scanner;

public class Pessoa{ 
    private String nome;
    private String pai;
    private String mae;

    public Pessoa(String n, String m, String p){ //construtor
        this.nome = n;
        this.pai = p;
        this.mae = m; 
    }

    public Pessoa(String n){
        this.nome = n;
    }

    //
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    //
    public String getPai() {
        return this.pai;
    }
    public void setPai(String p) {
        this.pai = p;
    }

    //
    public String getMae() {
        return this.mae;
    }
    public void setMae(String m) {
        this.mae = m;
    }


    public void Irmaos(Pessoa x) {
		if(this.pai == x.pai || this.mae == x.mae){
			System.out.println("São irmãos!");
		} else {
			System.out.println("Não são irmãos!");
		}
	}

    public void Antecessor(Pessoa x) {
		if(x.nome == this.pai || x.nome == this.mae) {
			System.out.println("Essas pessoas são parentes");
		} else {
			System.out.println("Não são parentes!");
		}
	}
	
    public static void main(String args[]) throws IOException {
        Pessoa obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        String a = leitura.readLine(); //nome
        String b = leitura.readLine(); //pai
        String c = leitura.readLine(); //mae

        leitura.close();
        ler.close();
    }

}

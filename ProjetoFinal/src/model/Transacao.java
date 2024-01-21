package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* Esta classe representa uma ou várias transações de uma pessoa, sejam elas receitas ou despesas
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class Transacao {

    private double saldo;
    private double valorTransacao;
    private LocalDate dataTransacao;
    private List<Receita> receitas = new ArrayList<>();
    private List<Despesa> despesas = new ArrayList<>();
    private List<Transacao> extrato = new ArrayList<>();
    private boolean verificarInclusao = false;  //feita para poder utilizar os métodos incluirReceita e Despesa sem duplicar os dados
    
    /**
    * O construtor deverá estabelecer que está sendo criado uma transação sem passar nenhum parâmetro
    */
    public Transacao(){}
    
    /**
    * O construtor deverá estabelecer que está sendo criado uma transação com o valor e a data passados pelo usuário
    */
    public Transacao(double valorTransacao, LocalDate dataTransacao) {
        setValorTransacao(valorTransacao);
        setDataTransacao(dataTransacao);
    }
    
    /**
    * Método responsável por processar o arquivo csv com os dados das receitas e despesas de alguma pessoa
    */
    public void processarArquivo() {
        
        try{    //o caminho precisa ser alterado pelo usuário antes de utilizar o programa
            Scanner arqTexto = new Scanner(new File("C:\\PF_Dados.csv"), "UTF-8");
        
            arqTexto.nextLine(); //pula o cabeçalho

            while (arqTexto.hasNext()) {
                //RECEITA;1000;2023-11-23;Salário
                String dados[] = arqTexto.nextLine().split(";");

                String especieTransacao = dados[0];
                Double valor = Double.parseDouble(dados[1]);
                LocalDate data = LocalDate.parse(dados[2]);
                String tipo = dados[3];

                if(especieTransacao.equals("RECEITA"))
                    incluirReceita(new Receita(valor, data, TipoReceita.valueOf(tipo)));
                else
                    incluirDespesa(new Despesa(valor, data, TipoDespesa.valueOf(tipo)));
            }

            arqTexto.close();

            verificarInclusao = true;
            
        }catch(IOException e){
            System.out.println("Não foi possível encontrar o arquivo");
        }
    }
    
    /**
    * Método responsável por fazer a adição de uma receita
    * @param receita passada pelo usuário através da interface gráfica
    */
    public void incluirReceita(Receita receita) {
        
        getReceitas().add(receita); //adiciona no ArrayList de receitas

        setSaldo(getSaldo() + receita.getValorTransacao()); //atualiza a variável saldo

        getExtrato().add(receita); //adiciona no ArrayList do extrato
            
        try{
            if(verificarInclusao){  //adiciona a receita no arquivo caso o método processarArquivo() já tenha sido instanciado
                File arquivo = new File("C:\\PF_Dados.csv");

                try(FileOutputStream fos = new FileOutputStream(arquivo, true);
                    PrintWriter arquivoTexto = new PrintWriter(fos)){

                    arquivoTexto.print("RECEITA;");
                    arquivoTexto.print(receita.getValorTransacao() + ";");
                    arquivoTexto.print(receita.getDataTransacao() + ";");
                    arquivoTexto.println(receita.getTipoReceita());
                }
            }
        }catch(IOException ex){
            System.out.println("Não foi possível encontrar o arquivo");
        }
    }

    /**
    * Método responsável por fazer a adição de uma despesa
    * @param despesa passada pelo usuário através da interface gráfica
    */
    public void incluirDespesa(Despesa despesa){

        getDespesas().add(despesa); //adiciona no ArrayList de despesas

        setSaldo(getSaldo() - despesa.getValorTransacao()); //atualiza a variável saldo

        getExtrato().add(despesa);  //adiciona no ArrayList do extrato
        
        try{
            if(verificarInclusao){  //adiciona a receita no arquivo caso o método processarArquivo() já tenha sido instanciado
                File arquivo = new File("C:\\PF_Dados.csv");

                try(FileOutputStream fos = new FileOutputStream(arquivo, true);
                    PrintWriter arquivoTexto = new PrintWriter(fos)){

                    arquivoTexto.print("DESPESA;");
                    arquivoTexto.print(despesa.getValorTransacao() + ";");
                    arquivoTexto.print(despesa.getDataTransacao() + ";");
                    arquivoTexto.println(despesa.getTipoDespesa());
                }
            }
        }catch(IOException ex){
            System.out.println("Não foi possível encontrar o arquivo");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
    
    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public List<Transacao> getExtrato() {
        return extrato;
    }

    public void setExtrato(List<Transacao> extrato) {
        this.extrato = extrato;
    }
}
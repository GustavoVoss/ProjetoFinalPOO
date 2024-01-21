package model;

import java.time.LocalDate;

/**
* Esta classe representa uma receita de uma pessoa
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class Receita extends Transacao{

    private TipoReceita tipoReceita;

    /**
    * O construtor deverá estabelecer que está sendo criado uma receita com os parâmetros 
    * valorReceita, dataReceita e tipoReceita passados pelo usuário
    */
    public Receita(double valorReceita, LocalDate dataReceita, TipoReceita tipoReceita) {
        super(valorReceita, dataReceita);
        setTipoReceita(tipoReceita);
    }
    
    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }
    
    public void setTipoReceita(TipoReceita tipoReceita) {
        this.tipoReceita = tipoReceita;
    }
}
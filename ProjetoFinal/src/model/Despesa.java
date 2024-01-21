package model;

import java.time.LocalDate;

/**
* Esta classe representa uma despesa de uma pessoa
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class Despesa extends Transacao{
    
    private TipoDespesa tipoDespesa;

    /**
    * O construtor deverá estabelecer que está sendo criado uma despesa com os parâmetros 
    * valorDespesa, dataDespesa e tipoDespesa passados pelo usuário
    */
    public Despesa(double valorDespesa, LocalDate dataDespesa, TipoDespesa tipoDespesa) {
        super(valorDespesa, dataDespesa);
        setTipoDespesa(tipoDespesa);
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
}
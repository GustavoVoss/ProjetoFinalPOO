package model;

import java.util.Comparator;

/**
* Esta classe ordena as transações pela data de maneira crescente
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class OrdenacaoPorData implements Comparator<Transacao>{

    /**
    * Método responsável por ordenar transações através da data de maneira crescente
    * @return retorna o tempo de estadia do veículo
    */
    @Override
    public int compare(Transacao t1, Transacao t2) {
        
            return t1.getDataTransacao().compareTo(t2.getDataTransacao());
    }
}
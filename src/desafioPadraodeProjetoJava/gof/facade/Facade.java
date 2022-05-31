package desafioPadraodeProjetoJava.gof.facade;

import desafioPadraodeProjetoJava.gof.subsistema1.CrmService;
import desafioPadraodeProjetoJava.gof.subsistema2.CepApi;



    public class Facade {
        public void migrarCliente(String nome, String cep) {
            String cidade = CepApi.getInstancia().recuperarCidade(cep);
            String estado = CepApi.getInstancia().recuperarEstado(cep);

            CrmService.gravarCliente(nome, cep, cidade, estado);


        }
    }
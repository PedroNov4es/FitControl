package service;

import model.Frequencia;

import java.util.List;

/**
 * Serviço de frequência.
 */
public class FrequenciaService
        implements Relatorio {

    /**
     * Conta total de visitas.
     */
    public int totalVisitas(
            List<Frequencia> frequencias
    ) {

        return frequencias.size();
    }

    @Override
    public void gerarRelatorio() {

        System.out.println(
                "Relatório de frequência gerado"
        );
    }
}
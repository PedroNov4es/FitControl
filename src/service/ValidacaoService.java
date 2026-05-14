package service;

import exception.PlanoVencidoException;
import model.Plano;

import java.time.LocalDate;

/**
 * Classe responsável pelas validações.
 */
public class ValidacaoService {

    /**
     * Verifica se um plano está vencido.
     *
     * @param dataMatricula data de matrícula
     * @param plano plano do aluno
     * @throws PlanoVencidoException exceção de plano vencido
     */
    public void validarPlano(
            LocalDate dataMatricula,
            Plano plano
    ) throws PlanoVencidoException {

        LocalDate vencimento =
                dataMatricula.plusMonths(
                        plano.getDuracaoMeses()
                );

        if (
                LocalDate.now()
                        .isAfter(vencimento)
        ) {

            throw new PlanoVencidoException(
                    "Plano vencido em: "
                            + vencimento
            );
        }
    }
}
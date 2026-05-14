package service;
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

    /**
     * Verifica capacidade da aula.
     */
    public void validarCapacidade(
            int inscritos,
            Aula aula
    ) throws AulaLotadaException {

        if (
                inscritos >=
                        aula.getCapacidadeMaxima()
        ) {

            throw new AulaLotadaException(
                    "Aula lotada"
            );
        }
    }

    /**
     * Verifica conflito de horários.
     */
    public void validarHorario(
            Aula aula1,
            Aula aula2
    ) throws HorarioConflitanteException {

        if (
                aula1.getHorario()
                        .equals(aula2.getHorario())
        ) {

            throw new HorarioConflitanteException(
                    "Conflito de horários"
            );
        }
    }

    @Override
    public void gerarRelatorio() {

        System.out.println(
                "Relatório de aulas gerado"
        );
    }
}
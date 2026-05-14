package exception;

/**
 * Exceção para conflito de horário.
 */
public class HorarioConflitanteException extends Exception {

    public HorarioConflitanteException(String mensagem) {

        super(mensagem);
    }
}
    package dao;

/**
 * Interface genérica para operações CRUD.
 *
 * @param <T> tipo da entidade
 */
public interface GenericDAO<T> {

    void inserir(T entidade);

    void atualizar(T entidade);

    void deletar(int id);
}
package soda.stashed.Database;

import java.util.List;

import soda.stashed.Entities.ActionStatus;

public interface IDatabase<T> {
    ActionStatus Insert(T entity);
    ActionStatus Update(T entity);
    ActionStatus Delete(T entity);
    ActionStatus Restore(T entity);
    List<T> Search(String searchPhrase);
    T Get(int id);
}

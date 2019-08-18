package soda.stashed.Repository.interfaces;

import android.drm.DrmStore;

import java.util.List;

import soda.stashed.Entities.ActionStatus;

public interface IRepository<T> {

    T Get(int id);
    List<T> Search(String searchPhrase, boolean isDeleted);
     ActionStatus Save(T entity);

     ActionStatus Insert(T entity);

     ActionStatus Validate(T entity);

     ActionStatus Update(T entity);

     ActionStatus Delete(T entity);

     ActionStatus Restore(T entity);


     ActionStatus Commit();

}

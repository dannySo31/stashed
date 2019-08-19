package soda.stashed.Repository.interfaces;

import androidx.core.view.inputmethod.InputConnectionCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import soda.stashed.Context.IDataContext;
import soda.stashed.Database.IDatabase;
import soda.stashed.Entities.ActionStatus;
import soda.stashed.Entities.CRUD_OPERATION;
import soda.stashed.Helpers.ContextHelper;

public abstract class BaseRepository<T> {
    protected Map<CRUD_OPERATION, List<T>> mapContext= new HashMap<>();
    protected IDataContext context;
    public BaseRepository(){
        this(ContextHelper.GetContext());

    }
    protected void register(CRUD_OPERATION operation, T entity){
        List<T> entitiesToOperate= mapContext.get(operation);
        if(entitiesToOperate==null)
            entitiesToOperate= new ArrayList<>();
        entitiesToOperate.add(entity);
        mapContext.put(operation,entitiesToOperate);
    }

    protected ActionStatus commitInsert(IDatabase<T> db) {
        ActionStatus result= ActionStatus.Success("");
        List<T> entitiesToBeInserted = mapContext.get(CRUD_OPERATION.INSERT);
        for (T entity : entitiesToBeInserted) {

            result=db.Insert(entity);
            if(result.Success==false){
                return result;
            }
        }

        return result;
    }
    protected ActionStatus commitUpdate(IDatabase<T> db) {
        ActionStatus result= ActionStatus.Success("");
        List<T> modifiedEntities = mapContext.get(CRUD_OPERATION.UPDATE);
        for (T entity : modifiedEntities) {

            result= db.Update(entity);
            if(result.Success==false){
                return result;
            }
        }
        return result;
    }
    protected ActionStatus commitDelete(IDatabase<T> db) {
        ActionStatus result= ActionStatus.Success("");
        List<T> modifiedEntities = mapContext.get(CRUD_OPERATION.DELETE);
        for (T entity : modifiedEntities) {

            result= db.Delete(entity);
            if(result.Success==false){
                return result;
            }
        }
        return result;
    }
    protected ActionStatus commitRestore(IDatabase<T> db) {
        ActionStatus result= ActionStatus.Success("");
        List<T> modifiedEntities = mapContext.get(CRUD_OPERATION.RESTORE);
        for (T entity : modifiedEntities) {

            result= db.Restore(entity);
            if(result.Success==false){
                return result;
            }
        }
        return result;
    }

    protected ActionStatus Commit(IDatabase<T> db){
        ActionStatus result= ActionStatus.Success("");
        if (mapContext == null || mapContext.size() == 0) {
            return ActionStatus.Success("");
        }

        if (mapContext.containsKey(CRUD_OPERATION.INSERT)) {
            result=commitInsert(db);
            if(result.Success==false)
                return result;
        }
        if (mapContext.containsKey(CRUD_OPERATION.UPDATE)) {
            result=commitUpdate(db);
            if(result.Success==false)
                return result;
        }

        if (mapContext.containsKey(CRUD_OPERATION.DELETE)) {
            result=commitUpdate(db);
            if(result.Success==false)
                return result;
        }
        if (mapContext.containsKey(CRUD_OPERATION.RESTORE)) {
            result=commitRestore(db);
            if(result.Success==false)
                return result;
        }
        return result;
    }
    public BaseRepository(IDataContext context){
        this.context= context;
    }
}

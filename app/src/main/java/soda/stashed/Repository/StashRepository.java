package soda.stashed.Repository;

import java.util.List;

import soda.stashed.Entities.ActionStatus;
import soda.stashed.Entities.CRUD_OPERATION;
import soda.stashed.Entities.stash;
import soda.stashed.Repository.interfaces.BaseRepository;
import soda.stashed.Repository.interfaces.IStashRepository;

public class StashRepository extends BaseRepository<stash>
implements IStashRepository {
    @Override
    public stash Get(int id) {
        return context.Stashes().Get(id);
    }

    @Override
    public List<stash> Search(String searchPhrase, boolean isDeleted) {
        return context.Stashes().Search(searchPhrase,isDeleted);
    }

    @Override
    public ActionStatus Save(stash entity) {
        ActionStatus validateResult= Validate(entity);
        if(validateResult.Success==false)
            return ActionStatus.Failed(validateResult.Message);

        if(entity.getId()==0){
            return Insert(entity);
        }else{
            return Update(entity);
        }

    }

    @Override
    public ActionStatus Insert(stash entity) {
        register(CRUD_OPERATION.INSERT,entity);
        return ActionStatus.Success("");
    }

    @Override
    public ActionStatus Validate(stash entity) {
        return ActionStatus.Success("");
    }

    @Override
    public ActionStatus Update(stash entity) {
        register(CRUD_OPERATION.UPDATE,entity);
        return ActionStatus.Success("");
    }

    @Override
    public ActionStatus Delete(stash entity) {
        register(CRUD_OPERATION.DELETE,entity);
        return ActionStatus.Success("");
    }

    @Override
    public ActionStatus Restore(stash entity) {
        register(CRUD_OPERATION.RESTORE,entity);
        return ActionStatus.Success("");
    }

    @Override
    public ActionStatus Commit() {
       return Commit(context.Stashes());


    }
}

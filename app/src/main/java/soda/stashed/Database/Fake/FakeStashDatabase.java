package soda.stashed.Database.Fake;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import soda.stashed.Database.IStashDatabase;
import soda.stashed.Entities.ActionStatus;
import soda.stashed.Entities.stash;

public class FakeStashDatabase implements IStashDatabase {
    private List<stash> list= new ArrayList<stash>();


    public FakeStashDatabase(){
        for (int i=0; i<20;i++){
            stash stash= new stash();
            stash.setDeleted(false);
            stash.setId(i+1);
            stash.setName(String.format("Stash %s",i));
            list.add(stash);
        }


    }
    @Override
    public ActionStatus Insert(stash entity) {

                stash stash= new stash();
                stash.setName(entity.getName());
                stash.setId(list.size());
                stash.setDeleted(entity.isDeleted());
                return new ActionStatus(true,"Insert Success", stash.getId());

    }

    @Override
    public ActionStatus Update(stash entity) {
        for (stash stash:list) {
            if(stash.getId()==entity.getId()){
                stash.setName(entity.getName());
                stash.setId(entity.getId());
                stash.setDeleted(entity.isDeleted());
                return new ActionStatus(true,"Update Success", stash.getId());
            }
        }

        return ActionStatus.Failed("Operation Failed");
    }

    @Override
    public ActionStatus Delete(stash entity) {
        for (stash stash:list) {
            if(stash.getId()==entity.getId()){
                entity.setDeleted(true);
                return ActionStatus.Success("Delete succeeded");
            }
        }

        return ActionStatus.Failed("Delete failed");
    }

    @Override
    public ActionStatus Restore(stash entity) {
        for (stash stash:list) {
            if(stash.getId()==entity.getId()){
                entity.setDeleted(false);
                return ActionStatus.Success("Restore succeeded");
            }
        }

        return ActionStatus.Failed("Restored failed");
    }

    @Override
    public List<stash> Search(final String searchPhrase, boolean isDeleted) {
       List<stash> filteredList= new ArrayList<stash>();
        for (stash stash:list) {
            if(stash.getName().contains(searchPhrase)
            && stash.isDeleted()==isDeleted){
                filteredList.add(stash);
            }
        }
        return filteredList;
    }

    @Override
    public stash Get(int id) {
        for (stash stash:list) {
            if(stash.getId()==id){
                return stash;
            }
        }
        return null;
    }
}

package soda.stashed.Database.Fake;

import java.util.List;

import soda.stashed.Database.IStashItemDatabase;
import soda.stashed.Entities.ActionStatus;
import soda.stashed.Entities.StashItem;

public class FakeStashItemDatabase implements IStashItemDatabase {
    @Override
    public ActionStatus Insert(StashItem entity) {
        return null;
    }

    @Override
    public ActionStatus Update(StashItem entity) {
        return null;
    }

    @Override
    public ActionStatus Delete(StashItem entity) {
        return null;
    }

    @Override
    public ActionStatus Restore(StashItem entity) {
        return null;
    }

    @Override
    public List<StashItem> Search(String searchPhrase, boolean isDeleted) {
        return null;
    }

    @Override
    public StashItem Get(int id) {
        return null;
    }
}

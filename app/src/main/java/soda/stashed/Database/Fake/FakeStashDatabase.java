package soda.stashed.Database.Fake;

import java.util.List;

import soda.stashed.Database.IStashDatabase;
import soda.stashed.Entities.ActionStatus;
import soda.stashed.Entities.stash;

public class FakeStashDatabase implements IStashDatabase {
    @Override
    public ActionStatus Insert(stash entity) {
        return null;
    }

    @Override
    public ActionStatus Update(stash entity) {
        return null;
    }

    @Override
    public ActionStatus Delete(stash entity) {
        return null;
    }

    @Override
    public ActionStatus Restore(stash entity) {
        return null;
    }

    @Override
    public List<stash> Search(String searchPhrase) {
        return null;
    }

    @Override
    public stash Get(int id) {
        return null;
    }
}

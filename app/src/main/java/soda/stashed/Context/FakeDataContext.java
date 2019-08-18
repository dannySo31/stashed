package soda.stashed.Context;

import java.util.List;

import soda.stashed.Entities.Product;
import soda.stashed.Entities.StashItem;
import soda.stashed.Entities.stash;

public class FakeDataContext implements IDataContext{
    @Override
    public List<Product> GetProducts() {
        return null;
    }

    @Override
    public List<StashItem> GetStashItems() {
        return null;
    }

    @Override
    public List<stash> GetStashes() {
        return null;
    }
}

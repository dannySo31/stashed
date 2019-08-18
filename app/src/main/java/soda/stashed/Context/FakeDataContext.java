package soda.stashed.Context;

import java.util.List;

import soda.stashed.Database.Fake.FakeProductDatabase;
import soda.stashed.Database.Fake.FakeStashDatabase;
import soda.stashed.Database.Fake.FakeStashItemDatabase;
import soda.stashed.Database.IProductDatabase;
import soda.stashed.Database.IStashDatabase;
import soda.stashed.Database.IStashItemDatabase;
import soda.stashed.Entities.Product;
import soda.stashed.Entities.StashItem;
import soda.stashed.Entities.stash;

public class FakeDataContext implements IDataContext{
    IProductDatabase productsDatabase;
    IStashDatabase stashDatabase;
    IStashItemDatabase stashItemDatabase;
    @Override
    public IProductDatabase Products() {
        if(productsDatabase==null)
            productsDatabase= new FakeProductDatabase();
        return productsDatabase;
    }

    @Override
    public IStashItemDatabase StashItems() {
        if(stashItemDatabase==null)
            stashItemDatabase= new FakeStashItemDatabase();
        return stashItemDatabase;
    }

    @Override
    public IStashDatabase Stashes() {
       if(stashDatabase==null)
           stashDatabase= new FakeStashDatabase();

       return stashDatabase;
    }
}

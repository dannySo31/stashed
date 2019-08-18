package soda.stashed.Context;

import java.util.List;

import soda.stashed.Database.IProductDatabase;
import soda.stashed.Database.IStashDatabase;
import soda.stashed.Database.IStashItemDatabase;
import soda.stashed.Entities.StashItem;
import soda.stashed.Entities.stash;

public interface IDataContext {

    IProductDatabase Products();
    IStashItemDatabase StashItems();
    IStashDatabase Stashes();


}

package soda.stashed.Context;

import java.util.List;

import soda.stashed.Entities.Product;
import soda.stashed.Entities.StashItem;
import soda.stashed.Entities.stash;

public interface IDataContext {

    List<Product> GetProducts();
    List<StashItem> GetStashItems();
    List<stash> GetStashes();


}

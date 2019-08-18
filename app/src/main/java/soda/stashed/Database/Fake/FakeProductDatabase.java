package soda.stashed.Database.Fake;

import java.util.List;

import soda.stashed.Database.IProductDatabase;
import soda.stashed.Entities.ActionStatus;
import soda.stashed.Entities.Product;

public class FakeProductDatabase  implements IProductDatabase {
    @Override
    public ActionStatus Insert(Product entity) {
        return null;
    }

    @Override
    public ActionStatus Update(Product entity) {
        return null;
    }

    @Override
    public ActionStatus Delete(Product entity) {
        return null;
    }

    @Override
    public ActionStatus Restore(Product entity) {
        return null;
    }

    @Override
    public List<Product> Search(String searchPhrase) {
        return null;
    }

    @Override
    public Product Get(int id) {
        return null;
    }
}

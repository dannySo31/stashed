package soda.stashed.Repository;

import java.util.List;

import soda.stashed.Entities.ActionStatus;
import soda.stashed.Entities.Product;
import soda.stashed.Helpers.ContextHelper;
import soda.stashed.Repository.interfaces.BaseRepository;
import soda.stashed.Repository.interfaces.IProductRepository;

public class ProductRepository extends BaseRepository
        implements IProductRepository {

    public ProductRepository(){
        super();

    }
    @Override
    public Product Get(int id) {
        return null;
    }

    @Override
    public List<Product> Search(String searchPhrase, boolean isDeleted) {
        return null;
    }

    @Override
    public ActionStatus Save(Product entity) {
        return null;
    }

    @Override
    public ActionStatus Insert(Product entity) {
        return null;
    }

    @Override
    public ActionStatus Validate(Product entity) {
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
}

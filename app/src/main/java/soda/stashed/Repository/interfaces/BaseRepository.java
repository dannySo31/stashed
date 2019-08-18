package soda.stashed.Repository.interfaces;

import soda.stashed.Context.IDataContext;
import soda.stashed.Helpers.ContextHelper;

public abstract class BaseRepository {

    protected IDataContext context;
    public BaseRepository(){
        this(ContextHelper.GetContext());

    }

    public BaseRepository(IDataContext context){
        this.context= context;
    }
}

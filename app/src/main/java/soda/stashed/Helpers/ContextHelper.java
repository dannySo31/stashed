package soda.stashed.Helpers;

import soda.stashed.Context.FakeDataContext;
import soda.stashed.Context.IDataContext;

public class ContextHelper {
    private static IDataContext context;
    public static IDataContext GetContext(){
        if(context==null)
            context= new FakeDataContext();

        return context;
    }

    public static void SetContext(IDataContext _context){

            context= _context;


    }
}

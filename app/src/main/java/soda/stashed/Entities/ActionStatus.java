package soda.stashed.Entities;

public class ActionStatus {

    public ActionStatus(){
        Success=true;
        Message="";
    }

    public ActionStatus(boolean success, String message){
        this.Message= message;
        this.Success= success;
    }

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean Success;
    public String  Message;

    public static ActionStatus Success(String message){
        return new ActionStatus(true,message);
    }

    public static ActionStatus Failed(String message){
        return new ActionStatus(false,message);
    }

}

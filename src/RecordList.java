package src;

import src.Database;

public class RecordList<T>{
    Database db;

    public RecordList(String f) throws Exception{
        this.db = new Database<T>(f);
    }
    



    
}

package src;

import java.util.List;
import src.Database;

interface TypeList {
    public String getId();
    
}


public class RecordList<T extends TypeList>{
    Database <T>db;

    public RecordList(String f) throws Exception{
        this.db = new Database<T>(f);
    }

    public void add(T obj) throws Exception{
        List<T> data = (List<T>) db.readList();
        data.add(obj);
        db.writeList(data);
        return;
    }

    public List<T> getAll() throws Exception{
        List<T> data = (List<T>) db.readList();
        return data;
    }

    public void remove(String id) throws Exception{
        List<T> data = this.getAll();
        int indx = this.search(id);
        data.remove(indx);
        db.writeList(data);
    }

    public int search(String id) throws Exception{
        List<T> data = this.getAll();
        int idx =  0; 
        for (T e : data) {
            idx++;
            if(id == e.getId()){
                break;
            }
        }
        return idx; 
    }
}

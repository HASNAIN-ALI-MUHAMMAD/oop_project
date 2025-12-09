package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;



public class Database<T> {
    private FileOutputStream fout;
    private FileInputStream fint;
    private static String DATS_DIR = "dats/";

    public Database(String filename) throws IOException{
            this.fout = new FileOutputStream(DATS_DIR+filename.toLowerCase()+".dat");
            this.fint = new FileInputStream(DATS_DIR+filename.toLowerCase()+".dat");
    }
    public void writeList(List<T> obj) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(this.fout);
        out.writeObject(obj);
        return;
    }

    public List<T> readList() throws Exception{
        ObjectInputStream out = new ObjectInputStream(this.fint);
        List<T> obj = (List<T>)out.readObject();
        return obj;
    }    
}


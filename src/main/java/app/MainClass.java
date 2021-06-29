package main.java.app;

import java.io.*;
import java.io.IOException;
import main.java.gui.*;

public class MainClass {
    
    public static void main(String[] args) throws IOException{
        
        Entrance entrance = new Entrance();
        entrance.showPanel();
        
        /*File file = new File("src\\main\\database\\personnel\\doctor\\88244577 - info.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("دکتر خسروی" + "---" + "88244577");
        writer.flush();
        writer.close();
        
        File file = new File("src\\main\\database\\personnel\\nurse\\77244588 - info.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("پرستار محمدی" + "---" + "77244588");
        writer.flush();
        writer.close();*/
        
    }
    
}

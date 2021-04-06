package main.java.gui;

import java.io.*;
import java.io.IOException;

public class MainClass {
    
    public static void main(String[] args) throws IOException{
        
        mainFrame mainframe = new mainFrame();
        mainframe.showPanel();
        
        /*File idPersonnel = new File("src\\main\\java\\data\\personnel\\doctor\\77244588 - name.txt");
        FileWriter fileWriter = new FileWriter(idPersonnel);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("پرستار محمدی");
        writer.flush();
        writer.close();*/
        
        /*File idPersonnel = new File("src\\main\\java\\data\\personnel\\nurse\\77244588 - name.txt");
        FileWriter fileWriter = new FileWriter(idPersonnel);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("پرستار محمدی");
        writer.flush();
        writer.close();*/
        
    }
    
}

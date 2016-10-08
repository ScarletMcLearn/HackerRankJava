/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_stream_logic;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author mac
 */
public class ReadingFromFile {
    
    public static void main(String[] args) throws Exception 
    {
        FileReader file = new FileReader("/Users/mac/Documents/Projects/Java/CSE213/IO_Stream/text/tex.txt");
        
        BufferedReader reader = new BufferedReader(file);
        
        String text = "";
        
        String line = reader.readLine();
        
        int line_num = 1; 
        
        while(line != null)
        {
            text += line_num + " " + line + "\n";
            line = reader.readLine();
            line_num = line_num + 1;
        }
        
        System.out.println(text);
    }
}

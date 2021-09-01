package com.ultramain.um21.filewriter;
import java.io.FileWriter;
public class FileWriterExample {  
    public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("D:\\assignment.txt");    
          fw.write("Welcome to Java by Raghu");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    
} 


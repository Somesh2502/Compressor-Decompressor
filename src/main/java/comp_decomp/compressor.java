/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Somesh singh parihar
 */
public class compressor {
    
    public static void method(File file) throws IOException{
        //this will take file as parameter
        String fileDirectory = file.getParent();//this will help to store path of parent file
        FileInputStream fis = new FileInputStream(file);
        //these data needs to be stored in output 
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/compressedFile.gz");//i wanna store it in file directory with the name of compressedfile
        //i want to compress myoutput
        GZIPOutputStream gzip = new GZIPOutputStream(fos);
        
        byte[]buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            gzip.write(buffer,0,len);//i m sending from 0 till end to write
            
        }
        gzip.close();
        fos.close();
        fis.close();
        
    }
   
            
    
}

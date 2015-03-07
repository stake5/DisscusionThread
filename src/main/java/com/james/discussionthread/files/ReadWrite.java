/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.james.discussionthread.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author stake
 */
public class ReadWrite {
    // method to read a text file
    public static List<String> readtxt(String filename) throws FileNotFoundException, IOException {
        List<String> contents = new ArrayList<String>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filename));
            String s = "";
            while ((s = bufferedReader.readLine()) != null) {
                //System.out.println(s);
                contents.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close without throwing exception
            bufferedReader.close();
                return contents;   
        }
    }
    
    // method to read a posts file
    public static List<String> readPosts(String filename) throws FileNotFoundException, IOException {
        List<String> contents = new ArrayList<String>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filename));
            String s = "";
            while ((s = bufferedReader.readLine()) != null) {
                //System.out.println(s);
                contents.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close without throwing exception
            bufferedReader.close();
            Collections.reverse(contents);
            return contents;   
        }
    }
    
    public static void writePost(String content, String username, String filename) throws FileNotFoundException, IOException {
        try {
                content = username + " - " + DateTime.getDateTime() + ": " + content + "\n";
                File file = new File(filename);

                // if file doesnt exists, then create it
                if (!file.exists()) {
                    file.createNewFile();
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(content);
                    bw.close();
                    System.out.println("Write");
                }
                // otherwise append to it
                else {
                    FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(content);
                    bw.close();
                    System.out.println("Append");
                }
                

                System.out.println("Done");

        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}

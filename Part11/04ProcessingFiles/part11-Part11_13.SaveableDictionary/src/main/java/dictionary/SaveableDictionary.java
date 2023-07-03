/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author lenovo
 */

import java.util.Map;
import java.util.HashMap;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintWriter;

public class SaveableDictionary {
    
    private Map<String,String>dictionary;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.file = file;
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
    }
    
    public String translate(String word){
        String translate = null;
        if(this.dictionary.containsKey(word)){
            translate = this.dictionary.get(word);
        }
        if(this.dictionary.containsValue(word)){
            for(String key : this.dictionary.keySet()){
                if(this.dictionary.get(key).equals(word)){
                    translate = key;
                }
            }
        }
        return translate;
    }
    
    public void delete(String word){
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word, this.dictionary.get(word));
        }
        if(this.dictionary.containsValue(word)){
            String removeKey = null;
            for(String key : this.dictionary.keySet()){
                if(this.dictionary.get(key).equals(word)){
                    removeKey = key;
                }
            }
            this.dictionary.remove(removeKey,word);
        }
    }
    
    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(this.file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
        } catch(Exception e){
            System.out.println("Wrong");
            return false;
        }
        return true;
        
    }
    
    public boolean save(){
        try(PrintWriter printwriter = new PrintWriter(this.file)){
            for(String key :this.dictionary.keySet()){
                printwriter.println(key + ":" + this.dictionary.get(key));
            }
        } catch(Exception e){
            System.out.println("Wrong");
            return false;
        }
        return true;
    }
    
    
}

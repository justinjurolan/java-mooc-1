/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.Scanner;


public class TextUI {
    
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI (Scanner scan, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scan;  
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String word = this.scanner.nextLine();
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (word.equals("add")) {
                this.addToDictionary();
                continue;
            }
            
            if (word.equals("search")) {
                this.searchDictionary();
                continue;
            }
            
            
            System.out.println("Unknown command");
        }
    }
    
    public void addToDictionary() {
        System.out.println("Word: ");
        String dictWord = this.scanner.nextLine();
        System.out.println("Translation: ");
        String dictTranslation = this.scanner.nextLine();
        this.dictionary.add(dictWord,dictTranslation);
    }
    
    public void searchDictionary() {
        System.out.println("To be translated: ");
        String keyWord = this.scanner.nextLine();
        String translate = this.dictionary.translate(keyWord);
        if (translate == null) {
            System.out.println("Word " + keyWord + " was not found");
        } else {
            System.out.println("Translatation: " + this.dictionary.translate(keyWord));
        }
      
    }
    
}

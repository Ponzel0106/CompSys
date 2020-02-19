package com.ponzel;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//абвгґдеєжзиіїйклмнопрстуфхцчшщьюя
public class APItoLab {
    static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static ArrayList<Character> readFromFile(String path){
        ArrayList<Character> listOfChars = new ArrayList<>();
        try(FileReader reader = new FileReader(path))
        {
            int c;
            while((c=reader.read())!=-1){
                listOfChars.add((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        listOfChars.removeIf(ch->ch.equals(' '));
        return listOfChars;
    }

    public static double entropy(ArrayList<Character> list){
        double sumEntropy = 0;
        for(char c :alphabet){
           double probability =  probability(c,list);
           double entropy = probability * log2(1/probability);
           if(probability!=0) sumEntropy += entropy;
           System.out.printf("Symbol %c probability: %.8f Entropy for symbol: %.8f \n",c,probability,entropy);
        }
        return  sumEntropy;
    }
    static double probability(char ch, ArrayList<Character> list){
        double numberOfCharInText = list.stream().filter(n->n.equals(ch)).count();
        return numberOfCharInText / list.size();
    }

    static double log2(double x) { return (Math.log(x) / Math.log(2)); }

}

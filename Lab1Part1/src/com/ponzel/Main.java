package com.ponzel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Character> listOfChars = new ArrayList<>();
        listOfChars = APItoLab.readFromFile("C:\\Users\\maksy\\OneDrive\\Документы\\3.2курс\\lab1.part1\\filmBase64.txt");
        double sumEntropy = APItoLab.entropy(listOfChars);
        double amountInfoInText = (sumEntropy * listOfChars.size())/8;
        System.out.printf("\tTotal entropy: %f \n\tThe amount of information in the text: %.3f bytes",sumEntropy,amountInfoInText);
    }
}

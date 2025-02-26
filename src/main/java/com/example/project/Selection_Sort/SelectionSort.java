package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) 
    {
        int min = 0;
        for (int i = 0; i < elements.length - 1; i++)
        {
            for (int j = i + 1; j < elements.length; j++)
            {
                if (elements[j] < elements[min])
                {
                    min = j;
                }
            }
            int temp = elements[min];
            elements[min] = elements[i];
            elements[i] = temp;
            min = i + 1;
        }
        
       
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) 
    {
        int min = 0;
        for (int i = 0; i < words.size() - 1; i++)
        {
            for (int j = i + 1; j < words.size(); j++)
            {
                if (words.get(j).compareTo(words.get(min)) < 0)
                {
                    min = j;
                }
            }
            String temp = words.set(min, words.get(i));
            words.set(i, temp);
            min = i +1;
        }
       
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}

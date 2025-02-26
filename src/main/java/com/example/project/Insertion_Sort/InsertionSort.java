package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) 
    {
        int count = 0;

        for (int i = 0; i < elements.length - 1; i++)
        {
            int j = i +1;
            while (j > 0 && elements[j - 1] > elements[j]) 
            {
                int temp = elements[j];
                elements[j] = elements[j - 1];
                elements[j - 1] = temp;
                j--;
                count++;
                
            }

        }
        System.out.println(count);
        return elements;
    }

   
    public static void selectionSort(int[] elements) 
    {
      
    
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) 
    {
        for (int i = 1; i < words.size(); i++)
        {
            String temp = words.get(i);
            int idx = i;
            while (idx > 0 && temp.compareTo(words.get(idx - 1)) < 0) 
            {
                words.set(idx, words.get(idx - 1));
                idx--;
            }
            words.set(idx, temp);
        }
    
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) 
    {
        int ocunt = 0;
        for (int i = 1; i < words.size(); i++)
        {
            String temp = words.get(i);
            int idx = i;
            while (idx > 0 && temp.compareTo(words.get(idx - 1)) < 0) 
            {
                words.set(idx, words.get(idx - 1));
                idx--;
            }
            words.set(idx, temp);
        }
    
       System.out.println("INSERTION SORT : Number of loop iterations: " + ocunt);
    
    }

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
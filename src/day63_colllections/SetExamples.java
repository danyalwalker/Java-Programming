package day63_colllections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //list -> ArrayList

        set.add(10);
        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        words.remove("world");
        System.out.println(words);


        for(String word : words){

        }

        // convert your Set to a List

        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("world");
        System.out.println(wordsList);


        // LinkedHashSet

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("$#");
        linkedHashSet.add("53");
        linkedHashSet.add("apple");
        linkedHashSet.add("java");
        linkedHashSet.add("53");
        linkedHashSet.add("cucumber");
        System.out.println(linkedHashSet);

        // TreeSet

        Set<String> mixed = new TreeSet<>();
        mixed.add("24");
        mixed.add("java");
        mixed.add("$#");
        mixed.add("53");
        mixed.add("apple");
        mixed.add("jeva");
        mixed.add("53");
        mixed.add("Cucumber");
        System.out.println(mixed);
        ((TreeSet)mixed).first();
    }
    }


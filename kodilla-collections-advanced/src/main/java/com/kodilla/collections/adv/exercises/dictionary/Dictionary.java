package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;


public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public int size() {
        return dictionary.size();
    }

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);

    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }
}





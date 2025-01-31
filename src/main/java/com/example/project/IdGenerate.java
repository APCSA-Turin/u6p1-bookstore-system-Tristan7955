package com.example.project;

public class IdGenerate {

    // 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";
    
    // One empty constructor
    public IdGenerate() {
    }
    
    public static String getCurrentId() {
        return currentId;
    }
    
    public static void reset() {
        currentId = "99";
    }

    // Generates a new ID, when called it will increment the currentId by 1
    public static String generateID() {
        int id = Integer.parseInt(currentId);
        id += 1;
        currentId = Integer.toString(id);
        return currentId;
    }
}

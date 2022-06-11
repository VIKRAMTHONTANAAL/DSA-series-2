package main.java.Practice;

import java.util.HashSet;

public class findDuplicatesInArray {
    public static void main(String[] args) {
        String arr[] = {"java", "c", "c++", "python", "java"};
        System.out.println(findDuplicateUsingHashSet(arr));
        System.out.println(findDuplicateUsingHashSet2(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    System.out.println("dupli " + arr[i]);
                }

            }
        }
    }

    public static String findDuplicateUsingHashSet(String arr[]) {
        HashSet<String> hash = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if (hash.contains(arr[i])) {
                return arr[i];
            } else {
                hash.add(arr[i]);
            }
        }

        return null;
    }

    public static String findDuplicateUsingHashSet2(String arr[]) {
        HashSet<String> hash = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if (hash.add(arr[i]) == false) {
                return arr[i];
            }

        }
        return null;
    }
}
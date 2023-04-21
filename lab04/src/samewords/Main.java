package samewords;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        File directory = new File("src/files");

        long startTime = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        Analyzer task = new Analyzer(directory);
        pool.invoke(task);
        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime) + " ms");
        System.out.println("Count of Common Words: " + task.commonWords.size());
        System.out.println("Common Words: " + task.commonWords);
    }
}
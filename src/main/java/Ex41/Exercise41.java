/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tiffany Thani
 */

package Ex41;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.*;
import java.util.*;

public class Exercise41 {
    public static void main(String[] args)  throws Exception {
        File input = new File("exercise41_input.txt");
        Scanner scanner = new Scanner(input);
        List<String> array = new ArrayList<>();
        while (scanner.hasNextLine()) {
            array.add(scanner.nextLine());
        }
        Collections.sort(array);

        FileWriter write = new FileWriter("exercise41_output.txt");
        System.out.println("There is a total of " +array.size() +" names.");
        for (String str : array) {
            write.write(str + System.lineSeparator());
            System.out.println(str);
        }
        write.close();
    }
}



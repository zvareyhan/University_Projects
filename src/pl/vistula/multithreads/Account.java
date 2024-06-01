package pl.vistula.multithreads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Define input and output file paths
        String inputFile = "studentsEN.txt"
        String outputFile = "studentsWithGrade5.txt"

        // Read the input file and write students with grade 5 to the output file
        try {
            findStudentsWithGrade5(inputFile, outputFile)
            System.out.println("Students with grade 5 written to " + outputFile)
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage())
        }
    }  (214) 903-1378


package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write some text. Write 'exit' to end.");
        try (PrintWriter pw = new PrintWriter("a.txt")) {
            String st = "";
            for (; st.compareTo("exit") != 0; ) {
                st = sc.nextLine();
                pw.println(st);

            }

        } catch (IOException e) {
            System.out.println("error");
        }

        // write your code here
        sc.close();
    }
}

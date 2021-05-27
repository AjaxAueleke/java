package com.company;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {

    static void readfromfile() {
        try {
            String data;
            File newfile = new File("D:\\news.txt");
            String[] arr = new String[100];
            Scanner s = new Scanner(newfile);
            int i = 0;
            while (s.hasNext()) {

                data = s.next();
                arr[i++] = data;
                System.out.println(data);

            }
            i--;

            for (; i >= 0; i--) {
                System.out.println(arr[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error occured in reading file");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	System.out.println("Hello World");
	readfromfile();
    }

}

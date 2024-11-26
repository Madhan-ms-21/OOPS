package org.self.oops.Exceptions.Checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Starting to read the file");
//        readFile("werwerwer");\

//        FileReader fr = new FileReader("user/path.txt");
        List<Integer> l = new ArrayList<>();
        l.add(2);
        for(int i = 0 ; i < 2 ; i++){
            System.out.println(l.get(i));
        }

        System.out.println("Filereader object is ready");

    }
}

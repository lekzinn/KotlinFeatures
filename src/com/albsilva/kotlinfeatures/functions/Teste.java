package com.albsilva.kotlinfeatures.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Teste {

    public void teste(){
        try {
            FileReader reader = new FileReader("Teste");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

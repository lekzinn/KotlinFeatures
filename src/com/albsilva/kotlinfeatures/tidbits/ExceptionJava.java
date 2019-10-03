package com.albsilva.kotlinfeatures.tidbits;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionJava {

  public void TestException() throws FileNotFoundException {
      try {
          FileReader teste = new FileReader("teste");
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }

      FileReader teste2 = new FileReader("teste");
  }
}

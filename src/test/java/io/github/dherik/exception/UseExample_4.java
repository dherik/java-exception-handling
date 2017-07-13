package io.github.dherik.exception;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class UseExample_4 {

    @Test
    public void test() {

        try {
            wrapException();
        } catch (SystemException e) {
            Map<String, Object> properties = e.getProperties();
            System.out.println("File: " + properties.get("fileName"));
            e.printStackTrace();
        }
    }

    private void wrapException() {
        String fileName = "thisFileNotExists.txt";
        try {
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw SystemException.wrap(e).set("fileName", fileName);
        }
    }

}

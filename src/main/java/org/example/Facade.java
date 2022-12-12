package org.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Facade {
    static public void convert(String inputFile, String outputFile, dataType type) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

        IConverter converter = ConverterFactory.getConverter(type);
        int i;
        String input_data = new String();
        /*while((i=bufferedInputStream.read())!= -1){
            input_data += (char)i;
        }*/
        while((i=fileInputStream.read())!= -1){
            input_data += (char)i;
        }
        String output_data = converter.convert(input_data);
        fileOutputStream.write(output_data.getBytes());

        fileInputStream.close();
        bufferedInputStream.close();
        fileOutputStream.close();
    }
}

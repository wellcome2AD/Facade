package org.example;

public class ConverterFactory {
    static public IConverter getConverter(dataType type)
    {
        IConverter converter = null;
        switch (type)
        {
            case txt:
            {
                converter = new ConverterToTxt();
            }
        }
        return converter;
    }
}

package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AdapterReport adapterReport = new AdapterReport(new XmlReport());
        String jsonData = adapterReport.getJsonData();
        System.out.println(jsonData);
    }
}

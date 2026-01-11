package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CloudServer cloudServer = new CloudServer
                .Builder("sk-servers","sk-west-1")
                .cpuCores(4)
                .ramSize(8)
                .osType("Linux")
                .storageSize(100)
                .build();

        System.out.println(cloudServer);

        CloudServer cloudServer2 = new CloudServer
                .Builder("sk-servers-2","sk-west-1")
                .osType("Windows")
                .storageSize(200)
                .build();

        System.out.println(cloudServer2);

    }
}

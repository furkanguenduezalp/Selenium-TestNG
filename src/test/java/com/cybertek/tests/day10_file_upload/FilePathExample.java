package com.cybertek.tests.day10_file_upload;

public class FilePathExample {

    public static void main(String[] args) {
        //System.out.println(System.getProperty("os.name"));

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath = " + projectPath);
        String filePath = "src/test/resources/textfile.txt";
        String fullPath = projectPath+"/"+filePath;
        System.out.println(fullPath);

    }
}

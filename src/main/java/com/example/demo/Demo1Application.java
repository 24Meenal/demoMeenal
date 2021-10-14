package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

        Employee emp = new Employee();
        emp.setForename("TestNAme");
      System.out.println(  emp.getForename().toString());
//        try(InputStream fileStream = new FileInputStream("\\demo1\\Test2.json")) {
//            List<Manager> mgrlist = mapper.readValue(fileStream, Manager.class);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}

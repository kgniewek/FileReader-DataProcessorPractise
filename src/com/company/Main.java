package com.company;

import First.FileHelper;
import First.InvalidSalaryException;
import First.Person;
import First.PersonOperationHelper;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws InvalidSalaryException {

      FileHelper input = new FileHelper();
//        input.readListFromFile();
//        for (String x : input.list) {
//            System.out.println(x);
//       }

        PersonOperationHelper poh = new PersonOperationHelper();
        poh.convertListOfStringToListOfPeople(input.readListFromFile());
        System.out.println();

        //zadanie 4
        for(Person x : zadanieCzwarte(poh.convertListOfStringToListOfPeople(input.readListFromFile()), 30, 'M', "D"))
        {
            System.out.println(x);
        }
    }
    public static List<Person> zadanieCzwarte(List<Person> listCzwarte, int limit, char sex, String startsWith){
   return listCzwarte.stream()
            .filter(a -> a.getSurname().startsWith(startsWith))
            .filter(a -> a.getSex() == sex)
            .limit(limit)
           .collect(Collectors.toList());
    }
}

package com.hcl_interview;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

  public static void main(String[] args) {
    final EvenNumbers evenNumbers = new EvenNumbers();

    final List<Integer> list = Arrays.asList(1,2,3,4);


    final List<Integer> eventList = getEventList(list);

    eventList.forEach(System.out::println);

  }

  private static List<Integer> getEventList(final List<Integer> list) {

    return list;

  }


}

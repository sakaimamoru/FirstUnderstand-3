package org.example;

import java.util.Scanner;

public class Main {

  public static String phoneNumberPattern = "^0[789]0-\\d{4}-\\d{4}$";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("携帯電話番号を入力してください");

    for (int i = 0; i < 5; i++) {
      String input = scanner.nextLine();
      if (input.matches(phoneNumberPattern)) {
        System.out.println(input + " は有効な携帯電話番号です。");
      } else {
        System.out.println(input + " は無効な携帯電話番号です。");
      }
    }
    scanner.close();
  }
}
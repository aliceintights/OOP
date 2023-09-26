package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronimic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.lastName = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 3;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
package com.yash.Java8NewFeature;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class SortingCustomObjects {
 
    public static void main(String[] args) {
 
        // 1. List of Student objects
        List<Player> fab5IndianOrder = Arrays.asList(
                new Player(1, "Dravid", 88.55, 2),
                new Player(2, "Sehwag", 55.65, 5),
                new Player(3, "Laxman", 77.75, 3),
                new Player(4, "Sachin", 99.25, 1),
                new Player(5, "Sourav", 66.15, 4)
                );
 
        // 1. unsorted players by any attributes - original list
        System.out.println("1. List of unsorted Players"
                + " in orginal list :\n");
        fab5IndianOrder.forEach(System.out::println);
 
 
        // 2. Natural sorting acc. to Player's Id
        List<Player> sortedById = fab5IndianOrder // original source
                .stream() // 2.1 get sequential stream
                .sorted((p1, p2) -> p1.getId() - p2.getId()) // 2.2 sort by Id
                .collect(Collectors.toList()); // 2.3 collect to new List
 
 
        // pretty print to console using lambda expression
        System.out.println("\n\n2. Players sorted acc. to"
                + " Natural order of Id :\n");
        sortedById.forEach(playerById -> System.out.println(playerById));
 
 
        // 3. Natural sorting acc. to Player's Name
        List<Player> sortedByName = fab5IndianOrder // original source
                .stream() // 3.1 get sequential stream
                .sorted((p1, p2) -> p1.getName()
                        .compareTo(p2.getName())) // 3.2 sort by Name
                .collect(Collectors.toList()); // 3.3 collect to new List
 
 
        // pretty print to console using lambda expression
        System.out.println("\n\n3. Players sorted acc. to"
                + " Alphabetical order of Name :\n");
        sortedByName.forEach(playerByName -> System.out.println(playerByName));
 
 
        // 4. Natural sorting acc. to Player's Rank
        List<Player> sortedByRank = fab5IndianOrder // original source
                .stream() // 4.1 get sequential stream
                .sorted((p1, p2) -> Integer
                        .compare(p1.getRank(), p2.getRank()))// 4.2 Rank sort
                .collect(Collectors.toList()); // 4.3 collect to new List
 
 
        // pretty print to console using lambda expression
        System.out.println("\n\n4. Players sorted acc. to"
                + " Natural order of Rank :\n");
        sortedByRank.forEach(playerByRank -> System.out.println(playerByRank));
    }
}
package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Set<String> rainbowColors = new HashSet<>();
        rainbowColors.add("red");
        rainbowColors.add("orange");
        rainbowColors.add("yellow");
        rainbowColors.add("green");
        rainbowColors.add("blue");
        rainbowColors.add("darkBlue");
        rainbowColors.add("violet");

        System.out.println("A) Show all colors one below the other:");
        for (String colors : rainbowColors) {
            System.out.println(colors);
        }

        System.out.println();
        System.out.println("B) The number of colors the rainbow has:");
        System.out.println(rainbowColors.size());

        System.out.println();
        System.out.println("C) Show colors in alphabetical order:");
        Set<String> rainbowColors2 = new TreeSet<>(rainbowColors);
        System.out.println(rainbowColors2);

        System.out.println();
        System.out.println("D) Show the colors in the reverse order of the one given: ");
        Set<String> rainbowColors3 = new LinkedHashSet<>(Arrays.asList("red", "orange", "yellow", "green", "blue", "darkBlue", "violet"));
        System.out.println(rainbowColors3);
        List<String> rainbowColorsList = new ArrayList<>(rainbowColors3);
        Collections.reverse(rainbowColorsList);
        System.out.println(rainbowColorsList);

        System.out.println();
        System.out.println("E) Show all colors starting with the letter 'v': ");
        for (String colors : rainbowColors) {
            if (colors.startsWith("v")) {
                System.out.println(colors);
            }
        }

        System.out.println();
        System.out.println("F) Remove all colors that do not start with the letter 'v': ");
        for (String colors2 : rainbowColors) {
            if (!colors2.startsWith("v")) {
                System.out.println(colors2);
            }
        }

        System.out.println();
        System.out.println("G) Clean the set: ");
        rainbowColors.clear();
        System.out.println(rainbowColors);

        System.out.println();
        System.out.println("H) Check if the set is empty: ");
        System.out.println(rainbowColors.isEmpty());

    }
}

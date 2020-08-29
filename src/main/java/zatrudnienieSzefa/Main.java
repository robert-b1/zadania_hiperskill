package zatrudnienieSzefa;

import java.util.Scanner;

public class Main {

    /*
    Imagine that you are an HR manager at a restaurant
    and you need to hire a chef. To do that, you need
    to collect some preliminary data about the candidates.
    You have a special form for the candidates that includes
    5 fields: first name, age, stage of education, years of
    experience, cuisine preference.
    Your program should read all the words (or numbers)
    from the five lines and output "The form for first
    name is completed. We will contact you if we need a chef
    that cooks cuisine preference dishes."
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        String age = scn.nextLine();
        String stageOfEducation = scn.nextLine();
        String yearsOfExperience = scn.nextLine();
        String cuisinePreference = scn.nextLine();

        System.out.println("The form for " + name + " is completed." +
                " We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}

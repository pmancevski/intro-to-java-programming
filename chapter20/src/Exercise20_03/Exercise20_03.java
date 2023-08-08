package Exercise20_03;

import java.util.*;

public class Exercise20_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<State> states = getData();
        int score = 0;

        for (int count = 0; count < states.size(); count++){
            System.out.print("What is the capital of " + states.get(count).getState() + "? ");
            String answer = input.next();

            if (answer.toLowerCase().equals(states.get(count).getCapitol().toLowerCase())){
                System.out.println("Your answer is correct");
                score++;
            }
            else {
                System.out.println("The correct answer should be " + states.get(count).getCapitol());
            }
        }

        System.out.println("Your score is: " + score);
    }

    public static List<State> getData() {
        List<State> states = new ArrayList<>();

        String[][] d = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};

        for (int count = 0; count < d.length; count++){
            State state = new State(count, d[count][0], 0, d[count][1]);
            states.add(state);
        }

        Collections.shuffle(states);

        return states;
    }
}

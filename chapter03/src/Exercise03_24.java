public class Exercise03_24 {
    public static void main(String[] args) {
        int rank = (int)((Math.random() * (14 - 1)) + 1);
        int suit = (int)(Math.random() * 4);

        String output = "The card you picked is ";

        switch (rank){
            case 1: output += "Ace of "; break;
            case 2: output += "1 of "; break;
            case 3: output += "2 of "; break;
            case 4: output += "3 of "; break;
            case 5: output += "4 of "; break;
            case 6: output += "5 of "; break;
            case 7: output += "6 of "; break;
            case 8: output += "7 of "; break;
            case 9: output += "8 of "; break;
            case 10: output += "9 of "; break;
            case 11: output += "Jack of "; break;
            case 12: output += "Queen of "; break;
            case 13: output += "King of ";
        }

        switch (suit){
            case 0: output += "Clubs"; break;
            case 1: output += "Diamonds"; break;
            case 2: output += "Hearts"; break;
            case 3: output += "Spades";
        }

        System.out.println(output);
    }
}

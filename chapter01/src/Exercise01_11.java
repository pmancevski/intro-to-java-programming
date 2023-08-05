public class Exercise01_11 {
    public static void main(String[] args) {
        int currentPopulation = 312_032_486;
        double birthPerYear = (365 * 24 * 60 * 60) / 7.0;
        double deathPerYear = (365 * 24 * 60 * 60) / 13.0;
        double newImmigrantPerYear = (365 * 24 * 60 * 60) / 45.0;
        System.out.println("Year 1 projection: " +
                (long)(currentPopulation + birthPerYear - deathPerYear + newImmigrantPerYear));

        System.out.println("Year 2 projection: " +
                (long)(currentPopulation + (birthPerYear - deathPerYear + newImmigrantPerYear) * 2));

        System.out.println("Year 3 projection: " +
                (long)(currentPopulation + (birthPerYear - deathPerYear + newImmigrantPerYear) * 3));

        System.out.println("Year 4 projection: " +
                (long)(currentPopulation + (birthPerYear - deathPerYear + newImmigrantPerYear) * 4));

        System.out.println("Year 5 projection: " +
                (long)(currentPopulation + (birthPerYear - deathPerYear + newImmigrantPerYear) * 5));
    }
}

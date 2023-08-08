public class Exercise04_03 {
    public static void main(String[] args) {
        final double ATLANTA_X = Math.toRadians(33.7489954);
        final double ATLANTA_Y = Math.toRadians(-84.3879824);
        final double CHARLOTTE_X = Math.toRadians(35.2270869);
        final double CHARLOTTE_Y = Math.toRadians(-80.8431267);
        final double SAVANNAH_X = Math.toRadians(32.0835407);
        final double SAVANNAH_Y = Math.toRadians(-81.0998342);
        final double ORLANDO_X = Math.toRadians(28.5383355);
        final double ORLANDO_Y = Math.toRadians(-81.3792365);
        final double EARTH_RADIUS = 6371.01;

        double atlantaCharlotteDistance = EARTH_RADIUS * Math.acos(Math.sin(ATLANTA_X) * Math.sin(CHARLOTTE_X) +
                Math.cos(ATLANTA_X) * Math.cos(CHARLOTTE_X) * Math.cos(ATLANTA_Y - CHARLOTTE_Y));
        double charlotteSavannahDistance = EARTH_RADIUS * Math.acos(Math.sin(CHARLOTTE_X) * Math.sin(SAVANNAH_X) +
                Math.cos(CHARLOTTE_X) * Math.cos(SAVANNAH_X) * Math.cos(CHARLOTTE_Y - SAVANNAH_Y));

        double savannahAtlantaDistance = EARTH_RADIUS * Math.acos(Math.sin(SAVANNAH_X) * Math.sin(ATLANTA_X) +
                Math.cos(SAVANNAH_X) * Math.cos(ATLANTA_X) * Math.cos(SAVANNAH_Y - ATLANTA_Y));

        double savannahOrlandoDistance = EARTH_RADIUS * Math.acos(Math.sin(SAVANNAH_X) * Math.sin(ORLANDO_X) +
                Math.cos(SAVANNAH_X) * Math.cos(ORLANDO_X) * Math.cos(SAVANNAH_Y - ORLANDO_Y));
        double orlandoAtlantaDistance = EARTH_RADIUS * Math.acos(Math.sin(ORLANDO_X) * Math.sin(ATLANTA_X) +
                Math.cos(ORLANDO_X) * Math.cos(ATLANTA_X) * Math.cos(ORLANDO_Y - ATLANTA_Y));

        double triangle1_s = (atlantaCharlotteDistance + charlotteSavannahDistance + savannahAtlantaDistance) / 2;
        double triangle2_s = (savannahAtlantaDistance + savannahOrlandoDistance + orlandoAtlantaDistance) / 2;

        double triangle1_area = Math.sqrt(triangle1_s * (triangle1_s - atlantaCharlotteDistance) *
                (triangle1_s - charlotteSavannahDistance) * (triangle1_s - savannahAtlantaDistance));
        double triangle2_area = Math.sqrt(triangle2_s * (triangle2_s - savannahAtlantaDistance) *
                (triangle2_s - savannahOrlandoDistance) * (triangle2_s - orlandoAtlantaDistance));

        System.out.println("Triangle 1 area is: " + triangle1_area + " km\nTriangle 2 area is: " + triangle2_area +
                " km\nSum is: " + (triangle1_area + triangle2_area) + " km");
    }
}

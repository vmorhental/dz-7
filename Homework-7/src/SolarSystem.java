public enum SolarSystem {
    MERCURY(1, 0, 10, null, "VENUS" ),
    VENUS(2, 40, 50, MERCURY, "EARTH" ),
    EARTH(3, 20, 90, VENUS, "MARS" ),
    MONTH (3, 30, 93, VENUS, "MARS" ),
    MARS (4, 100, 155, EARTH, "JUPITER" ),
    JUPITER(5, 300, 934, MARS, "SATURN" ),
    EUROPA(5, 330, 933, JUPITER, "SATURN" ),
    SATURN(6, 60, 1003, JUPITER, "URANUS" ),
    URANUS(7, 550, 1503, SATURN, "NEPTUNE" ),
    NEPTUNE(8, 60, 1603,  URANUS, null);


    private final int positionFromSun;
    private final int distanceFromPrevPlanet;
    private final int distanceFromSun;
    private final int radiusOfPlanet;
    private String nextPlanet;

    public int getDistanceFromSun() {
        return distanceFromSun;
    }
    public int getPositionFromSun() {
        return positionFromSun;
    }
    public int getDistanceFromPrevPlanet() {
        return distanceFromPrevPlanet;
    }
    public int getRadiusOfPlanet() {
        return radiusOfPlanet;
    }
    public String getNextPlanet() {
        return nextPlanet;
    }

    SolarSystem(int positionFromSun, int distanceFromPrevPlanet, int radiusOfPlanet, SolarSystem prevPlanet, String nextPlanet){
        this.positionFromSun = positionFromSun;
        this.distanceFromPrevPlanet = distanceFromPrevPlanet;
        this.distanceFromSun = prevPlanet!=null?prevPlanet.getDistanceFromSun() + radiusOfPlanet: 10;
        this.radiusOfPlanet = radiusOfPlanet;
        this.nextPlanet = nextPlanet;
    }
}
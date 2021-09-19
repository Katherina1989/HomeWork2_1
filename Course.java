package homework21;

public class Course {
    private String name;
    private Let[] lets;

    public Course(String name, Let[] lets) {
        this.name = name;
        this.lets = lets;
    }

    public void doIt(Team team) {
        for (int i = 0; i < lets.length; i++) {
            Sportsman[] currentTeam = team.getTeam();
            for (int j = 0; j < currentTeam.length; j++) {
               currentTeam[j].go(lets[i]);
            }
        }
    }

    public String getName() {
        return name;
    }
}

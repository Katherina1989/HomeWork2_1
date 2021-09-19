package homework21;

public class Team {
    private String name;
    private Sportsman[] team;

    public Team(String name, Sportsman[] team) {
        this.name = name;
        this.team = team;
    }

    public void showResults() {
        String winer = "не определен";
        double time = Double.MAX_VALUE;
        boolean start = false;
        for (int i = 0; i < team.length; i++) {
            if (team[i].isOut()) {
                System.out.println("Спортсмен " + team[i].getName() + " сошел с дистанции");
                start = true;
            } else {
                if (team[i].getTotalTime() > 0) {
                    System.out.println("Спортсмен " + team[i].getName() + " прошел полосу препятствий за " + team[i].getTotalTime());
                    if (team[i].getTotalTime() < time) {
                        winer = team[i].getName();
                        time = team[i].getTotalTime();
                    }
                }
            }
        }
        if (!start && time == Double.MAX_VALUE) {
            System.out.println("Соревнование не началось");
        } else {
            System.out.println("Победитель " + winer);
        }
    }

    public String getName() {
        return name;
    }

    public Sportsman[] getTeam() {
        return team;
    }
}

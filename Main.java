package homework21;

public class Main {
    public static void main(String[] args) {
        Sportsman[] sportsmens = new Sportsman[4];
        sportsmens[0] = new Sportsman("Вася", 11, 4);
        sportsmens[1] = new Sportsman("Петя", 7, 6);
        sportsmens[2] = new Sportsman("Катя", 40, 3);
        sportsmens[3] = new Sportsman("Оля", 9, 2);
        Team team = new Team("Пупырки",sportsmens);
        Let[] lets = new Let[3];
        lets[0] = new Let("Овраг", 3, 100);
        lets[1] = new Let("Река", 4, 50);
        lets[2] = new Let("Канат", 2, 7);

        Course course = new Course("Полоса1", lets);

        course.doIt(team);
        team.showResults();
    }
}

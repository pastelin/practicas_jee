package section.generics.introduction;

interface Player {

    String name();

}

record BaseballPlayer(String name, String position) implements Player {}

record FootballPlayer(String name, String position) implements Player {}

record VolleyballPlayer(String name, String position) implements Player {}

public class Main {

    public static void main(String[] args) {
        var philli = new Affiliation("city", "Philadelphia, PA", "US");

        // Ejemplo Base sin Interfaz ni Generics
        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        // Ejemplo usando una Interfaz
        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        // Ejemplo usando Generics
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philli);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        // Ejemplo usando una Interfaz, el inconveniente es que queda abierto a aceptar cualquir tipo de dato
        SportsTeam afc1 = new SportsTeam("Adelaide Crows");

        // Ejemplo usando Generics, crea una regla para que solo acepte el tipo FootballPlayer definido en "<>"
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows", "City of Adelaide, Sout Australia, in AU");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(tex);
        afc.addTeamMember(tex);
        afc.addTeamMember(rory);
        afc.listTeamMembers();


        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black","Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}

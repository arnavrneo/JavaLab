package minor2;
import java.util.ArrayList;

class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}

class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}

class Tournament {
    private String tournamentName;
    private ArrayList<Team> teams;

    public Tournament(String tournamentName) {
        this.tournamentName = tournamentName;
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }
}

class Event {
    private String eventName;
    private ArrayList<Tournament> tournaments;
    public Event(String eventName) {
        this.eventName = eventName;
        this.tournaments = new ArrayList<>();
    }

    public void addTournament(Tournament tournament) {
        tournaments.add(tournament);
    }

    public void displayEventDetails() {
        System.out.println("Event: " + eventName);
        for (Tournament tournament : tournaments) {
            System.out.println("Tournament: " + tournament.getTournamentName());
            System.out.println("Teams:");
            for (Team teams: tournament.getTeams()) {
                System.out.println("- " + teams.getTeamName());
                for (Player player: teams.getPlayers()) {
                    System.out.println(" - " + player.getPlayerName());
                }
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Arnav");
        Player player2 = new Player("Tony");

        Team team1 = new Team("Team Avengers");
        team1.addPlayer(player1);
        team1.addPlayer(player2);

        Team team2 = new Team("Team Revengers");
        team2.addPlayer(player1);

        Tournament tournament1 = new Tournament("Civil War");
        tournament1.addTeam(team1);

        Tournament tournament2 = new Tournament("Endgame");
        tournament2.addTeam(team2);

        Event event = new Event("Olympics");
        event.addTournament(tournament1);
        event.addTournament(tournament2);

        event.displayEventDetails();
    }
}

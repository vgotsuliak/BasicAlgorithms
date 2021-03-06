package arrays;

import java.util.*;

public class TeamMatch2 {

    public static final int TEAMS_COUNT = 1_000_000;

    public static void main(String[] args) {
        Map<Integer, Set<Integer>> teams = new HashMap<>();

        for (int team = 0; team < TEAMS_COUNT; team++) {
            teams.put(team, new HashSet<>());
        }

        for (int i = 0; i < 300; i++) {
            if (i % 2 > 0) {
                int team1 = new Random(System.nanoTime()).nextInt(TEAMS_COUNT);
                int team2 = new Random(System.nanoTime()).nextInt(TEAMS_COUNT);
                teams.get(team1).add(team2);
            } else {
                int queryTeam1 = new Random(System.nanoTime()).nextInt(TEAMS_COUNT);
                int queryTeam2 = new Random(System.nanoTime()).nextInt(TEAMS_COUNT);

                if (queryTeam1 != queryTeam2) {
                    Set<Integer> playedTeams = teams.get(queryTeam1);
                    System.out.println(String.format("Did team %d play with team %d - %b", queryTeam1, queryTeam2, playedTeams.contains(queryTeam2)));
                }
            }
        }

    }

}

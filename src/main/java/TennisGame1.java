import java.util.*;


public class TennisGame1 implements TennisGame
{
    private static Map<Integer, String> ALL_SCORES = new HashMap<>();
    private static Map<Integer, String> SINGLE_SCORES = new HashMap<>();

    static {
        ALL_SCORES.put(0, "Love-All");
        ALL_SCORES.put(1, "Fifteen-All");
        ALL_SCORES.put(2, "Thirty-All");


    }

    static {
        SINGLE_SCORES.put(0, "Love");
        SINGLE_SCORES.put(1, "Fifteen");
        SINGLE_SCORES.put(2, "Thirty");
        SINGLE_SCORES.put(3, "Forty");

    }

    private int player1Score = 0;
    private int player2Score = 0;

    public void wonPoint(String playerName)
    {
        if (playerName == "player1")
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore()
    {
        String score = "";
        if (player1Score == player2Score) {
            return ALL_SCORES.getOrDefault(player1Score, "Deuce");
        }
        else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        }
        else {
            return "%s-%s".formatted(SINGLE_SCORES.get(player1Score),SINGLE_SCORES.get(player2Score));
        }
        return score;
    }
}

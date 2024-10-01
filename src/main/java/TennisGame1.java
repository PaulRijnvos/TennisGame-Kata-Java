import java.util.*;


public class TennisGame1 implements TennisGame
{
    private static Map<Integer, String> ALL_SCORES = new HashMap<>();

    static {
        ALL_SCORES.put(0, "Love-All");
        ALL_SCORES.put(1, "Fifteen-All");
        ALL_SCORES.put(2, "Thirty-All");


    }


    private int player1Score = 0;
    private int player2Score = 0;

    private TennisGame_AdvantageRule advantageRule = new TennisGame_AdvantageRule();
    private TennisGame_WinRule       winRule       = new TennisGame_WinRule();

    private TennisGame_RunningScoreRule runningScoreRule = new TennisGame_RunningScoreRule();

    public String getScore()
    {
        if (winRule.applicableFor(player1Score, player2Score))
            return winRule.apply(player1Score, player2Score);
        if (advantageRule.applicableFor(player1Score, player2Score))
            return advantageRule.apply(player1Score, player2Score);

        if (runningScoreRule.applicableFor(player1Score, player2Score))
            return runningScoreRule.apply(player1Score, player2Score);

        if (player1Score == player2Score) return ALL_SCORES.getOrDefault(player1Score, "Deuce");
        throw new RuntimeException("You f-ed up the code!");
    }

    public void wonPoint(String playerName)
    {
        if (playerName == "player1") player1Score += 1;
        else player2Score += 1;
    }

}

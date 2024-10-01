import java.util.*;

public class TennisGame_RunningScoreRule
{
    private static Map<Integer, String> SINGLE_SCORES = new HashMap<>();

    static {
        SINGLE_SCORES.put(0, "Love");
        SINGLE_SCORES.put(1, "Fifteen");
        SINGLE_SCORES.put(2, "Thirty");
        SINGLE_SCORES.put(3, "Forty");
    }

    private TennisGame_AdvantageRule advantageRule = new TennisGame_AdvantageRule();
    private TennisGame_WinRule       winRule       = new TennisGame_WinRule();

    public String apply(int player1Score,
                        int player2Score)
    {
        boolean scoresAreEqual = player1Score == player2Score;
        if (winRule.applicableFor(player1Score, player2Score)) return winRule.apply(player1Score, player2Score);
        if (advantageRule.applicableFor(player1Score, player2Score)) return advantageRule.apply(player1Score, player2Score);
        if (scoresAreEqual && player1Score >= 3) return "Deuce";
        return "%s-%s".formatted(SINGLE_SCORES.get(player1Score), scoresAreEqual ? "All" : SINGLE_SCORES.get(player2Score));
    }
}

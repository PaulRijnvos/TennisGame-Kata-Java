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

    /**
     * This rule is applicable if:
     * - Allways ?!?
     */
    public boolean applicableFor(int player1Score,
                                 int player2Score)
    {
//        boolean scoresAreNotHigherThan3 = player1Score <= 3 && player2Score <= 3;
        return true;
    }

    public String apply(int player1Score,
                        int player2Score)
    {
        boolean scoresAreEqual = player1Score == player2Score;
        if (scoresAreEqual && player1Score >= 3) return "Deuce";
        return "%s-%s".formatted(
                SINGLE_SCORES.get(player1Score),
                scoresAreEqual ? "All" : SINGLE_SCORES.get(player2Score));
    }
}

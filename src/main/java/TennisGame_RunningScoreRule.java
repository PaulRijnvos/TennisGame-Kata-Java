import java.util.*;

public class TennisGame_RunningScoreRule
{   private static Map<Integer, String> SINGLE_SCORES = new HashMap<>();
    static {
        SINGLE_SCORES.put(0, "Love");
        SINGLE_SCORES.put(1, "Fifteen");
        SINGLE_SCORES.put(2, "Thirty");
        SINGLE_SCORES.put(3, "Forty");

    }
    /**
     * This rule is applicable if:
     * - the scores are not equal
     * - the scores are not higher than 3
     */
    public boolean applicableFor(int player1Score,
                                 int player2Score)
    {
        boolean scoresAreNotEqual = player1Score != player2Score;
        boolean scoresAreNotHigherThan3 = player1Score <=3 && player2Score <=3;
        return scoresAreNotEqual && scoresAreNotHigherThan3;
    }

    public String apply(int player1Score,
                        int player2Score)
    {
        return "%s-%s".formatted(SINGLE_SCORES.get(player1Score), SINGLE_SCORES.get(player2Score));
    }
}

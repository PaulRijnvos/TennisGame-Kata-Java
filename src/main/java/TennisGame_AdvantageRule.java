public class TennisGame_AdvantageRule
{
    /**
     * This rule is applicable if:
     * - each side has scored at least 3 points
     * - there is 1 point difference
     */
    public boolean applicableFor(int player1Score,
                                 int player2Score)
    {
        boolean eachSideHasScoredAtLeast3Points = player1Score >= 3 && player2Score >= 3;
        boolean thereIs1PointDifference = Math.abs(player1Score - player2Score) ==1;
        return eachSideHasScoredAtLeast3Points && thereIs1PointDifference;
    }

    public String apply(int player1Score,
                        int player2Score)
    {
        return "Advantage %s".formatted(player1Score > player2Score ? "player1" : "player2");
    }
}

public class TennisGame_WinRule
{
    /**
     * This rule is applicable if:
     * - there is a player with at least 4 points
     * - there is at least 2 points difference
     */
    public boolean applicableFor(int player1Score,
                                 int player2Score)
    {
        boolean playerWithAtLeast4Points = player1Score >= 4 || player2Score >= 4;
        boolean atLeast2PointsDifference = Math.abs(player1Score - player2Score) >= 2;
        return playerWithAtLeast4Points && atLeast2PointsDifference;
    }

    public String apply(int player1Score,
                        int player2Score)
    {
        return "Win for %s".formatted(player1Score > player2Score ? "player1" : "player2");
    }
}

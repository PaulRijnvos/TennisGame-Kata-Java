public class TennisGame1 implements TennisGame
{
    private int player1Score = 0;
    private int player2Score = 0;


    private TennisGame_RunningScoreRule runningScoreRule = new TennisGame_RunningScoreRule();

    public String getScore()
    {
        return runningScoreRule.apply(player1Score, player2Score);
    }

    public void wonPoint(String playerName)
    {
        if (playerName == "player1") player1Score += 1;
        else player2Score += 1;
    }

}

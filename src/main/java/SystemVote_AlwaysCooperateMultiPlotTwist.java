public class SystemVote_AlwaysCooperateMultiPlotTwist implements ISystemVote {
    Integer adversaryCooperateCount;
    Integer adversaryBetrayCount;
    VoteAnswer currentReturn;

    public SystemVote_AlwaysCooperateMultiPlotTwist() {
        this.adversaryCooperateCount = 0;
        currentReturn = VoteAnswer.cooperate;
    }

    public VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        if (lastAdversaryAnswer == VoteAnswer.cooperate) {
            adversaryCooperateCount++;
            adversaryBetrayCount = 0;
            if (adversaryCooperateCount == 2 && currentReturn != VoteAnswer.betray) {
                System.out.println("\n\tPlot twist ! Now i'm gonna betray mouahhahah");
                currentReturn = VoteAnswer.betray;
            }
        }

        if (lastAdversaryAnswer == VoteAnswer.betray) {
            adversaryBetrayCount++;
            adversaryCooperateCount = 0;
            if (adversaryBetrayCount == 2 && currentReturn != VoteAnswer.cooperate) {
                System.out.println("\n\tPlot twist ! Now i'm gonna cooperate mouahhahah");
                currentReturn = VoteAnswer.cooperate;
            }
        }

        return currentReturn;
    }
}

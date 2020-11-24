public class SystemVote_AlwaysCooperateTreator implements ISystemVote {
    Integer adversaryCooperateCount;

    public SystemVote_AlwaysCooperateTreator() {
        this.adversaryCooperateCount = 0;
    }

    public VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        if (lastAdversaryAnswer == VoteAnswer.cooperate) {
            adversaryCooperateCount++;
            if (adversaryCooperateCount == 2) {
                System.out.println("\n\tPlot twist ! Now i'm gonna betray mouahhahah");
            }
        }
        if (adversaryCooperateCount > 1) {
            return VoteAnswer.betray;
        }
        return VoteAnswer.cooperate;
    }
}

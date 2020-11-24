public class SystemVote_CooperateThenBetray implements ISystemVote {

    public VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        if (iteration == 1) {
            return VoteAnswer.cooperate;
        }
        return VoteAnswer.betray;
    }
}

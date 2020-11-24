public class SystemVote_AlwaysBetray implements ISystemVote {

    public VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        return VoteAnswer.betray;
    }
}

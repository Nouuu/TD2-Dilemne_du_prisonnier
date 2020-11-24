public class SystemVote_AlwaysCooperate implements ISystemVote {

    public VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        return VoteAnswer.cooperate;
    }
}

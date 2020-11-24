public class SystemVote_CooperateThenBetrayAtEnd implements ISystemVote {

    public VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        if (iteration < lastIteration) {
            return VoteAnswer.cooperate;
        }
        return VoteAnswer.betray;
    }
}

public class SystemVote_SamePreviousAdversaryAnswer implements ISystemVote {

    public VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        if (lastAdversaryAnswer != null) {
            return lastAdversaryAnswer;
        }
        return VoteAnswer.cooperate;
    }
}

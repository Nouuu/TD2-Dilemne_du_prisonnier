public interface ISystemVote {
    VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration);
}

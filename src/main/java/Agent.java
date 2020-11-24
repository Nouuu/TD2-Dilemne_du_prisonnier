public class Agent {
    public String agentName;
    public Float currentBounty;
    ISystemVote agentVoteSystem;

    public Agent(String agentName) {
        currentBounty = 0f;
        this.agentName = agentName;
    }

    public void AddVoteSystem(ISystemVote agentVoteSystem) {
        this.agentVoteSystem = agentVoteSystem;
    }

    VoteAnswer ComputeVote(int iteration, VoteAnswer lastAdversaryAnswer, int lastIteration) {
        VoteAnswer return_a = agentVoteSystem.ComputeVote(iteration, lastAdversaryAnswer, lastIteration);
        if (agentName != null) {
            System.out.println("\t" + agentName + " return " + return_a);
        }

        return return_a;
    }

    public void addReward(Float reward) {
        currentBounty += reward;
    }
}

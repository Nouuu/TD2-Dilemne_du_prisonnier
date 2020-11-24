public class mainClass {
    public static void main(String[] args) {
        int iteration = 4;

        Agent agent1 = new Agent("Agent 1");
        agent1.AddVoteSystem(new SystemVote_CooperateThenBetrayAtEnd());
        VoteAnswer previousAgent1Answer = null;

        Agent agent2 = new Agent("Agent 2");
        agent2.AddVoteSystem(new SystemVote_AlwaysCooperateTreator());
        VoteAnswer previousAgent2Answer = null;


        for (int i = 1; i <= iteration; i++) {
            System.out.println("Iteration " + i);
            previousAgent1Answer = agent1.ComputeVote(i, previousAgent2Answer, iteration);
            previousAgent2Answer = agent2.ComputeVote(i, previousAgent1Answer, iteration);

            if (previousAgent1Answer == previousAgent2Answer) {
                if (previousAgent1Answer == VoteAnswer.cooperate) {
                    System.out.println("Both cooperate case");
                    agent1.addReward(10f);
                    agent2.addReward(10f);
                } else {
                    System.out.println("Both betray case");
                }
            } else {
                if (previousAgent1Answer == VoteAnswer.cooperate) {
                    System.out.println("Agent 1 betrayed by Agent 2 case");
                    agent2.addReward(20f);
                } else {
                    System.out.println("Agent 2 betrayed by Agent 1 case");
                    agent1.addReward(20f);
                }
            }
            System.out.println("Current score : Agent1 = " + agent1.currentBounty +
                    ", Agent2 = " + agent2.currentBounty);
        }

    }
}

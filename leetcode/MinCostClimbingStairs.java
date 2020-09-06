class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] mem = {0, 0};
        
        for(int i = cost.length-1; i >= 0; i --) {
            int currentCost = cost[i] + Math.min(mem[0], mem[1]);
            mem[0] = mem[1];
            mem[1] = currentCost;
        }
        
        return Math.min(mem[0], mem[1]);
    }
    
    public int minCostClimbingStairsByModification(int[] cost) {
        for(int i = 2; i < cost.length; i ++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}

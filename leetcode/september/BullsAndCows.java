class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] map = new int[10];
        
        for(int index = 0; index < secret.length(); index ++) {
            int sIndex = secret.charAt(index) - '0';
            int gIndex = guess.charAt(index) - '0';
            
            if(sIndex == gIndex) { bull ++; }
            else {
                if(map[sIndex] ++ < 0) { cow ++; }
                if(map[gIndex] -- > 0) { cow ++; }
            }
        }
        
        return bull + "A" + cow + "B";
    }
}

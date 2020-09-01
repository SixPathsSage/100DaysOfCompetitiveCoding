// https://leetcode.com/problems/largest-time-for-given-digits/
class Solution {
    int maxMinutes = -1;
    public String largestTimeFromDigits(int[] A) {
        permute(A, 0);
        return stringify(); 
    }
    
    private String stringify() {
        if(maxMinutes == -1) {
            return "";
        }
        
        int hours = maxMinutes / 60;
        int minutes = maxMinutes % 60;
        
        return String.format("%02d:%02d", hours, minutes);
    }
    
    private void permute(int[] array, int position) {
        if(position == array.length) {
            processTime(array);
            return;
        }
        
        for(int index = position; index < array.length; index ++) {
            swap(array, position, index);
            permute(array, position+1);
            swap(array, position, index);
        }
    }
    
    private void processTime(int[] array) {
        int hours = (array[0] * 10) + array[1];
        int minutes = (array[2] * 10) + array[3];
        
        if(hours < 24 && minutes < 60) {
            int totalMinutes = (hours * 60) + minutes;
            maxMinutes = Integer.max(maxMinutes, totalMinutes);
        }
    }
    
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

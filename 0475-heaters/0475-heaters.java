class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0; 
        int radius = 0;

        for (int house : houses) {
            
            while (i < heaters.length - 1 &&
                   Math.abs(heaters[i + 1] - house) <= Math.abs(heaters[i] - house)) {
                i++;
            }

            int distance = Math.abs(heaters[i] - house);
            radius = Math.max(radius, distance);
        }

        return radius;
    }
}
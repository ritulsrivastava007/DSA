class Solution {
    public int minNumberOfHours(int initialEnergy,int initialExperience,int[] energy,int[] experience){
        int sumEnergy = 0;
        for (int e : energy) {
            sumEnergy += e;
        }
        int training = Math.max(0, sumEnergy + 1 - initialEnergy);
        int exp = initialExperience;
        for (int e : experience) {
            if (exp <= e) {
                training += e + 1 - exp;
                exp = e + 1;
            }
            exp += e;
        }
        return training;
    }
}
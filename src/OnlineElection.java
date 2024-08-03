import java.util.HashMap;

public class OnlineElection {
    int[] votes;
    int[] times;

    public OnlineElection(int[] persons, int[] times) {
        this.votes = new int[persons.length];
        this.times = times;
        HashMap<Integer, Integer> map = new HashMap<>();
        int highest = 0;
        for(int i = 0; i < persons.length; i++){
            int vote = map.getOrDefault(persons[i], 0);
            vote += 1;
            map.put(persons[i], vote);

            if(vote > highest){
                highest = vote;
            }
        }
    }

    public int q(int t) {
        int low = 0;
        int high = this.times.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(times[mid] == t){return votes[mid];}
            else if(votes[mid] > t){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return votes[high];
    }
}

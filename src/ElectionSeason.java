import java.util.HashMap;

public class ElectionSeason {
    public String findWinner(String[] votes){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int highest = 0;
        String name = votes[0];
        for(String vote : votes){
            int currentVote = map.getOrDefault(vote, 0);
            currentVote++;
            map.put(vote, currentVote);
            if(highest < currentVote){
                highest = currentVote;
                name = vote;
            }
        }

        return name;
    }

    public static void main(String[] args) {
        ElectionSeason season = new ElectionSeason();
        System.out.println(season.findWinner(new String[]{"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"}));
    }
}

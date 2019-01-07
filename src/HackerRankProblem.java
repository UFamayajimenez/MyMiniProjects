import java.util.*;

public class HackerRankProblem {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aScore = 0;
        int bScore = 0;

        ArrayList<Integer> finalScore = new ArrayList<Integer>(2);

        for(int i = 0; i < 3; i++){
            if(a.get(i) > b.get(i)){
                aScore++;
            }
            else if(a.get(i) < b.get(i)){
                bScore++;
            }
        }
        finalScore.add(aScore);
        finalScore.add(bScore);

        return finalScore;
    }

    public static void main(String[] args){

        ArrayList<Integer> aEval = new ArrayList<Integer>(3);
        aEval.add(5);
        aEval.add(6);
        aEval.add(7);

        ArrayList<Integer> bEval = new ArrayList<Integer>(3);
        bEval.add(3);
        bEval.add(6);
        bEval.add(10);

        System.out.print(compareTriplets(aEval, bEval).get(0));
        System.out.print(compareTriplets(aEval, bEval).get(1));



    }







}

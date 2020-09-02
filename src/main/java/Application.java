import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> rankList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            rankList.add(0);
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supoja1[i % supoja1.length]) {
                rankList.set(0, rankList.get(0) + 1);
            }
            if (answers[i] == supoja2[i % supoja2.length]) {
                rankList.set(1, rankList.get(1) + 1);
            }
            if (answers[i] == supoja3[i % supoja3.length]) {
                rankList.set(2, rankList.get(2) + 1);
            }
        }

        int max = Collections.max(rankList);

        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < rankList.size(); i++) {
            if (max == rankList.get(i)) {
                answerList.add(i+1);
            }
        }
        answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
}

    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        solution(answers);
    }
}


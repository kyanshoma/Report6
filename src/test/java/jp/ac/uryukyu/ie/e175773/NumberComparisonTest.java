package jp.ac.uryukyu.ie.e175773;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberComparisonTest {
    public int numberComparison(int[] answer, int[] array) {
        int eat_number = 0;
        int bite_number = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == answer[j] && i == j) {
                    eat_number = eat_number + 1;
                }
                if (array[i] == answer[j]) {
                    bite_number = bite_number + 1;
                }
            }
        }

        return eat_number;
    }

    @Test
    void numberComparisonTest() {
        /**
         * 配列の数字と順番が一致していたら、返り値として3を返す。
         * 配列の数字か変わってたり、数字が同じでも場所が異なってたりしていたらテストに失敗する。
         */
        int array[] = {1,2,3};
        int answer[] = {1,2,3};
        int return_score;
        return_score=numberComparison(array,answer);
        assertEquals(3,return_score);
    }
}
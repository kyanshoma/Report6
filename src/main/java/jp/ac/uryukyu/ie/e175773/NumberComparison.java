package jp.ac.uryukyu.ie.e175773;

class NumberComparison {
    public int numberComparison(int[] answer, int[] array) {
        /**
         * @param eat_number 数字と順番両方とも一致している個数
         * @param bite_number 数字のみが一致している個数
         */
        int eat_number = 0;
        int bite_number = 0;

        /**
         * 入力した配列とランダムで生成した答えの配列を比較し、数字と配列の添字(順番)がともに一致している場合はeat_numberに、
         * 数字のみが一致している場合はbite_numberにカウントをしていく
         * @return int型
         */

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
        System.out.println("EAT (数字と順番両方とも一致している個数): " + eat_number);
        System.out.println("BITE(数字のみが一致している個数):        " + bite_number);
        System.out.println();

        return eat_number;
    }
}


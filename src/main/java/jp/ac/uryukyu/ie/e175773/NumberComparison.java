package jp.ac.uryukyu.ie.e175773;

class NumberComparison {
    public int numberComparison(int[] answer, int[] array) {
        int eat_number = 0;
        int bite_number = 0;
        NumberComparison nc = new NumberComparison();
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


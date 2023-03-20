package ru.netology;

public class AfishaManager {

    private String[] movies = new String[0];
    private int limit;

    public AfishaManager() {
        this.limit = 10;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }


    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAllMovie() {
        return movies;

    }

    public String[] findLastMovie() {
        int answerLength;
        if (movies.length < limit) {
            answerLength = movies.length;
        } else {
            answerLength = limit;
        }

        String[] answer = new String[answerLength];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = movies[movies.length - 1 - i];
        }
        return answer;
    }
}



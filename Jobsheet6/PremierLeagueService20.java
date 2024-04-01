package Jobsheet6;

public class PremierLeagueService20 {
    PremierLeague20[] leagues = new PremierLeague20[20];
    int id = 0;

    void add(PremierLeague20 pl) {
        if (id < leagues.length) {
            leagues[id] = pl;
            id++;
        } else {
            System.out.println("List is full");
        }
    }

    void displayAll() {
        for (PremierLeague20 premierLeague : leagues) {
            if (premierLeague != null) {
                premierLeague.print();
            }
        }
    }

    void insertionSort(boolean asc) {
        for (int i = 1; i < leagues.length; i++) {
            PremierLeague20 tmp = leagues[i];
            int j = i;
            if (asc) {
                while (j > 0 && leagues[j - 1].points < tmp.points) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && leagues[j - 1].points > tmp.points) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
            }
            leagues[j] = tmp;
        }
    }
}
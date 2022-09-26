public class PosterManager {
    private PosterData[] posters = new PosterData[0];
    private int countPostersByDef = 2;

    public PosterManager(int count) {
        countPostersByDef = count;
    }

    public PosterManager() {

    }

    public void savePoster(PosterData poster) {
        PosterData[] tmp = new PosterData[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public PosterData[] findAll() {
/*
        PosterData[] firstByDef = new PosterData[countPostersByDef];
        if (posters.length <= countPostersByDef) {
*/
            return posters;
/*        } else {
            for (int i = 0; i < firstByDef.length; i++) {
                firstByDef[i] = posters[i];
            }
            return firstByDef;
        }*/


    }

    public PosterData[] findLast() {
        if (posters.length <= countPostersByDef) {
            PosterData[] lastByDef = new PosterData[posters.length];
            int index = 0;
            for (int i = 0; i < posters.length; i++) {
                lastByDef[i] = posters[posters.length - index];
                index++;
            }
            return  lastByDef;
        } else {
            PosterData[] lastByDef = new PosterData[countPostersByDef];
            int index = 0;
            for (int i = 0; i < countPostersByDef; i++) {
                lastByDef[i] = posters[countPostersByDef - 1 - index];
                index++;
            }
            return  lastByDef;
        }
    }
    }

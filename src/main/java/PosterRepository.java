public class PosterRepository {
    private PosterData[] posters = new PosterData[0];

    public void save(PosterData poster) {
        PosterData[] tmp = new PosterData[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public PosterData[] findAll() {
        return posters;

    }

    public PosterData[] findById(int id) {
        PosterData[] tmp = new PosterData[1];
        for (PosterData poster : posters) {
            if (poster.getId() == id) {
                tmp[0] = poster;
            }
        }
        return tmp;
    }

    public void removeById(int id) {
        PosterData[] tmp = new PosterData[posters.length - 1];
        int index = 0;
        for (PosterData poster : posters) {
            if (poster.getId() != id) {
                tmp[index] = poster;
                index++;
            }

        }
        posters = tmp;
    }

    public void removeAll() {
        PosterData[] tmp = new PosterData[0];
        posters = tmp;
    }

}

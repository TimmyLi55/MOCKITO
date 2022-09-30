public class PosterManager {
    private PosterRepository repo;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;

    }

    public void add(PosterData poster) {
        repo.save(poster);
    }

    public PosterData[] showAll() {
        return repo.findAll();
    }

    public void removeAll() {
        repo.removeAll();
    }
}

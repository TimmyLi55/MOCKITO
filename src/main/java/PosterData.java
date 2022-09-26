public class PosterData {
    private int id;
    private String name;
    private int year;

    public PosterData(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}



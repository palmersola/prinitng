package objectsInLists;

public class TvShow {
    private final String name;
    private final int episodes;
    private final String genre;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getEpisodes() + " episodes. The genre is " + getGenre();
    }


}

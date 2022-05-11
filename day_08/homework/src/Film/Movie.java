package Film;

import Film.Film;

public class Movie extends Film {

    private String runningTime;

    public Movie() {
    }

    public Movie(int id, String title, String genre, String director, String releaseDate, String runningTime) {
        super(id, title, genre, director, releaseDate);
        this.runningTime = runningTime;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    @Override
    public String toString(){
        return "#Id: " + super.getId() + "\t#" + "Title: " + super.getTitle() + "\t#" + "Category: " + super.getGenre() + "\t#" + "Author: " + super.getDirector()+ "\t#" + "ReleaseDate: " + super.getReleaseDate() + "\t#" + "Time: " + this.runningTime;
    }



}

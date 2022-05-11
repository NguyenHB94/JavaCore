package Film;

import Film.Film;

public class Serial extends Film {

    private int episode;
    private String avgRunningTime;


    public Serial() {
    }

    public Serial(int id, String title, String genre, String director, String releaseDate, int episode, String avgRunningTime) {
        super(id, title, genre, director, releaseDate);
        this.episode = episode;
        this.avgRunningTime = avgRunningTime;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getAvgRunningTime() {
        return avgRunningTime;
    }

    public void setAvgRunningTime(String avgRunningTime) {
        this.avgRunningTime = avgRunningTime;
    }

//    chưa biết tại sao in ra mảng tab giữa các thuộc tính không đều >> xấu
    @Override
    public String toString(){
        return "#Id: " + super.getId() + "\t#Title: " + super.getTitle() + "\t#Category: " + super.getGenre() + "\t#Author: " + super.getDirector()+ "\t#ReleaseDate: " + super.getReleaseDate() + "\t#Episode: " + this.episode + "\t#AvgTime: " + this.avgRunningTime;
    }


}

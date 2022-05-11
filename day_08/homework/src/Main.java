import FilmService.FilmService;

public class Main {
    public static void main(String[] args) {
        FilmService filmService = new FilmService();

        filmService.showInfo();

        filmService.findByTitle();

        filmService.findByGenre();


    }
}

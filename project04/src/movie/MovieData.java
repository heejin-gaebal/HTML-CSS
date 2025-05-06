package movie;

public class MovieData {
	public String movieName;
	private String movieDirector;
	private String movieGenre;
	private int movieRate;
	
	public MovieData(String movieName, String movieDirector, String movieGenre, int movieRate) {
		super();
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieGenre = movieGenre;
		this.movieRate = movieRate;
	}

	public MovieData() {
		super();
	}

	//movieName
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	//movieDirector
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	//movieGenre
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	//movieRate
	public int getMovieRate() {
		return movieRate;
	}
	public void setMovieRate(int movieRate) {
		this.movieRate = movieRate;
	}

	@Override
	public String toString() {
		return "| 영화제목 | 영화감독 | 영화장르 | 리뷰별점 |\n"
	+ "| " + movieName + " |   " + movieDirector + "  |  " 
				+ movieGenre + "  |   " + movieRate + "   |\n";
	}
}

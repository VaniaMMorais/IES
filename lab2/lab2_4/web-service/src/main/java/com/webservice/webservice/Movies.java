package main.java.com.webservice.webservice;

public class Movies {
    private int id;
	private String quote;
    private String title;
	private String name;

	public Movie(int id, String title, String quote, String name) {
		this.id = id;
		this.quote = quote;
        this.title = title;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getQuote() {
		return this.quote;
	}

	public String getName() {
		return this.name;
	}

    public String getTitle() {
		return this.title;
	}
}

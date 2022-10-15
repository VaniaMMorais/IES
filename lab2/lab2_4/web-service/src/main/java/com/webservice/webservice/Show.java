package main.java.com.webservice.webservice;

public class Show {
    private final long id;
    private final String name;
    private final String quote;
    private final String title;
    
    public Show(long id, String title, String quote, String name) {
        this.name = name;
        this.id = id;
        this.quote = quote;
        this.title = title;
    }

    public String getName() {
        return name;
    }
    
    public long getId() {
        return id;
    }

    public String getQuote() {
		return quote;
	}

    public String getTitle() {
		return title;
	}

}

package api_rest_blog;

public class Post {
    private String titulo;
    private String date;

    public Post(){}

    public Post(String titulo, String date) {
        this.titulo = titulo;
        this.date = date;
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDate() {return date;}

    public void setDate(String date) { this.date = date; }
}


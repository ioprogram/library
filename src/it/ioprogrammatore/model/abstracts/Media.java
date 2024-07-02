package it.ioprogrammatore.model.abstracts;

public abstract class Media {
    private String title;
    private String publisher;

    public Media() {
    }

    public Media(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public Media title(String title) {
        this.title = title;
        return this;
    }

    public Media publisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

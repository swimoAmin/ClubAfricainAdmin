package com.clubafricain.clubafricainadmin.Entity;

/**
 * Created by swimo on 04/10/15.
 */
public class News {

    private String image;
    private String title;
    private String desc;
    private String categorie;

    public News() {
    }

    public News(String image, String title, String desc, String categorie) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.categorie = categorie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;

        News news = (News) o;

        if (getImage() != null ? !getImage().equals(news.getImage()) : news.getImage() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(news.getTitle()) : news.getTitle() != null)
            return false;
        if (getDesc() != null ? !getDesc().equals(news.getDesc()) : news.getDesc() != null)
            return false;
        return !(getCategorie() != null ? !getCategorie().equals(news.getCategorie()) : news.getCategorie() != null);

    }

    @Override
    public int hashCode() {
        int result = getImage() != null ? getImage().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getDesc() != null ? getDesc().hashCode() : 0);
        result = 31 * result + (getCategorie() != null ? getCategorie().hashCode() : 0);
        return result;
    }
}

package pl.sebastianstrzalkowski.fishcards.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class FishCard {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String slowo;

    private String komentarz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlowo() {
        return slowo;
    }

    public void setSlowo(String slowo) {
        this.slowo = slowo;
    }

    public String getKomentarz() {
        return komentarz;
    }

    public void setKomentarz(String komentarz) {
        this.komentarz = komentarz;
    }
}
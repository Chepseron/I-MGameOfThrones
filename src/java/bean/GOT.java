package bean;

import com.sun.media.jfxmedia.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.MeterGaugeChartModel;

@ManagedBean(name = "GOT")
@ViewScoped
public class GOT implements Serializable {

    private books book;
    private character characters;
    private houses house;

    private List<character> characterList = new ArrayList<>();
    private List<books> booksList = new ArrayList<>();
    private List<houses> housesList = new ArrayList<>();

    private MeterGaugeChartModel GOTcharactersMeter;

    @ManagedProperty("#{characterService}")
    private characterService character;
    @ManagedProperty("#{housesService}")
    private housesService houses;
    @ManagedProperty("#{booksService}")
    private booksService books;

    @PostConstruct
    public void init() {
        try {
            createMeterGaugeModels();
            setCharacterList(getCharacter().getData());
            setHousesList(getHouses().getData());
            setBooksList(getBooks().getData());
        } catch (Exception ex) {
            Logger.logMsg(0, ex.getMessage());
        }
    }

    public GOT() {
    }

    private void createMeterGaugeModels() {
        setAssignedMeter(GOTcharacters());
    }

    private MeterGaugeChartModel GOTcharacters() {
        List<Number> intervals = new ArrayList() {
        };
        for (int i = 0; i < 200; i++) {
            intervals.add(i + 20);
        }

        return new MeterGaugeChartModel(Integer.valueOf(130), intervals);
    }

    /**
     * @return the character
     */
    public characterService getCharacter() {
        return character;
    }

    public MeterGaugeChartModel getAssignedMeter() {
        return GOTcharactersMeter;
    }

    /**
     * @param character the character to set
     */
    public void setCharacter(characterService character) {
        this.character = character;
    }

    /**
     * @return the houses
     */
    public housesService getHouses() {
        return houses;
    }

    /**
     * @param houses the houses to set
     */
    public void setHouses(housesService houses) {
        this.houses = houses;
    }

    /**
     * @return the books
     */
    public booksService getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(booksService books) {
        this.books = books;
    }

    /**
     * @return the characterList
     */
    public List<character> getCharacterList() {
        return characterList;
    }

    /**
     * @param characterList the characterList to set
     */
    public void setCharacterList(List<character> characterList) {
        this.characterList = characterList;
    }

    /**
     * @return the booksList
     */
    public List<books> getBooksList() {
        return booksList;
    }

    /**
     * @param booksList the booksList to set
     */
    public void setBooksList(List<books> booksList) {
        this.booksList = booksList;
    }

    /**
     * @return the housesList
     */
    public List<houses> getHousesList() {
        return housesList;
    }

    /**
     * @param housesList the housesList to set
     */
    public void setHousesList(List<houses> housesList) {
        this.housesList = housesList;
    }

    /**
     * @return the book
     */
    public books getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(books book) {
        this.book = book;
    }

    /**
     * @return the characters
     */
    public character getCharacters() {
        return characters;
    }

    /**
     * @param characters the characters to set
     */
    public void setCharacters(character characters) {
        this.characters = characters;
    }

    /**
     * @return the house
     */
    public houses getHouse() {
        return house;
    }

    /**
     * @param house the house to set
     */
    public void setHouse(houses house) {
        this.house = house;
    }

    /**
     * @param GOTcharactersMeter the GOTcharactersMeter to set
     */
    public void setAssignedMeter(MeterGaugeChartModel GOTcharactersMeter) {
        this.GOTcharactersMeter = GOTcharactersMeter;
    }

}

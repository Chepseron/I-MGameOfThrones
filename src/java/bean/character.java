package bean;

import org.apache.commons.lang3.StringUtils;

public class character {

    private String url;
    private String name;
    private String gender;
    private String culture;
    private String born;
    private String died;
    private String titles;
    private String aliases;
    private String father;
    private String mother;
    private String spouse;
    private String allegiances;
    private String books;
    private String povBooks;
    private String tvSeries;
    private String playedBy;

    public character(String url, String name, String gender, String culture, String born, String died,
            String titles[], String aliases[], String father, String mother, String spouse,
            String allegiances, String books[], String povBooks[], String tvSeries[], String playedBy[]) {
        super();
        this.name = name;
        this.url = url;
        this.gender = gender;
        this.culture = culture;
        this.born = born;
        this.died = died;
        this.titles = StringUtils.join(titles, "\r\n");
        this.aliases = StringUtils.join(aliases, "\r\n");
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.allegiances = allegiances;

        this.books = StringUtils.join(books, "\r\n");
        this.povBooks = StringUtils.join(povBooks, "\r\n");
        this.tvSeries = StringUtils.join(tvSeries, "\r\n");
        this.playedBy = StringUtils.join(playedBy, "\r\n");
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the culture
     */
    public String getCulture() {
        return culture;
    }

    /**
     * @param culture the culture to set
     */
    public void setCulture(String culture) {
        this.culture = culture;
    }

    /**
     * @return the born
     */
    public String getBorn() {
        return born;
    }

    /**
     * @param born the born to set
     */
    public void setBorn(String born) {
        this.born = born;
    }

    /**
     * @return the died
     */
    public String getDied() {
        return died;
    }

    /**
     * @param died the died to set
     */
    public void setDied(String died) {
        this.died = died;
    }

    /**
     * @return the titles
     */
    public String getTitles() {
        return titles;
    }

    /**
     * @param titles the titles to set
     */
    public void setTitles(String titles) {
        this.titles = titles;
    }

    /**
     * @return the aliases
     */
    public String getAliases() {
        return aliases;
    }

    /**
     * @param aliases the aliases to set
     */
    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    /**
     * @return the father
     */
    public String getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(String father) {
        this.father = father;
    }

    /**
     * @return the mother
     */
    public String getMother() {
        return mother;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(String mother) {
        this.mother = mother;
    }

    /**
     * @return the spouse
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * @param spouse the spouse to set
     */
    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    /**
     * @return the allegiances
     */
    public String getAllegiances() {
        return allegiances;
    }

    /**
     * @param allegiances the allegiances to set
     */
    public void setAllegiances(String allegiances) {
        this.allegiances = allegiances;
    }

    /**
     * @return the books
     */
    public String getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(String books) {
        this.books = books;
    }

    /**
     * @return the povBooks
     */
    public String getPovBooks() {
        return povBooks;
    }

    /**
     * @param povBooks the povBooks to set
     */
    public void setPovBooks(String povBooks) {
        this.povBooks = povBooks;
    }

    /**
     * @return the tvSeries
     */
    public String getTvSeries() {
        return tvSeries;
    }

    /**
     * @param tvSeries the tvSeries to set
     */
    public void setTvSeries(String tvSeries) {
        this.tvSeries = tvSeries;
    }

    /**
     * @return the playedBy
     */
    public String getPlayedBy() {
        return playedBy;
    }

    /**
     * @param playedBy the playedBy to set
     */
    public void setPlayedBy(String playedBy) {
        this.playedBy = playedBy;
    }

}

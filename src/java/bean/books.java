package bean;

import org.apache.commons.lang3.StringUtils;

public class books {

    private String url;
    private String name;
    private String isbn;
    private String authors;
    private String numberOfPages;
    private String publisher;
    private String country;
    private String mediaType;
    private String released;
    private String characters;
    private String povCharacters[];

    public books(String url,
            String name,
            String isbn,
            String authors[],
            String numberOfPages,
            String publisher,
            String country,
            String mediaType,
            String released,
            String characters[],
            String povCharacters[]) {
        super();
        this.name = name;
        this.url = url;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.country = country;
        this.authors = StringUtils.join(authors, "\r\n");
        this.characters = StringUtils.join(characters, "\r\n");
        this.mediaType = mediaType;
        this.released = released;
        this.povCharacters = povCharacters;

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
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the authors
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     * @return the numberOfPages
     */
    public String getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages the numberOfPages to set
     */
    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * @param mediaType the mediaType to set
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * @return the released
     */
    public String getReleased() {
        return released;
    }

    /**
     * @param released the released to set
     */
    public void setReleased(String released) {
        this.released = released;
    }

    /**
     * @return the characters
     */
    public String getCharacters() {
        return characters;
    }

    /**
     * @param characters the characters to set
     */
    public void setCharacters(String characters) {
        this.characters = characters;
    }

    /**
     * @return the povCharacters
     */
    public String[] getPovCharacters() {
        return povCharacters;
    }

    /**
     * @param povCharacters the povCharacters to set
     */
    public void setPovCharacters(String[] povCharacters) {
        this.povCharacters = povCharacters;
    }

}

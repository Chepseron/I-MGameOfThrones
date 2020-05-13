package bean;

import org.apache.commons.lang3.StringUtils;

public class houses {

    private String url;
    private String name;
    private String region;
    private String coatOfArms;
    private String words;
    private String titles[];
    private String seats[];
    private String currentLord;
    private String heir;
    private String overlord;
    private String founded;
    private String founder;
    private String diedOut;
    private String ancestralWeapons;
    private String cadetBranches;
    private String swornMembers[];

    public houses(String url,
            String name,
            String region,
            String coatOfArms,
            String words,
            String titles[],
            String seats[],
            String currentLord,
            String heir,
            String overlord,
            String founded,
            String founder,
            String diedOut,
            String ancestralWeapons[],
            String cadetBranches[],
            String swornMembers[]) {
        super();
        this.name = name;
        this.region = region;
        this.coatOfArms = coatOfArms;
        this.words = words;
        this.titles = titles;
        this.seats = seats;
        this.currentLord = currentLord;
        this.heir = heir;
        this.overlord = overlord;
        this.founded = founded;
        this.founder = founder;
        this.diedOut = diedOut;
        this.ancestralWeapons = StringUtils.join(ancestralWeapons, "\r\n");
        this.cadetBranches = StringUtils.join(cadetBranches, "\r\n");
        this.swornMembers = swornMembers;

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
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the coatOfArms
     */
    public String getCoatOfArms() {
        return coatOfArms;
    }

    /**
     * @param coatOfArms the coatOfArms to set
     */
    public void setCoatOfArms(String coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    /**
     * @return the words
     */
    public String getWords() {
        return words;
    }

    /**
     * @param words the words to set
     */
    public void setWords(String words) {
        this.words = words;
    }

    /**
     * @return the titles
     */
    public String[] getTitles() {
        return titles;
    }

    /**
     * @param titles the titles to set
     */
    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    /**
     * @return the seats
     */
    public String[] getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(String[] seats) {
        this.seats = seats;
    }

    /**
     * @return the currentLord
     */
    public String getCurrentLord() {
        return currentLord;
    }

    /**
     * @param currentLord the currentLord to set
     */
    public void setCurrentLord(String currentLord) {
        this.currentLord = currentLord;
    }

    /**
     * @return the heir
     */
    public String getHeir() {
        return heir;
    }

    /**
     * @param heir the heir to set
     */
    public void setHeir(String heir) {
        this.heir = heir;
    }

    /**
     * @return the overlord
     */
    public String getOverlord() {
        return overlord;
    }

    /**
     * @param overlord the overlord to set
     */
    public void setOverlord(String overlord) {
        this.overlord = overlord;
    }

    /**
     * @return the founded
     */
    public String getFounded() {
        return founded;
    }

    /**
     * @param founded the founded to set
     */
    public void setFounded(String founded) {
        this.founded = founded;
    }

    /**
     * @return the founder
     */
    public String getFounder() {
        return founder;
    }

    /**
     * @param founder the founder to set
     */
    public void setFounder(String founder) {
        this.founder = founder;
    }

    /**
     * @return the diedOut
     */
    public String getDiedOut() {
        return diedOut;
    }

    /**
     * @param diedOut the diedOut to set
     */
    public void setDiedOut(String diedOut) {
        this.diedOut = diedOut;
    }

    /**
     * @return the ancestralWeapons
     */
    public String getAncestralWeapons() {
        return ancestralWeapons;
    }

    /**
     * @param ancestralWeapons the ancestralWeapons to set
     */
    public void setAncestralWeapons(String ancestralWeapons) {
        this.ancestralWeapons = ancestralWeapons;
    }

    /**
     * @return the cadetBranches
     */
    public String getCadetBranches() {
        return cadetBranches;
    }

    /**
     * @param cadetBranches the cadetBranches to set
     */
    public void setCadetBranches(String cadetBranches) {
        this.cadetBranches = cadetBranches;
    }

    /**
     * @return the swornMembers
     */
    public String[] getSwornMembers() {
        return swornMembers;
    }

    /**
     * @param swornMembers the swornMembers to set
     */
    public void setSwornMembers(String[] swornMembers) {
        this.swornMembers = swornMembers;
    }

}

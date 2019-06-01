package com.example.facebookhackerscup;

public class Attraction {
    private String name;
    private int popularity;
    private int noOfTimeVisited;

    /**
     * Gets name
     *
     * @return value of name
     */

    public String getName() {
        return name;
    }

    /**
     * Gets noOfTimeVisited
     *
     * @return value of noOfTimeVisited
     */

    public int getNoOfTimeVisited() {
        return noOfTimeVisited;
    }

    /**
     * Gets popularity
     *
     * @return value of popularity
     */

    public int getPopularity() {
        return popularity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setNoOfTimeVisited(int noOfTimeVisited) {
        this.noOfTimeVisited = noOfTimeVisited;
    }
}


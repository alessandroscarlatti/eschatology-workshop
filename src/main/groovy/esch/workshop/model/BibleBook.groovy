package esch.workshop.model

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 9/7/2018
 */
enum BibleBook implements CodedDescribedType {

    Genesis("GEN", "Genesis"),
    Exodus("EXO", "Exodus")

    private String code;
    private String descriptipon;

    BibleBook(String description, String code) {
        this.descriptipon = description
        this.code = code
    }

    @Override
    String getCode() {
        return name()
    }

    @Override
    String getDescription() {
        return description
    }


    @Override
    public String toString() {
        return name()
    }
}
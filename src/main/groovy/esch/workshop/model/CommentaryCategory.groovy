package esch.workshop.model

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 9/7/2018
 */
enum CommentaryCategory implements CodedDescribedType {

    PreTribulationRapture,
    PostTribulationRapture

    String code
    String description

    @Override
    String getCode() {
        return code
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
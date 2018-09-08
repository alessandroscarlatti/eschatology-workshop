package esch.workshop

import esch.workshop.model.BibleArtifact
import esch.workshop.model.BibleBook
import esch.workshop.repository.BibleArtifactRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 6/9/2018
 */
@SpringBootTest
@Transactional
class AppTest extends Specification {

    @Autowired
    BibleArtifactRepository db

    def "create and retrieve data from db"() {
        when:
            BibleArtifact artifact = new BibleArtifact(
                    book: BibleBook.Genesis,
                    chapter: 1,
                    verse: 1,
                    text: "hey"
            )

            db.save(artifact)

            List<BibleArtifact> result = db.findAll().toList()

        then:
            result.contains(artifact)
    }
}

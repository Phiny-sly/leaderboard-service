package io.turntabl.leaderboardservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ProfileTest {

    @Test
    void checkForSetLanguageLevels(){
        Profile profile = new Profile();
        LanguageLevel languageLevel = new LanguageLevel();
        languageLevel.setName("Phinehas");
        languageLevel.setRank(25);

        profile.setLanguageLevels(List.of(languageLevel));
        Assertions.assertEquals(profile,profile.setLanguageLevels(List.of(languageLevel)));

    }
}

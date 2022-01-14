package io.turntabl.leaderboardservice.controller;

import io.turntabl.leaderboardservice.controller.response.ProfileDto;
import io.turntabl.leaderboardservice.converter.ProfileToProfileDtoConverter;
import io.turntabl.leaderboardservice.model.LanguageLevel;
import io.turntabl.leaderboardservice.model.Profile;
import io.turntabl.leaderboardservice.repository.ProfileRepository;
import io.turntabl.leaderboardservice.service.LeaderboardRepositoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@ExtendWith({MockitoExtension.class})
class LeaderboardFacadeTest {

    @Mock
    ProfileRepository profileRepository;


    @InjectMocks
    LeaderboardFacade leaderboardFacade;

    @Test
    void shouldGetLeaderBoard() {
        Profile profile = new Profile();
        LanguageLevel languageLevel = new LanguageLevel();
        languageLevel.setRank(0)
                     .setName("Itachi");



        profile.setClan("jsos")
                .setHonour(2)
                .setName("Hanson")
                .setId("ss")
                .setOverallRank(0)
                .setLanguageLevels(List.of(languageLevel));

        List<Profile> expectedResponse = List.of(profile);

        Mockito.when(profileRepository.findAll()).thenReturn(List.of(profile));

        Assertions.assertEquals(expectedResponse, leaderboardFacade.getLeaderboard());
    }

}

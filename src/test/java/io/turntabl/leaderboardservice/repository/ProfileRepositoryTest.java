package io.turntabl.leaderboardservice.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ProfileRepositoryTest {

    @Autowired
    ProfileRepository profileRepository;

    @Test
    void profileRepositoryIsNotNull(){
        Assertions.assertThat(profileRepository).isNotNull();
    }

}

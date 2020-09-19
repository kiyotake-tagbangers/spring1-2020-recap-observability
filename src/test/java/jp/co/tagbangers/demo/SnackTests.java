package jp.co.tagbangers.demo;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestConstructor;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author KIYOTA, Takeshi
 */
@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@RequiredArgsConstructor
class SnackTests {

    final TestEntityManager entityManager;

    @Test
    void mapping() {
        Snack snack = new Snack();
        Snack savedSnack = this.entityManager.persistAndFlush(snack);
        assertThat(savedSnack.getId()).isNotNull();
    }
}
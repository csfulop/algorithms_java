package hu.fcs.algorithms;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PermutationTest {
    private final Permutation perm = new Permutation();

    @Test
    void testEmplyList() {
        assertThat(perm.of(emptyList()), is(empty()));
    }

    @Test
    void testSingletonList() {
        assertThat(perm.of(asList(1)), containsInAnyOrder(asList(1)));
    }

    @Test
    void testWithTwoItems() {
        assertThat(
                perm.of(asList(1, 2)),
                containsInAnyOrder(
                        asList(1, 2),
                        asList(2, 1)
                )
        );
    }

    @Test
    void testWithThreeItems() {
        assertThat(
                perm.of(asList(1, 2, 3)),
                containsInAnyOrder(
                        asList(1, 2, 3),
                        asList(1, 3, 2),
                        asList(2, 1, 3),
                        asList(2, 3, 1),
                        asList(3, 1, 2),
                        asList(3, 2, 1)
                )
        );
    }

    @Test
    void testWithSixItems() {
        assertThat(
                perm.of(asList(1, 2, 3, 4, 5, 6)),
                hasSize(1 * 2 * 3 * 4 * 5 * 6));
    }
}

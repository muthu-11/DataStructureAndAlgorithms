package coding.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static coding.challenges.SubstringPermutation.checkInclusion;

class SubstringPermutationTest {

    @Test
    void checkInclusionPositiveUseCase() {
        assertTrue(checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void checkInclusionNegativeUseCase() {
        assertFalse(checkInclusion("ab", "eidboaoo"));
    }
}
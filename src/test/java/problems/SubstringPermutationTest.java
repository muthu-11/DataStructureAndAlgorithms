package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static problems.SubstringPermutation.checkInclusion;

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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserEntryProgramTest {
    @Test
    void testValidUserIds(){
        assertEquals(false, UserEntryProgram.validId("sadf$!23"), "No special Characters");
        assertFalse(UserEntryProgram.validId("sadf$!23"));
    }
}
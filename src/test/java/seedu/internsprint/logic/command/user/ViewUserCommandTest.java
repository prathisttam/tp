package seedu.internsprint.logic.command.user;

import org.junit.jupiter.api.Test;

import seedu.internsprint.model.internship.InternshipList;
import seedu.internsprint.model.userprofile.UserProfile;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ViewUserCommandTest {

    @Test
    void execute_view_outputsCorrectly() {
        UserProfile user = new UserProfile();
        ViewUserCommand viewUserCommand = new ViewUserCommand();
        viewUserCommand.parameters.put("/name", "Nikita");
        viewUserCommand.parameters.put("/pay", "1000");
        viewUserCommand.parameters.put("/ind", "Tech");
        viewUserCommand.parameters.put("/mgoals", "Be rich");
        viewUserCommand.parameters.put("/ygoals", "Be richer");
        viewUserCommand.parameters.put("/c", "Google");
        viewUserCommand.execute(new InternshipList(), user);
        String output = user.toExtendedString();
        assertNotNull(output);
    }
}

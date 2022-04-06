package seedu.address.commons.core;

/**
 * Container for user visible messages.
 */
public class Messages {
    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";
    public static final String MESSAGE_INVALID_CLIENT_DISPLAYED_INDEX = "Please provide a Client index that "
        + "belongs to an existing Client.";
    public static final String MESSAGE_INVALID_CLIENT_NON_POSITIVE_INDEX = "Please provide a positive client "
            + "index";
    public static final String MESSAGE_INVALID_PROCEDURE_DISPLAYED_INDEX =
        "Please provide a Procedure index that belongs to an existing Procedure.";
    public static final String MESSAGE_INVALID_PROCEDURE_NON_POSITIVE_INDEX = "Please provide a positive "
            + "procedure index";
    public static final String MESSAGE_CLIENTS_LISTED_OVERVIEW = "%1$d clients listed!";
}

package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.stage.Stage;
import seedu.address.commons.core.LogsCenter;

import java.util.logging.Logger;

/**
 * Controller for a help page
 */
public class CommandsWindow extends UiPart<Stage> {

    public static final String COMMANDS_BRIEF = "\n  Add: Adds an address" + "\n  Edit: Edit an address"
            + "\n  Delete: Delete an address" + "\n  Clear: Clears the address book"
                    + "\n  Find: Find address" + "\n  List: List all addresses"
                            + "\n  Exit: Exit the address book";
    public static final String COMMANDS_MESSAGE = COMMANDS_BRIEF;

    private static final Logger logger = LogsCenter.getLogger(CommandsWindow.class);
    private static final String FXML = "HelpWindow.fxml";

    @FXML
    private Button copyButton;

    @FXML
    private Label helpMessage;

    /**
     * Creates a new HelpWindow.
     *
     * @param root Stage to use as the root of the HelpWindow.
     */
    public CommandsWindow(Stage root) {
        super(FXML, root);
        helpMessage.setText(COMMANDS_MESSAGE);
    }

    /**
     * Creates a new HelpWindow.
     */
    public CommandsWindow() {
        this(new Stage());
    }

    /**
     * Shows the help window.
     * @throws IllegalStateException
     * <ul>
     *     <li>
     *         if this method is called on a thread other than the JavaFX Application Thread.
     *     </li>
     *     <li>
     *         if this method is called during animation or layout processing.
     *     </li>
     *     <li>
     *         if this method is called on the primary stage.
     *     </li>
     *     <li>
     *         if {@code dialogStage} is already showing.
     *     </li>
     * </ul>
     */
    public void show() {
        logger.fine("Showing help page about the application.");
        getRoot().show();
        getRoot().centerOnScreen();
    }

    /**
     * Returns true if the help window is currently being shown.
     */
    public boolean isShowing() {
        return getRoot().isShowing();
    }

    /**
     * Hides the help window.
     */
    public void hide() {
        getRoot().hide();
    }

    /**
     * Focuses on the help window.
     */
    public void focus() {
        getRoot().requestFocus();
    }
}

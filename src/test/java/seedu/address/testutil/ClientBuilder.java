package seedu.address.testutil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import seedu.address.model.client.Address;
import seedu.address.model.client.Client;
import seedu.address.model.client.Email;
import seedu.address.model.client.Name;
import seedu.address.model.client.Phone;
import seedu.address.model.client.Plan;
import seedu.address.model.procedure.Procedure;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Client objects.
 */
public class ClientBuilder {

    public static final String DEFAULT_NAME = "APPLE";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "apple@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Apple Road, #08-111";
    public static final String DEFAULT_PLAN = "EXPRESS 200MBps";

    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private Plan plan;
    private Set<Tag> tags;
    private List<Procedure> procedures;

    /**
     * Creates a {@code ClientBuilder} with the default details.
     */
    public ClientBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        plan = new Plan(DEFAULT_PLAN);
        tags = new HashSet<>();
        procedures = new ArrayList<>();
    }

    /**
     * Initializes the ClientBuilder with the data of {@code clientToCopy}.
     */
    public ClientBuilder(Client clientToCopy) {
        name = clientToCopy.getName();
        phone = clientToCopy.getPhone();
        email = clientToCopy.getEmail();
        address = clientToCopy.getAddress();
        plan = clientToCopy.getPlan();
        tags = new HashSet<>(clientToCopy.getTags());
        procedures = clientToCopy.getProcedures();
    }

    /**
     * Sets the {@code Name} of the {@code Client} that we are building.
     */
    public ClientBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Client} that we are building.
     */
    public ClientBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Client} that we are building.
     */
    public ClientBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Client} that we are building.
     */
    public ClientBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Client} that we are building.
     */
    public ClientBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code Plan} of the {@code Client} that we are building.
     */
    public ClientBuilder withPlan(String plan) {
        this.plan = new Plan(plan);
        return this;
    }

    /**
     * Sets the {@code procedures} of the {@code Client} that we are building.
     */
    public ClientBuilder withProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
        return this;
    }

    public Client build() {
        return new Client(name, phone, email, address, plan, tags, procedures);
    }
}

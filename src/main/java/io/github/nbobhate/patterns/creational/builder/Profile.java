package io.github.nbobhate.patterns.creational.builder;

public class Profile {

    private String firstName;
    private String lastName;
    private String title;
    private String cellNumber;
    private String emailAddress;

    private Profile(ProfileBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.title = builder.title;
        this.cellNumber = builder.cellNumber;
        this.emailAddress = builder.emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static class ProfileBuilder {
        private String firstName;
        private String lastName;
        private String title;
        private String cellNumber;
        private String emailAddress;

        public ProfileBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProfileBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProfileBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ProfileBuilder withCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public ProfileBuilder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Profile build() {
            return new Profile(this);
        }
    }
}

class ContactService {
    private ContactRepository repository;
    private int idCounter = 1;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public void addContact(String name, String phone, String email) {
        Contact contact = new Contact(idCounter++, name, phone, email);
        repository.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void viewAllContacts() {
        if (repository.getAll().isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for (Contact c : repository.getAll()) {
            c.displayContact();
        }
    }

    public void searchContact(int id) {
        Contact c = repository.findById(id);
        if (c != null) {
            c.displayContact();
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(int id) {
        if (repository.remove(id)) {
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}

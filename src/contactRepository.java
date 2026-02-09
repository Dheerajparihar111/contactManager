import java.util.ArrayList;

class ContactRepository {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public ArrayList<Contact> getAll() {
        return contacts;
    }

    public Contact findById(int id) {
        for (Contact c : contacts) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public boolean remove(int id) {
        Contact c = findById(id);
        if (c != null) {
            contacts.remove(c);
            return true;
        }
        return false;
    }
}

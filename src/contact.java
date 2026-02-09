class Contact {
    private int id;
    private String name;
    private String phone;


    public Contact(int id, String name, String phone/*, String email*/) {
        this.id = id;
        this.name = name;
        this.phone = phone;

    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }


    // Setters
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }


    public void displayContact() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

        System.out.println("----------------------");
    }
}

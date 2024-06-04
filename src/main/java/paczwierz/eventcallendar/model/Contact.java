package paczwierz.eventcallendar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Represents a contact with fields for id, name, surname, email, phone, category, and shoesize.
 */

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String category;
    private int shoesize;

    // Constructors, Getters, and Setters
    public Contact() {
    }


    public Contact(Long id, String name, String surname, String email, String phone, String category) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.category = category;
        this.shoesize = shoesize;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCategory() { return category; }

    public int getShoesize() { return shoesize; }
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setShoesize(int shoesize) { this.shoesize = shoesize; }
}
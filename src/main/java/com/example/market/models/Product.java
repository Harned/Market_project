package com.example.market.models;

public class Product {
    private Long id;
    private String title;
    private String description;
    private int price;
    private String location;
    private String person;

    public Product() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }

    public String getLocation() {
        return this.location;
    }

    public String getPerson() {
        return this.person;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Product)) return false;
        final Product other = (Product) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        if (this.getPrice() != other.getPrice()) return false;
        final Object this$location = this.getLocation();
        final Object other$location = other.getLocation();
        if (this$location == null ? other$location != null : !this$location.equals(other$location)) return false;
        final Object this$person = this.getPerson();
        final Object other$person = other.getPerson();
        if (this$person == null ? other$person != null : !this$person.equals(other$person)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Product;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        result = result * PRIME + this.getPrice();
        final Object $location = this.getLocation();
        result = result * PRIME + ($location == null ? 43 : $location.hashCode());
        final Object $person = this.getPerson();
        result = result * PRIME + ($person == null ? 43 : $person.hashCode());
        return result;
    }

    public String toString() {
        return "Product(title=" + this.getTitle() + ", description=" + this.getDescription() + ", price=" + this.getPrice() + ", location=" + this.getLocation() + ", person=" + this.getPerson() + ")";
    }
}


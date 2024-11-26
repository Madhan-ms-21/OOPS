package org.self.oops.Collections.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {

    private String title;
    private int isbn;
    private int price;

    @Override
    public int hashCode(){
        return this.isbn*100 + this.price;
    }

    @Override
    public String toString() {
        return "Book {title='" + title + "', isbn='" + isbn + "', price='" + price + "' }";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return this.isbn == book.isbn ;
    }

}

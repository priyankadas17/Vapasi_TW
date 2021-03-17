package oopsDesign;

import java.util.List;

public class Library {

    List<Books> libBook;
    List<Staff> libStaff;
    List<Furniture> libFurniture;


	public Library() {
	}

    public Library(List<Books> libBook, List<Staff> libStaff, List<Furniture> libFurniture) {
        this.libBook = libBook;
        this.libStaff = libStaff;
        this.libFurniture = libFurniture;
    }

    public List<Books> getLibBook() {
        return this.libBook;
    }

    public void setLibBook(List<Books> libBook) {
        this.libBook = libBook;
    }

    public List<Staff> getLibStaff() {
        return this.libStaff;
    }

    public void setLibStaff(List<Staff> libStaff) {
        this.libStaff = libStaff;
    }

    public List<Furniture> getLibFurniture() {
        return this.libFurniture;
    }

    public void setLibFurniture(List<Furniture> libFurniture) {
        this.libFurniture = libFurniture;
    }
}

package oopsDesign;

import oopsDesign.Department;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class College {

	
	public College() {
	}

	public static int getBooksCount(Department dept) {
		return dept.getDeptLib().getLibBook().size();
	}

	public static int getRentedBooksCount(Department dept) {
		for(int i=0;i<dept.getDeptLib().getLibBook().size();i++){
			if(dept.getDeptLib().getLibBook().get(i).isBookRented==true){
				Books.countBookRented++;
			}
		}
		return Books.countBookRented;
	}

	private static int getChairCount(Library lib) {
		int temp = 0;
		for(int i = 0; i<lib.getLibFurniture().size(); i++) {
			switch(lib.getLibFurniture().get(i).furnitureType) {
			case "Chair":
				temp = lib.getLibFurniture().get(i).getNoOfChair();
				lib.getLibFurniture().get(i).setNoOfChair(temp++);
				break;
			}
		}
		return temp;
	}
	
	private static int getStaffCount(Library lib) {
		return lib.getLibStaff().size();
	}
	
	private static Staff getEldestStaff(Library lib) {
		int maxAge = 0;
		Staff eldestStaffMember = new Staff();
		for (int i = 0; i<lib.getLibStaff().size(); i++) {
			if (lib.getLibStaff().get(i).getStaffAge() > maxAge) {
				maxAge = lib.getLibStaff().get(i).getStaffAge();
				eldestStaffMember = lib.getLibStaff().get(i);
			}
		}
		return eldestStaffMember;
	}
	
	public static void main(String[] args) {
		Library artsLib;
		Library engLib;
		MusicRoom artsMusicRoom;
		Lab engLab;
		Books engBook1 = new Books("isbn1", "EngBookName1", "Author1", true);
		Books engBook2 = new Books("isbn2", "EngBookName2", "Author2", false);
		Books artsBook1 = new Books("isbn1", "BookName1", "Author1", false);
		Books artsBook2 = new Books("isbn2", "BookName2", "Author2", false);
		
		Staff staff1 = new Staff("FirstName1", "LastName1",32);
		Staff staff2 = new Staff("FirstName2", "LastName2",40);
		Staff staff3 = new Staff("FirstName3", "LastName3",33);
		Staff staff4 = new Staff("FirstName4", "LastName4",30);
		
		Furniture furnLib1 = new Furniture("Chair", "Wood");
		Furniture furnLib2 = new Furniture("Racks", "Wood");
		Furniture furnLib3 = new Furniture("Tables", "Wood");
		Furniture furnLib4 = new Furniture("Chair", "Wood");
		
		Department artsDept;
		Department engDept;
		
		List<Books> engBooksList = new ArrayList<>();
		List<Books> artsBooksList = new ArrayList<>();
		
		List<Staff> engStaffList = new ArrayList<>();
		List<Staff> artsStaffList = new ArrayList<>();
		
		List<Furniture> engFurnitureList = new ArrayList<>();
		List<Furniture> artsFurnitureList = new ArrayList<>();

		engBooksList.add(engBook1);
		engBooksList.add(engBook2);
		
		artsBooksList.add(artsBook1);
		artsBooksList.add(artsBook2);
		
		engStaffList.add(staff1);
		engStaffList.add(staff2);
		
		artsStaffList.add(staff4);
		artsStaffList.add(staff3);
		
		engFurnitureList.add(furnLib1);
		engFurnitureList.add(furnLib2);
		
		artsFurnitureList.add(furnLib4);
		artsFurnitureList.add(furnLib2);
		

		engLib = new Library(engBooksList, engStaffList , engFurnitureList);
		artsLib = new Library(artsBooksList, artsStaffList, artsFurnitureList);
		
		artsMusicRoom = new MusicRoom();
		engLab = new Lab();

		artsDept = new Department("Art", artsLib, artsMusicRoom);
		engDept = new Department("Engineering", engLib, engLab);

		System.out.println("Total number of books available in College : " + (getBooksCount(artsDept) + getBooksCount(engDept)));

		System.out.println("Total books rented : " + (getRentedBooksCount(artsDept) + getRentedBooksCount(engDept)));
        
        System.out.println("Total count of chair : " + (getChairCount(engLib) + getChairCount(artsLib)));
        
        System.out.println("Total count of staff : " + (getStaffCount(engLib) + getStaffCount(artsLib))) ;
        
        System.out.println("Eldest member working in Library : " + getEldestStaff(engLib).getStaffFName() + " " + getEldestStaff(engLib).getStaffLName());
	}




}

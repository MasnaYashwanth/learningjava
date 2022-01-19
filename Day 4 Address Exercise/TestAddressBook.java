package Address;

public class TestAddressBook {
	AddressBook addressList = new AddressBook();

	public void populteBook() {
		SingleAddress singleaddress = new SingleAddress("Yashwanth", "Masna", "Main Road", "Miryalguda", "telangana",
				"India", 508207);
		SingleAddress singleaddress1 = new SingleAddress("Yashvanth", "Thokula", "Bangalore City", "Bangalore",
				"Karnataka", "India", 560004);
		SingleAddress singleaddress2 = new SingleAddress("Shyam", "Prasad", "Munugode", "Nalgonda", "telangana",
				"India", 508244);
		addressList.listOfAddress.add(singleaddress);
		addressList.listOfAddress.add(singleaddress1);
		addressList.listOfAddress.add(singleaddress2);
		System.out.println(singleaddress.toString());
	}

	public static void main(String[] args) {
		TestAddressBook testBook = new TestAddressBook();
		testBook.populteBook();
		System.out.println(testBook.addressList.listOfAddress);
		SingleAddress singleaddress = new SingleAddress("Kumar", "Masna", "Main Road", "Miryalguda", "telangana",
				"India", 508207);
		try {
			testBook.addressList.addNewAddress(singleaddress);
		} catch (DuplicateAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(testBook.addressList.listOfAddress);
		testBook.addressList.removeAddress(singleaddress);
		System.out.println(testBook.addressList.listOfAddress);
		System.out.println(testBook.addressList.toString(singleaddress));

	}
}

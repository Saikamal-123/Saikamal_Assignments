package Assignment2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            FilePersistence fp=new FilePersistence();
            DatabasePersistence dp=new DatabasePersistence();
            fp.persist();
            dp.persist();
            
	}

}

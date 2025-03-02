package app;

public class AppMain {

	public static void main(String[] args) throws Exception {
		DB.connectDB();
		new Login();
	}

}

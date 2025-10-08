
public class MySwingMVCApp {

	public static void main(String[] args) {

		Model m = new Model();
        View v = new View();


		  
        // create scanner
        Scanner s = new Scanner();

        Controller c = new Controller(m, v, s);

        c.initController();
		  

	}

}

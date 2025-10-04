import javax.swing.*;
import java.util.ArrayList;


public class Controller {
	 private Model model;
	 private View view;
     private Scanner scan;
     private ArrayList<Integer> codes;
     private JLabel subTotalOutput;
     private JTextArea productListOutput;

	 
	 public Controller(Model m, View v, Scanner s) {
	  model = m;
	  view = v;
      scan = s;
      codes =  model.getCodes();

      subTotalOutput = view.getSubTotal();
      productListOutput = view.getScannedItems();

	 }

     public void initController() {
         scan.getScanButton().addActionListener(e -> scanProduct());
     }

     public void scanProduct(){

       int randomIndex = (int)(Math.random()*codes.size());

       Product scannedProduct = model.processUPC(codes.get(randomIndex));
       model.addProduct(scannedProduct);

       productListOutput.append(String.format("%-20s $%6.2f\n", scannedProduct.getName(), scannedProduct.getPrice()));
       subTotalOutput.setText(String.format("Subtotal: $%.2f", model.getSubTotal()));


     }


}

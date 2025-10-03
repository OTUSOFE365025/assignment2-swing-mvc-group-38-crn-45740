import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {

    private ArrayList<Product> scannedProducts = new ArrayList<Product>();
    private HashMap<Integer, Product> productLookUp = new HashMap<>();
    private ArrayList<Integer> codes = new ArrayList<Integer>();
    private double subTotal = 0;




    public Model(){
        readFromData();
        codes.addAll(productLookUp.keySet());
    }

    private void readFromData(){
        try (BufferedReader br = new BufferedReader(new FileReader("productInfo.txt"))){
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                line = line.trim();
                String[] parts = line.split("\\s+");
                int code = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2].replace("$", ""));
                productLookUp.put(code, new Product(name, price));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> getCodes() {
        return codes;
    }

    public void scannedProduct(Product product) {
        scannedProducts.add(product);
        subTotal += product.getPrice();
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Product processUPC(int code) {
        return productLookUp.get(code);
    }





	 }


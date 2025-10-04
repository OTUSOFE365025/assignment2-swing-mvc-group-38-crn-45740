import java.awt.*;

import javax.swing.*;

public class View {
    // View uses Swing framework to display UI to user
    private JFrame frame;
    private JLabel titleLabel;
    private JTextArea scannedItems;
    private JScrollPane scroll;
    private JLabel subTotal;



    public View() {
        frame = new JFrame("Cash Register Display");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout(10,10));

        //title
        titleLabel = new JLabel();
        titleLabel.setText("Scanned Items");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);
        frame.setResizable(false);


        //text area
        scannedItems = new JTextArea(3,3);
        scannedItems.setFont(new Font("Monospaced", Font.PLAIN, 14));
        scannedItems.setBackground(Color.white);
        scannedItems.setEditable(false);
        scannedItems.setMargin(new Insets(5, 5, 5, 5));



        scroll = new JScrollPane(scannedItems);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


        scroll.setPreferredSize(new Dimension(250 + 21, 150));



        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.add(scroll);
        frame.add(centerPanel, BorderLayout.CENTER);



        subTotal = new JLabel("Subtotal: $0.00");
        subTotal.setHorizontalAlignment(SwingConstants.CENTER);
        subTotal.setFont(new Font("SansSerif", Font.PLAIN, 14));
        frame.add(subTotal, BorderLayout.SOUTH);








        frame.setVisible(true);
    }

    public JTextArea getScannedItems() {
        return scannedItems;
    }

    public JLabel getSubTotal() {
        return subTotal;
    }
}



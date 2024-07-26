import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Masukkan nama anda :");
        JOptionPane.showMessageDialog(null, "Hallo " + name);
        
        String addres = JOptionPane.showInputDialog("Masukkan Alamat anda :");
        JOptionPane.showMessageDialog(null, "Anda tinggal di " + addres);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Berapakah umur anda :"));
        JOptionPane.showMessageDialog(null, "Umur anda " + age + "Tahun");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog(" Tinggi anda berapa :"));
        JOptionPane.showMessageDialog(null, "tinggi anda " + height+ "Cm");
        
    }
}

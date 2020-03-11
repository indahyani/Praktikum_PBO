//import java.util.Date;
import javax.swing.*;

public class Form extends JFrame{

     JPanel panel = new JPanel();
     final JTextField fname = new JTextField(100);
     JLabel lname = new JLabel("Nama Lengkap : ");
     final JTextField fpanggil = new JTextField(50);
     JLabel lpanggil = new JLabel("Nama Panggil  ");
//     final Date tanggal = new Date();
     final JTextField ftempat = new JTextField(100);
     JLabel ltempat = new JLabel("Tempat lahir ");
     JLabel ljk = new JLabel("Jenis Kelamin ");
     JRadioButton jkPerempuan = new JRadioButton("Perempuan");
     JRadioButton jkPria = new JRadioButton("Laki-laki");
     JLabel lagama = new JLabel ("Agama");
     String[] nAgama = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
     JComboBox cAgama = new JComboBox(nAgama);
     JLabel lprodi = new JLabel("Program study ");
     String[] nprodi = {"Informatika", "Sistem Informasi", "Teknik Industri", "Teknik Kimia"};
     JComboBox cprodi = new JComboBox(nprodi);
     JLabel lhobi = new JLabel("Hobi");
     String[]  nhobi = {"Ngoding", "Mikir","Rajin(Kayak rahul)", "Halu(Seperti rusdi)", "Dan sebagainya"};
     JComboBox chobi = new JComboBox(nhobi); 
     JLabel lstatus = new JLabel("Status :");
     JRadioButton sNikah = new JRadioButton("Nikah");
     JRadioButton sJanda = new JRadioButton("Janda");
     JRadioButton sDuda = new JRadioButton("Duda");
     JRadioButton stinggal = new JRadioButton("Ditinggal Nikah");
     JRadioButton sjomblo = new JRadioButton("jomblo");
     final JTextArea fAlamat = new JTextArea();
     JLabel lAlamat = new JLabel("Alamat");
     
     JButton bSimpan =new JButton("Save");
     JButton bBatal =new JButton("Cancel");
     
    public Form() {
        setTitle("From Data Diri");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(500,700);
        
        ButtonGroup group = new ButtonGroup();
        ButtonGroup group2 = new ButtonGroup();
        group.add(jkPria);
        group.add(jkPerempuan);
        group2.add(sNikah);
         group2.add(stinggal);
          group2.add(sjomblo);
           group2.add(sJanda);
            group2.add(sDuda);
            
        add(lname);
          lname.setBounds(10,10,100,20);
        add(fname);
         fname.setBounds(150,10,250,20);
        add(lpanggil);
         lpanggil.setBounds(10,40,100,20);
        add(fpanggil);
         fpanggil.setBounds(150,40,250,20); 
        add(ltempat);
         ltempat.setBounds(10,70,100,20);
        add(ftempat);
        ftempat.setBounds(150,70,250,20);
        add(ljk);
        ljk.setBounds(10,100,100,20);
        add(jkPerempuan);
        jkPerempuan.setBounds(150,100,100,20);
        
        add(jkPria);
        jkPria.setBounds(260,100,100,20);
        
        add(lagama);
        lagama.setBounds(10,130,100,20);
        
        add(cAgama);
        cAgama.setBounds(150,130,100,20);
       
        add(lhobi);
         lhobi.setBounds(10,160,100,20);
        
        add(chobi);
        chobi.setBounds(150,160,100,20);
        
        add(lstatus);
        lstatus.setBounds(10,190,100,20);
       
        add(sNikah);
         sNikah.setBounds(150,190,100,20);
       
        add(sJanda);
         sJanda.setBounds(260, 190, 100, 20);
        
        add(sDuda);
        sDuda.setBounds(150,220,100,20);
        
        add(stinggal);
        stinggal.setBounds(260,220,100,20);
        
        add(sjomblo);
        sjomblo.setBounds(150,250,100,20);
       
        add(lAlamat);
        lAlamat.setBounds(10,280, 100, 20);
        
        add(fAlamat);
         fAlamat.setBounds(150, 280,100,20);
        
        
        
        add(bSimpan);
        bSimpan.setBounds(100,360,100,20);
       
        add(bBatal);
         bBatal.setBounds(220,360,100,20);
        
      
       
       
        
       
        
        
        
       
        
    }
    
}

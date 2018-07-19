import javax.swing.JOptionPane;

public class Paythagoras {

	public static double a;
	public static double b;
	public static double c;
	public static void getData()
	{
			a=Double.parseDouble(JOptionPane.showInputDialog("Enter Value For A "));
			b=Double.parseDouble(JOptionPane.showInputDialog("Enter Value For B"));
	}
	public static void calcData()
	{
		c=Math.sqrt(Math.abs(a*a)+Math.abs(b*b));
		displayWhatever(c);
	}
	public static void displayWhatever(double ans)
	{
		JOptionPane.showMessageDialog(null, "Answer IS "+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chs=JOptionPane.showConfirmDialog(null, "Welcome to Paythagoras Theoram Calculator");
		if(chs==1)
		{
			JOptionPane.showMessageDialog(null, "You Wish to Not Continue");
			return;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Let's Begin !");
		}
		Paythagoras.getData();
		Paythagoras.calcData();

	}

}

using Gdk;
using Gtk;
using System;
using System.Collections.Generic;

using CBingo;

public partial class MainWindow: Gtk.Window
{
	private static Color COLOR_GREEN = new Gdk.Color (0, 255, 0);
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();

		Panel panel = new Panel (vBoxMain);
		Bombo bombo = new Bombo ();

		buttonAdelante.Clicked+=delegate {
			int bola = Bombo.SacarBola();
			panel.MarcarNumero(bola);

			//nuevo
			buttonAdelante.Sensitive = bombo.QuedanBolas();
		}
//		List<Button> buttons = new List<Button> ();
//
//		Table table = new Table (9, 10,true);//9=filas, 10=columnas y true significa que las celdas son de tamaño homogéneo
//		for (int index = 0 ; index < 90 ; index++){
//			Button button = new Button ();
//			button.Label= ( index + 1).ToString();
//			button.Visible = true;
//			uint row = (uint)(index / 10) ; 
//			uint column = (uint)(index % 10);
//			table.Attach (button, column, column +1,row, row + 1);
//			buttons.Add (button);
//		}
//
//		//		for (uint row=0; row <9; row++)
//		//			for (uint column=0;column<10;column++){
//		//				int index =(int)(row*10 + column);
//		//				Button button =new Button();
//		//				button.Label = (index + 1).ToString();
//		//				button.Visible=true;
//		//				table.Attach (button,column,column +1,row, row+1);
//		//
//		//	}
//
//		table.Visible=true;
//		vBoxMain.Add (table);
//
//		List<int> bolas = new List<int> ();
//		for (int bola = 1; bola <= 90; bola++)
//			bolas.Add (bola);
//		//buttonAdelante.ModifyBg(StateType.Normal, COLOR_GREEN);
//		Random random = new Random();
//		buttonAdelante.Clicked += delegate {
//			int indexAleatorio = random.Next(bolas.Count); 
//			int bola=bolas[indexAleatorio];
//			bolas.Remove(bola);
//			int indexPanel = bola - 1;
//			buttons[indexPanel].ModifyBg(StateType.Normal, COLOR_GREEN);
//
//			System.Diagnostics.Process.Start("espeak","-v es " + bola); //instalar espeak con sudo
//		};
//		buttonAdelante.ModifyBg(StateType.Normal,COLOR_GREEN);
//
}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
//intentar hacer al menos con métodos separados 
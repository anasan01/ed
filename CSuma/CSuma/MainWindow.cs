using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
		buttonSuma.Clicked += delegate {
			labelResultado.Text= entryNumero1.Text+entryNumero2.Text;
		};
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}

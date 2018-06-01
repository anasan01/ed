using System;
using Gtk;

public partial class MainWindow:Gtk.Window{
	public MainWindow() : base (Gtk.WindowType.Toplevel){
		Build();
		//matrizButtons.GetButton (1,1).Label="Uno,Uno";
		matrizButtons[1,1].Label ="uno x uno";
	}
	protected void
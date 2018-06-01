using System;
using Gtk;
using System.Collections.Generic;

namespace CComponents{
	
	[System.ComponentModel.ToolboxItem (true)]
	public partial class MatrizButtons: Gtk.Bin
	{
		private int rows = 3;
		private int columns = 3;

		private List<Button> buttons = new List<Button>();

		public MatrizButtons(){
			Build();
			refresh();

		}
		private void refresh(){
			if (Child != null)
				Remove (Child);
			
			buttons.Clear ();

			Table table = new Table ((Unit)rows, (Unit)columns, true);
			for (uint column =0; row <rows; row++)
				for (uint column=0; column<columns; column++){
					Button button = new Button();
					table.Attach(button, column, column + 1, row, row +1);
					buttons.Add(button);
				}
			Add (table);
			ShowAll();
			foreach(Button button in buttons)
				button.Label=""+ ++index;
		}	
		[System.ComponentModel.DefaultValue(3)]
		public int Rows{
			get{ return rows; }
			set{
				rows=value;
				refresh ();
			}
		}

		[System.ComponentModel.DefaultValue(3)]
		public int Columns{
			get{ return columns; }
			set{
				columns=value;
				refresh ();
			}
		}

//		public Button GetButton(int row, int column){
//			int index = (row - 1) * columns + (column - 1);
//			return buttons[index];
//		}
		public Button this[int row, int column]{
			get{
				int index = (row - 1) * columns + (column - 1);
				return buttons [index];
			}

	}

}


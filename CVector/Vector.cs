using System;

namespace CVector
{
	public class Vector
	{
		public static void Sort (int[] v){

		}
		/// <summary>
		/// Obtiene el indice del elemento con el valor minimo
		/// Indexs the minimum.
		/// </summary>
		/// <returns>The minimum.</returns>
		/// <param name="v">V.</param>
		/// <param name="initialIndex">Initial index.</param>


		public static int IndexMin(int[]v, int initialIndex){
			if (initialIndex >= v.Length)
				throw new IndexOutOfRangeException ();
			int indexMin = initialIndex;
			for (int index = initialIndex + 1; index < v.Length; index++)
				if (v [index] < v [indexMin])
					indexMin = index;
			return indexMin;
		}
		/// <summary>
		/// Intercambia en el vector los elementos index y otherIndex
		/// </summary>
		/// <param name="v">v vector a modificar</param>
		/// <param name="index">El indice de un elemento</param>
		/// <param name="otherIndex"><Otro indice</param>
		public static void Swap(int[]v, int index, int otherIndex){
		}
	}
}

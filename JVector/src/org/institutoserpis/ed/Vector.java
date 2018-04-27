package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int[] v= new int[] {9,15,7,12,6};
		//para que salte la línea pondríamos v[%s]/n
		for (int index=0; index< 5 ;index++)
			System.out.printf("v[%s]=%s ",index, v[index]);
		System.out.println();
		//propongamos un ejercicio para buscar el valor x dentro del vector y que nos devuelva su posición.
		//siempre el recorrido será de izq a decha y nos dirá la primera vez que aparezca.
		//si el número no se encuentra queremos que nos devuelva -1.(ninguna de las posiciones:0,1,2,3,4)
		int value = 6;
		
		int position= indexOf (v, value);
		System.out.println("position= "+position);
		int min= min(v);
		System.out.println("min="+ min);
	//Arrays.binarySearch(v,7);
	
	}
	//esto sería el método, podemos haerlo sin él con una condición doble en el while &&
		public static int indexOf (int[] v, int value) {
//			int index=0;
//			while(index<v.length && v[index]!=value)//si damos la vuelta al while no funcionará si el valor
//				                                    //no estuviera en el vector ej value =33
//				index++;
//			//if(index ==v.length)
//			//  index++; esta sería otra opción
//			if(index==v.length)
//				return -1;
//			//else es opcional (un if con un return tiene un else implícito)
// 				return index;
//			for (int index = 0; index < v.length; index++)
//				if(v[index] == value)
//					return index;
//			return -1;
			
		int index=0;
		while(index <v.length && v[index]!= value )
			index++;
		return index <v.length ? index :-1;
		}
		public static int min(int[] v) {
//			 int min=v[0];
//			 for(int index=1;index<v.length; index++)
//				 if(v[index]<min)
//					 min=v[index];
//			return min; 
			int min = v[0];
			for(int item :v)
				if(item < min)
					min = item;
			return min;
		}
		
		public static int sum(int[]v) {
			int sum=0;
//			for(int index=0; index < v.length; index++)
//				sum=sum + v[index];
			for(int item:v)
				sum = sum + item;
			return sum;
		}
		
		public static int indexOfMin(int[]v) {
			int indexOfMin = 0;
			for (int index = 1; index < v.length; index++)
				if(v[index]< v[indexOfMin]) 
					indexOfMin = index;
			return indexOfMin;
		}
		
		public static void selectionSort(int[]v) {
			int selectedIndex = 0;
			int indexOfMin = selectedIndex;
			//for (int index = selectedIndex + 1; index < v.length; index++)
				//if(v[1]<v[])
			
		}
}

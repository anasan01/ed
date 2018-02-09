using System;
using NUnit.Framework;

namespace CVector{
	[TestFixture]
	public class VectorTest{
		[Test]
		public void Sort(){
			int[] v = { 12, 9, 15, 7, 13 };
			Vector.Sort (v);
			CollectionAssert.AreEqual
		}
	}
}


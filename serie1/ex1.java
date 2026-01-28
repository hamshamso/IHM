package serie1;

class Vecteur3d{ 
	private double x, y, z ; //les coordonnées du vecteur
	public Vecteur3d (double x, double y, double z){ //Constructor
		this.x = x ;//القيمة لي بعثتها في البرامتر. 
		this.y = y ; //this.x = المتغير الداخلي
		this.z = z ;
	}
	
	public void affiche (){ 
		System.out.println ("< " + x + ", " + y + ", " + z + " >") ;
	}
	
	public double norme (){ //حساب طول المتّجه
		return (Math.sqrt (x*x + y*y + z*z)) ;//||v|| = √(x² + y² + z²)            
	}
    //static → الدالة تابعة للـ class ليس للـ object.
	//كيكون تابع للكلاس تقدر دير 
	//className.method();
	public static Vecteur3d somme(Vecteur3d v, Vecteur3d w){
		Vecteur3d s = new Vecteur3d (0, 0, 0) ;
		s.x = v.x + w.x ;
	    s.y = v.y + w.y ;
	    s.z = v.z + w.z ;
		return s ;
	}
	
	public double pScal (Vecteur3d v){
		return (x*v.x + y*v.y + z*v.z) ;
        //x يمثل متغير الـ object الحالي (اللي راهي الدالة خدامة عليه)
        //v.x يمثل متغير الـ object الآخر اللي مرّرته كـ parameter للدالة.
        //exemple : v1.pScal(v2);
        //v1 object الحالي
        //v2 هو اللي راك مرّرتو بارامتر 
    	}
	}
	public class ex1{ 
		public static void main (String args[]){	
		Vecteur3d v1 = new Vecteur3d (3, 2, 5) ;
		Vecteur3d v2 = new Vecteur3d (1, 2, 3) ;
		Vecteur3d v3 ;
		
		System.out.print ("v1 = " ) ; v1.affiche() ;
		System.out.print ("v2 = " ) ; v2.affiche() ;
		v3 = Vecteur3d.somme (v1, v2) ;
		System.out.print ("v1 + v2 = " ) ; v3.affiche() ;
		System.out.println ("v1.v2 = " + v1.pScal(v2)) ; // ou
		v2.pScal(v1);
		}
	}
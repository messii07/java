interface Area{
void Areacompute(float x, float y);
}
class Rectangle implements Area
{
	Rectangle(){
		System.out.println("Rectangle constructor called");
	}
	public void Areacompute(float x, float y){
		System.out.println(x*y);
	}
}
class circle implements Area{
		circle(){
			System.out.println("circle constructor called");
		}
		public void Areacompute(float x, float y){
		System.out.println(3.14*x*x);
	}
}
public class IInterface735{
public static void main(String s1[])
{
	Rectangle r = new Rectangle();
	r.Areacompute(2,4);
	circle d = new circle();
	d.Areacompute(2,0);
}
}

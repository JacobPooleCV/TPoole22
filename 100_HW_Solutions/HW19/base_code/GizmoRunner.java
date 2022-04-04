import pkg.*;

public class GizmoRunner
{
   public static void main(String args[])
	{
		Gizmo gz = new Gizmo( "sony", true );
		System.out.println( gz.getMaker() );
		System.out.println( gz.isElectronic() );
		System.out.println( gz.getMaker() );
		System.out.println( gz );	
			
		Gizmo et = new Gizmo( "aplus", false );	
		System.out.println( et );
										
		System.out.println( et.equals( gz ) );	
			
		Gizmo at = new Gizmo( "sony", true );
		System.out.println( at );
			
		System.out.println( at.equals( gz ) );																															
	} 
}
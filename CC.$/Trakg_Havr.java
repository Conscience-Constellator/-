package CC.$;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=false)
public class Trakg_Havr<Trak_Typ>
{
	public Trak_Typ
		Trak_A,
		Trak_B;
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public void Set_Trakg(
			Trak_Typ A,
			Trak_Typ B)
		{
			Trak_A=A;
			Trak_B=B;
		}

	@Finishd(Is_Finishd=true)
	public Trakg_Havr(
		Trak_Typ A,
		Trak_Typ B)
	{Set_Trakg(A,B);}
}